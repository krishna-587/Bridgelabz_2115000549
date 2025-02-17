
public class stringConcatenation {
    
    public static long measureTime(Runnable function) {
        long startTime = System.nanoTime();
        function.run();
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000; 
    }

    public static void main(String[] args) {
        int N = 1_000_000;
        String text = "a";

        long stringTime = measureTime(() -> {
            String result = "";
            for (int i = 0; i < N; i++) {
                result += text;
            }
        });

        long stringBuilderTime = measureTime(() -> {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) {
                sb.append(text);
            }
        });

        long stringBufferTime = measureTime(() -> {
            StringBuffer sbf = new StringBuffer();
            for (int i = 0; i < N; i++) {
                sbf.append(text);
            }
        });

        System.out.println("Concatenation Performance:");
        System.out.println("String (O(N²)): " + stringTime + " ms");
        System.out.println("StringBuilder (O(N)): " + stringBuilderTime + " ms");
        System.out.println("StringBuffer (O(N)): " + stringBufferTime + " ms");
    }
}
