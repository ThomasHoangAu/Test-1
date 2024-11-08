/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author hoang
 */
public class RecordProcessorTest {

    /**
     * Test of getTopRecords method, of class RecordProcessor.
     */
     @Test
    public void testGetTopRecords() {
        // Create sample Record data
        Record r1 = new Record("John", "Doe", "2023-01-01", 1, 80, "Sample Duty");
        Record r2 = new Record("Jane", "Doe", "2023-02-01", 1, 90, "Another Duty");
        Record r3 = new Record("Jim", "Beam", "2023-03-01", 2, 70, "Different Duty");
        Record r4 = new Record("Jack", "Daniels", "2023-04-01", 2, 60, "Some Duty");

        // Initialize RecordProcessor and get top records
        RecordProcessor processor = new RecordProcessor();
        List<Record> topRecords = processor.getTopRecords(Arrays.asList(r1, r2, r3, r4));

        // Assert we only have the top 3 records
        assertEquals(3, topRecords.size());

        // Validate that records are sorted by division and points
        assertEquals(r2, topRecords.get(0)); // Highest in division 1
        assertEquals(r1, topRecords.get(1)); // Second in division 1
        assertEquals(r3, topRecords.get(2)); // Highest in division 2
    }
    
}
