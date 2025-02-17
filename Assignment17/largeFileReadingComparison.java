import java.io.*;

public class largeFileReadingComparison {
    
    public static long measureTime(Runnable function) {
        long startTime = System.nanoTime();
        function.run();
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000;
    }

    public static void readFileUsingFileReader(String filePath) {
        try (FileReader fr = new FileReader(filePath)) {
            while (fr.read() != -1) {}
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFileUsingInputStreamReader(String filePath) {
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath))) {
            while (isr.read() != -1) {}
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String filePath = "file.txt";

        long fileReaderTime = measureTime(() -> readFileUsingFileReader(filePath));
        long inputStreamReaderTime = measureTime(() -> readFileUsingInputStreamReader(filePath));

        System.out.println("Large File Reading Performance:");
        System.out.println("FileReader Time: " + fileReaderTime + " ms");
        System.out.println("InputStreamReader Time: " + inputStreamReaderTime + " ms");
    }
}
