package com.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class ReadJsonKeyValue {
    public static void main(String[] args) {
        String jsonFile = "sample.json";

        try {
            
            ObjectMapper objectMapper = new ObjectMapper();

            JsonNode jsonNode = objectMapper.readTree(new File(jsonFile));
            
            Iterator<Map.Entry<String, JsonNode>> fields = jsonNode.fields();
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> entry = fields.next();
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}