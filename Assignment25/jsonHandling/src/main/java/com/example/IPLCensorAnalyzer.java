import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class IPLCensorAnalyzer {

    public static void main(String[] args) throws IOException {
        String jsonInputPath = "ipl_matches.json";
        String jsonOutputPath = "ipl_matches_censored.json";
        String csvInputPath = "ipl_matches.csv";
        String csvOutputPath = "ipl_matches_censored.csv";

        processJson(jsonInputPath, jsonOutputPath);
        processCsv(csvInputPath, csvOutputPath);
    }

    private static void processJson(String inputPath, String outputPath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode root = objectMapper.readTree(new File(inputPath));

        if (root.isArray()) {
            for (JsonNode node : root) {
                ((ObjectNode) node).put("team1", maskTeamName(node.get("team1").asText()));
                ((ObjectNode) node).put("team2", maskTeamName(node.get("team2").asText()));
                ((ObjectNode) node).put("winner", maskTeamName(node.get("winner").asText()));
                ((ObjectNode) node).put("player_of_match", "REDACTED");
            }
        }

        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(outputPath), root);
        System.out.println("Censored JSON data saved to " + outputPath);
    }

    private static void processCsv(String inputPath, String outputPath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(inputPath));
        List<String> modifiedLines = lines.stream().map(line -> {
            if (line.startsWith("match_id")) return line; // Keep header
            String[] parts = line.split(",");
            parts[1] = maskTeamName(parts[1]); // team1
            parts[2] = maskTeamName(parts[2]); // team2
            parts[5] = maskTeamName(parts[5]); // winner
            parts[6] = "REDACTED"; // player_of_match
            return String.join(",", parts);
        }).collect(Collectors.toList());

        Files.write(Paths.get(outputPath), modifiedLines);
        System.out.println("Censored CSV data saved to " + outputPath);
    }

    private static String maskTeamName(String teamName) {
        if (teamName.contains(" ")) {
            int spaceIndex = teamName.lastIndexOf(" ");
            return teamName.substring(0, spaceIndex) + " ***";
        }
        return teamName;
    }
}