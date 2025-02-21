import java.io.*;
import java.nio.file.Files;

public class ByteArrayStream {
    public static void main(String[] args) {
        String sourceImage = "source.jpg";  
        String destinationImage = "copy.jpg";

        try {
            byte[] imageData = convertImageToByteArray(sourceImage);

            writeByteArrayToImage(imageData, destinationImage);

            System.out.println("Image successfully converted to byte array and saved back as " + destinationImage);
            
            if (verifyFiles(sourceImage, destinationImage)) {
                System.out.println("Verification: The copied image is identical to the original.");
            } else {
                System.out.println("Verification: The copied image differs from the original.");
            }

        } catch (IOException e) {
            System.out.println("Error handling the image file: " + e.getMessage());
        }
    }

    private static byte[] convertImageToByteArray(String imagePath) throws IOException {
        File file = new File(imagePath);
        try (FileInputStream fis = new FileInputStream(file);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[4096]; 
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            return baos.toByteArray();
        }
    }

    private static void writeByteArrayToImage(byte[] imageData, String outputPath) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageData);
             FileOutputStream fos = new FileOutputStream(outputPath)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

    private static boolean verifyFiles(String file1, String file2) throws IOException {
        byte[] file1Bytes = Files.readAllBytes(new File(file1).toPath());
        byte[] file2Bytes = Files.readAllBytes(new File(file2).toPath());

        return java.util.Arrays.equals(file1Bytes, file2Bytes);
    }
}
