package Lab8.Strategy;

import java.awt.*;

public class CropImageStrategy implements ImageProcessingStrategy {
    private int x;
    private int y;
    private int width;
    private int height;

    public CropImageStrategy(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void processImage(Image image) {
        System.out.println("Кадрировали");
    }
}
