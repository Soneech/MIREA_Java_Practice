package practice23_24.task2;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class HTMLParser {
    private static final String url = "https://www.mirea.ru";

    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect(url).get();
        Elements images = document.select("img");

        for (Element image: images) {
            String absUrl = image.attr("abs:src");
            String[] parts = absUrl.split("/");
            String imageName = parts[parts.length - 1];

            try {
                InputStream inputStream = new URL(absUrl).openStream();
                Files.copy(
                        inputStream,
                        Paths.get("D:\\MIREA\\COURSE_2\\Java\\MireaJavaPractice\\src\\main\\images\\" + imageName),
                        StandardCopyOption.REPLACE_EXISTING);
                System.out.println(imageName);
            } catch (Exception exception) {
                //System.out.println("Image not found! Message: " + exception.getMessage());
            }
        }
    }
}
