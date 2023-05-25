package Lab8.Strategy;

import java.awt.*;

public class ResizeImageStrategy implements ImageProcessingStrategy {
    private int width;
    private int height;

    public ResizeImageStrategy(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void processImage(Image image) {
        System.out.println("Изменили");

    }
}
