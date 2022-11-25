package practice23_24.task1;


import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {
    private static final String filePath =
            "D:\\MIREA\\COURSE_2\\Java\\MireaJavaPractice\\src\\main\\resources\\movementList.csv";

    public static void main(String[] args) throws IOException, CsvException {
        CSVReader csvReader = new CSVReader(new FileReader(filePath));
        List<String[]> records = csvReader.readAll();

        CSVParser csvParser = new CSVParser();

        for (int i = 1; i < records.size(); i++) {
            csvParser.calculateMoneyData(records.get(i));
        }
        csvParser.printData();
    }
}
