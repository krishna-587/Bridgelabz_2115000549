public class fibonacciComparison {
    
    public static long measureTime(Runnable function) {
        long startTime = System.nanoTime();
        function.run();
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000;
    }

    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int N = 24;

        long recursiveTime = measureTime(() -> fibonacciRecursive(N));
        long iterativeTime = measureTime(() -> fibonacciIterative(N));

        System.out.println("Fibonacci Performance: ");
        System.out.println("Recursive (O(2^N)) Time: " + recursiveTime + " ms");
        System.out.println("Iterative (O(N)) Time: " + iterativeTime + " ms");
    }
}
