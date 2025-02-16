
public class CompareStringBufferWithStringBuilder {

    public static void main(String[] args) {
        int iterations = 1_000_000;
        
        // Measure time for StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append("radhe");
        }
        long endTimeBuffer = System.nanoTime();
        long durationBuffer = endTimeBuffer - startTimeBuffer;
        System.out.println("Time taken by StringBuffer: " + durationBuffer / 1_000_000.0 + " ms");



        // Measure time for StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append("radhe");
        }
        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;
        System.out.println("Time taken by StringBuilder: " + durationBuilder / 1_000_000.0 + " ms");
    }
}
