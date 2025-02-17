import java.util.*;

public class sortingComparison {
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) arr[k++] = leftArr[i++];
        while (j < n2) arr[k++] = rightArr[j++];
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static long measureTime(Runnable sortFunction) {
        long startTime = System.nanoTime();
        sortFunction.run();
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

            int[] arrBubble = Arrays.copyOf(arr, arr.length);
            int[] arrMerge = Arrays.copyOf(arr, arr.length);
            int[] arrQuick = Arrays.copyOf(arr, arr.length);

            long bubbleTime = measureTime(() -> bubbleSort(arrBubble));
            long mergeTime = measureTime(() -> mergeSort(arrMerge, 0, arrMerge.length - 1));
            long quickTime = measureTime(() -> quickSort(arrQuick, 0, arrQuick.length - 1));

            System.out.println("Dataset Size: " + size);
            System.out.println("Bubble Sort Time: " + bubbleTime + " ms");
            System.out.println("Merge Sort Time: " + mergeTime + " ms");
            System.out.println("Quick Sort Time: " + quickTime + " ms");
        }
    }
}
