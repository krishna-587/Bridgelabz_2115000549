import java.io.*;
public class comparefileOperation {

    public static void main(String[] args) {
        String filePath = "test.txt"; 

        compareStringBuilderStringBuffer();
        try {
            compareFileReading(filePath);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    private static void compareStringBuilderStringBuffer() {
        String baseString = "hello";

        long startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            stringBuilder.append(baseString);
        }
        long endTime = System.nanoTime();
        System.out.println("Time taken with StringBuilder: " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 1000000; i++) {
            stringBuffer.append(baseString);
        }
        endTime = System.nanoTime();
        System.out.println("Time taken with StringBuffer: " + (endTime - startTime) + " nanoseconds");
    }

    private static void compareFileReading(String filePath) throws IOException {
        long startTime = System.nanoTime();
        int wordCountFileReader = countWordsWithFileReader(filePath);
        long endTime = System.nanoTime();
        System.out.println("FileReader word count: " + wordCountFileReader);
        System.out.println("Time taken with FileReader: " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        int wordCountInputStreamReader = countWordsWithInputStreamReader(filePath);
        endTime = System.nanoTime();
        System.out.println("InputStreamReader word count: " + wordCountInputStreamReader);
        System.out.println("Time taken with InputStreamReader: " + (endTime - startTime) + " nanoseconds");
    }

    private static int countWordsWithFileReader(String filePath) throws IOException {
        int wordCount = 0;
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                wordCount += countWordsInLine(line);
            }
        }
        return wordCount;
    }

    private static int countWordsWithInputStreamReader(String filePath) throws IOException {
        int wordCount = 0;
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath), "UTF-8");
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                wordCount += countWordsInLine(line);
            }
        }
        return wordCount;
    }

    private static int countWordsInLine(String line) {
        String[] words = line.split("\\s+");
        return words.length;
    }
}
