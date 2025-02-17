import java.util.*;

public class dataStructureSearchComparison {
    
    public static long measureTime(Runnable function) {
        long startTime = System.nanoTime();
        function.run();
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000;
    }

    public static boolean searchInArray(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int N = 1_000_000;
        Random random = new Random();
        int[] array = random.ints(N, 0, N * 10).toArray();
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num : array) {
            hashSet.add(num);
            treeSet.add(num);
        }
        int target = array[N / 2];
        
        long arraySearchTime = measureTime(() -> searchInArray(array, target));
        long hashSetSearchTime = measureTime(() -> hashSet.contains(target));
        long treeSetSearchTime = measureTime(() -> treeSet.contains(target));

        System.out.println("Data Structure Search Performance:");
        System.out.println("Array Search (O(N)): " + arraySearchTime + " ms");
        System.out.println("HashSet Search (O(1)): " + hashSetSearchTime + " ms");
        System.out.println("TreeSet Search (O(log N)): " + treeSetSearchTime + " ms");
    }
}
