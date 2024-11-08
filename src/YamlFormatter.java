/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoang
 */
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.nodes.Tag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YamlFormatter {
    // Converts a list of Records to YAML format
    public String toYaml(List<Record> topRecords) {
        List<Map<String, String>> yamlRecords = new ArrayList<>();
        for (Record record : topRecords) {
            Map<String, String> yamlRecord = new HashMap<>();
            yamlRecord.put("name", record.getFirstName() + " " + record.getLastName());
            yamlRecord.put("details", "In division " + record.getDivision() + " from " +
                    record.getDate() + " performing " + record.getSummary());
            yamlRecords.add(yamlRecord);
        }
        Map<String, Object> output = new HashMap<>();
        output.put("records", yamlRecords);

        // Use DumperOptions class to customize the YAML output
        DumperOptions options = new DumperOptions();
        options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
        Yaml yaml = new Yaml(options);
        return yaml.dumpAs(output, Tag.MAP, DumperOptions.FlowStyle.BLOCK);
    }
}

