package Lab8;



import Lab8.Command.Light;
import Lab8.Command.LightOffCommand;
import Lab8.Command.LightOnCommand;
import Lab8.Command.RemoteControl;
import Lab8.Strategy.CropImageStrategy;
import Lab8.Strategy.Image;
import Lab8.Strategy.ImageProcessingStrategy;
import Lab8.Strategy.ImageProcessor;
import Lab8.Strategy.ResizeImageStrategy;

import java.awt.*;

public class Start {
    public static void main(String[] args) {
        ImageProcessor processor = new ImageProcessor();
        processor.setImage(new Image("image.png"));

        ImageProcessingStrategy processingStrategy = new ResizeImageStrategy(800, 600);
        processor.processImage(processingStrategy);

        processingStrategy = new CropImageStrategy(100, 100, 400, 400);
        processor.processImage(processingStrategy);

        RemoteControl remote = new RemoteControl();
        Light light = new Light();

        remote.setCommand(new LightOnCommand(light));
        remote.buttonPressed();

        remote.setCommand(new LightOffCommand(light));
        remote.buttonPressed();
    }
}
