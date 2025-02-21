import java.io.*;

public class BufferedStreams {
    private static final int BUFFER_SIZE = 4096;

    public static void main(String[] args) {
        String sourceFile = "largefile.txt"; 
        String destBuffered = "copy_buffered.txt";
        String destUnbuffered = "copy_unbuffered.txt";

        long startBuffered = System.nanoTime();
        copyFileWithBuffer(sourceFile, destBuffered);
        long endBuffered = System.nanoTime();
        long bufferedTime = endBuffered - startBuffered;
        System.out.println("Buffered Stream Copy Time: " + (bufferedTime / 1_000_000) + " ms");

        long startUnbuffered = System.nanoTime();
        copyFileWithoutBuffer(sourceFile, destUnbuffered);
        long endUnbuffered = System.nanoTime();
        long unbufferedTime = endUnbuffered - startUnbuffered;
        System.out.println("Unbuffered Stream Copy Time: " + (unbufferedTime / 1_000_000) + " ms");

        System.out.println("Performance Improvement: " + (double) unbufferedTime / bufferedTime + "x faster with Buffered Streams.");
    }

    private static void copyFileWithBuffer(String source, String destination) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully using Buffered Streams.");

        } catch (IOException e) {
            System.out.println("Error during buffered copy: " + e.getMessage());
        }
    }

    private static void copyFileWithoutBuffer(String source, String destination) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File copied successfully using Unbuffered Streams.");

        } catch (IOException e) {
            System.out.println("Error during unbuffered copy: " + e.getMessage());
        }
    }
}
