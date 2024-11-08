/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

/**
 *
 * @author hoang
 */
public class CsvParserTest {
    
    /**
     * Test of parse method, of class CsvParser.
     * @throws java.lang.Exception
     */
    @Test
    public void testParse() throws Exception {
        // Initialize CsvParser
        CsvParser parser = new CsvParser();
        
        // Get records
        List<Record> records = parser.parse();
        
        // Check that two records are parsed
        assertEquals(10, records.size());
        
        // Validate data of the first record
        assertEquals("Terza", records.get(0).getFirstName());
        assertEquals(1, records.get(0).getDivision());
        
        // Validate data of the second record
        assertEquals("Kayle", records.get(1).getFirstName());
        assertEquals(9, records.get(1).getDivision());

    }
}

