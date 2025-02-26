package com.example;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;

import java.io.IOException;
import java.sql.*;

public class JsonFromDatabase {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/employees_db"; 
        String username = "krishna_12"; 
        String password = "Kh6jf";
        String jsonFile = "employees_report.json"; 

        String query = "SELECT id, name, age, department FROM employees"; 

        try (Connection conn = DriverManager.getConnection(jdbcURL, username, password);
             Statement stmt = conn.createStatement();
             ResultSet resultSet = stmt.executeQuery(query)) {

            ObjectMapper objectMapper = new ObjectMapper();
            ArrayNode jsonArray = objectMapper.createArrayNode();

            while (resultSet.next()) {
                ObjectNode jsonObject = objectMapper.createObjectNode();
                jsonObject.put("id", resultSet.getInt("id"));
                jsonObject.put("name", resultSet.getString("name"));
                jsonObject.put("age", resultSet.getInt("age"));
                jsonObject.put("department", resultSet.getString("department"));

                jsonArray.add(jsonObject);
            }

            objectMapper.writeValue(new File(jsonFile), jsonArray);
            System.out.println("JSON report generated: " + jsonFile);

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}