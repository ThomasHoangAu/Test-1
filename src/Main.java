/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoang
 */
//import com.opencsv.exceptions.CsvValidationException;
//import java.io.IOException;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        if (args.length == 0) {
//            System.err.println("Please provide the path to the CSV file as an argument.");
//            System.exit(1);
//        }
//
//        String filePath = args[0];
//        try {
//            List<Record> records = CsvParser.parseCsv(filePath);
//            List<Record> topRecords = RecordProcessor.getTopRecords(records);
//            String yamlOutput = YamlFormatter.toYaml(topRecords);
//            System.out.println(yamlOutput);
//        } catch (IOException | CsvValidationException e) {
//            System.err.println("An error occurred while processing the CSV file: " + e.getMessage());
//        }
//    }
//}


import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Parse CSV file
            CsvParser parser = new CsvParser();
            List<Record> records = parser.parse();

            // Process records to get top
            RecordProcessor processor = new RecordProcessor();
            List<Record> topRecords = processor.getTopRecords(records);

            // Format records to YAML
            YamlFormatter formatter = new YamlFormatter();
            String yamlOutput = formatter.toYaml(topRecords);

            // Print YAML output to console
            System.out.println(yamlOutput);
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
