/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoang
 */
//import com.opencsv.CSVReader;
//import com.opencsv.exceptions.CsvValidationException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.Reader;
//import java.util.ArrayList;
//import java.util.List;

//public class CsvParser {
//    // Parses the CSV content from a Reader and returns a list of Record objects
//    public static List<Record> parseCsv(String filePath) throws IOException, CsvValidationException {
//        List<Record> records = new ArrayList<>();
//        // Try to read the input file
//        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
//            reader.readNext();
//            String[] line;
//            // Parse each line into a Record object
//            while ((line = reader.readNext()) != null) {
//                String firstname = line[0];
//                String lastname = line[1];
//                String date = line[2];
//                int division = Integer.parseInt(line[3]);
//                int points = Integer.parseInt(line[4]);
//                String summary = line[5];
//                records.add(new Record(firstname, lastname, date, division, points, summary));
//            }
//        // Catch the error if it happens    
//        }catch (IOException e) {
//            System.err.println("Error reading CSV file: " + e.getMessage());
//        }
//        return records;
//    }
//}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CsvParser {
    String FILE_PATH = "src/input.csv";
    
    // Parses the CSV content from a Reader and returns a list of Record objects
    public List<Record> parse() throws Exception {
        List<Record> records = new ArrayList<>();
        Reader reader = new FileReader(FILE_PATH);
        BufferedReader br = new BufferedReader(reader);
            
        // Skip header line
        br.readLine();
        
        // Parse each line into a Record object
        String line;
        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line, ",");
            String firstName = st.nextToken();
            String lastName = st.nextToken();
            String date = st.nextToken();
            int division = Integer.parseInt(st.nextToken());
            int points = Integer.parseInt(st.nextToken());
            String summary = st.nextToken();

            Record record = new Record(firstName, lastName, date, division, points, summary);
            records.add(record);
        }
        return records;
    }
}

