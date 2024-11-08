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
public class YamlFormatterTest {
    
    /**
     * Test of toYaml method, of class YamlFormatter.
     */
    @Test
    public void testToYaml() {
        // Sample data
        Record r1 = new Record("John", "Doe", "2024-01-01", 1, 80, "Sample Duty");
        Record r2 = new Record("Jane", "Doe", "2024-02-01", 1, 90, "Another Duty");

        List<Record> topRecords = Arrays.asList(r1, r2);

        // Format to YAML
        YamlFormatter formatter = new YamlFormatter();
        String yamlOutput = formatter.toYaml(topRecords);

        // Check if YAML output contains expected strings
        assertTrue(yamlOutput.contains("name: John Doe"));
        assertTrue(yamlOutput.contains("In division 1 from 2024-01-01 performing Sample Duty"));
        assertTrue(yamlOutput.contains("name: Jane Doe"));
        assertTrue(yamlOutput.contains("In division 1 from 2024-02-01 performing Another Duty"));
    }
    
}
