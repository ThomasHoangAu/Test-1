/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoang
 */
//import java.util.Comparator;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class RecordProcessor {
//    // Sorts the records by division and points and returns the top three
//    public static List<Record> getTopRecords(List<Record> records) {
//        return records.stream()
//                .sorted(Comparator.comparing(Record::getDivision)
//                .thenComparing(Record::getPoints, Comparator.reverseOrder()))
//                .limit(3)
//                .collect(Collectors.toList());
//    }
//}

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RecordProcessor {
    long TOP_RECORDS = 3;
    
    // Sorts the records by division and points and returns the top three
    public List<Record> getTopRecords(List<Record> records) {
        return records.stream()
            .sorted(Comparator.comparing(Record::getDivision)
            .thenComparing(Record::getPoints, Comparator.reverseOrder()))
            .limit(TOP_RECORDS)
            .collect(Collectors.toList());
    }
}


