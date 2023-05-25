package Lab8.Strategy;

import java.awt.*;

public class ImageProcessor {
    private Image image;

    public void setImage(Image image) {
        this.image = image;
    }

    public void processImage(ImageProcessingStrategy processingStrategy) {
        processingStrategy.processImage(image);
    }
}
