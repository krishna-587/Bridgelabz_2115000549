
import java.io.*;

class PipedStreams{

    public static void main(String[] args) {
        try {
            
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            Thread writerThread = new Thread(new WriterTask(pos));
            Thread readerThread = new Thread(new ReaderTask(pis));

            writerThread.start();
            readerThread.start();

            writerThread.join();
            readerThread.join();

        } catch (IOException | InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class WriterTask implements Runnable {

    private PipedOutputStream pos;

    public WriterTask(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        try (BufferedOutputStream bos = new BufferedOutputStream(pos)) {
            String message = "Hello from Writer Thread!";
            bos.write(message.getBytes());  
            bos.flush();
            System.out.println("Writer: Data written successfully.");
        } catch (IOException e) {
            System.out.println("Writer Error: " + e.getMessage());
        }
    }
}

class ReaderTask implements Runnable {

    private PipedInputStream pis;

    public ReaderTask(PipedInputStream pis) {
        this.pis = pis;
    }

    @Override
    public void run() {
        try (BufferedInputStream bis = new BufferedInputStream(pis)) {
            byte[] buffer = new byte[1024];
            int bytesRead = bis.read(buffer); 
            String receivedMessage = new String(buffer, 0, bytesRead);
            System.out.println("Reader: Received - " + receivedMessage);
        } catch (IOException e) {
            System.out.println("Reader Error: " + e.getMessage());
        }
    }
}
