import java.util.*;

public class searchTarget {
    
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static long measureTime(Runnable searchFunction) {
        long startTime = System.nanoTime();
        searchFunction.run();
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000; 
    }

    public static void main(String[] args) {
        int[] dataSizes = {1000, 10000, 1000000};
        Random random = new Random();

        for (int size : dataSizes) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = random.nextInt(size);
            }
            int target = arr[random.nextInt(size)];

            long linearTime = measureTime(() -> linearSearch(arr, target));
            Arrays.sort(arr);
            long binaryTime = measureTime(() -> binarySearch(arr, target));

            System.out.println("Dataset Size: " + size);
            System.out.println("Linear Search Time: " + linearTime + " ms");
            System.out.println("Binary Search Time: " + binaryTime + " ms");
        }
    }
}
