package practice25_26;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;


public class MetroData {
    private static final String url = "https://www.moscowmap.ru/metro.html#lines";
    private static final String filePath =
            "D:\\MIREA\\COURSE_2\\Java\\MireaJavaPractice\\src\\main\\resources\\metro.json";

    public static void main(String[] args) throws IOException {
        createJson();
        readJson();
    }

    public static void createJson() {
        try {
            Document document = Jsoup.connect(url).maxBodySize(0).get();

            Elements lines = document.getElementsByClass("js-metro-line");
            Elements stationsDivs = document.getElementsByClass("js-metro-stations");

            JsonObject jsonData = new JsonObject();
            jsonData.add("stations", new JsonObject());
            jsonData.add("lines", new JsonArray());

            for (Element line: lines) {
                JsonObject lineObject = new JsonObject();
                lineObject.addProperty("number", line.attr("data-line"));
                lineObject.addProperty("name", line.text());

                jsonData.getAsJsonArray("lines").add(lineObject);
            }

            for (Element stations: stationsDivs) {
                String lineNumber = stations.attr("data-line");

                jsonData.getAsJsonObject("stations").add(lineNumber, new JsonArray());

                Elements stationsNames = stations.select("p > a > .name");
                for (Element station: stationsNames) {
                    jsonData.getAsJsonObject("stations").getAsJsonArray(lineNumber).add(station.text());
                }
            }

            FileOutputStream out = new FileOutputStream(filePath);
            out.write(jsonData.toString().getBytes());
            out.close();

        } catch (IOException exception) {
            System.out.println("unable parse html-document. Message: " + exception.getMessage());
        }

    }

    public static void readJson() throws IOException {
        Reader reader = Files.newBufferedReader(Paths.get(filePath));
        JsonObject jsonObject = JsonParser.parseReader(reader).getAsJsonObject();

        JsonObject stationsOfLines = jsonObject.getAsJsonObject("stations");

        Iterator<String> keys = stationsOfLines.keySet().iterator();
        while(keys.hasNext()) {
            String lineName = keys.next();
            System.out.println("Линия: " + lineName);

            JsonArray stations = stationsOfLines.getAsJsonArray(lineName);
            System.out.println("Кол-во станций: " + stations.size());
        }
    }
}
