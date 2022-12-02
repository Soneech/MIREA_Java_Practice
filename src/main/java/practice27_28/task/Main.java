package practice27_28.task;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    private static final String PATH = "D:\\MIREA\\COURSE_2\\Java\\MireaJavaPractice\\src\\main\\resources\\cats";

    public static void reduceImage(File file, String reducedPath) {
        try {
            BufferedImage image = ImageIO.read(file);

            int newWidth = image.getWidth() / 2;
            int newHeight = image.getHeight() / 2;

            BufferedImage newImage = new BufferedImage(
                    newWidth, newHeight, BufferedImage.TYPE_INT_RGB
            );

            int widthStep = image.getWidth() / newWidth;
            int heightStep = image.getHeight() / newHeight;

            for (int x = 0; x < newWidth; x++)
            {
                for (int y = 0; y < newHeight; y++) {
                    int rgb = image.getRGB(x * widthStep, y * heightStep);
                    newImage.setRGB(x, y, rgb);
                }
            }

            File newFile = new File(reducedPath + "\\" + file.getName());
            ImageIO.write(newImage, "jpg", newFile);
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

    }

    public static void reduceImage() {
        String originalsPath = PATH + "\\original";
        String reducedPath = PATH + "\\reduce";

        File originalsDir = new File(originalsPath);
        File[] files = originalsDir.listFiles();

        assert files != null;
        for (final File file: files) {
            if (Runtime.getRuntime().availableProcessors() != 0) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        reduceImage(file, reducedPath);
                    }
                }).start();
            }
            else {
                reduceImage(file, reducedPath);
            }
        }

    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        reduceImage();
        System.out.println("Duration: " + (System.currentTimeMillis() - start) + "ms");
    }
}
