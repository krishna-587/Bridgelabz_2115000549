public class peakElement {

    public static void main(String[] args) {
        int[] arr = {2, 6, 9, 14, 23, 15, 7};

        int peak = peakElement(arr);
        if(peak != -1){
            System.out.println("Peak element is " + peak);
        }
        else{
            System.out.println("No peak element");
        }

    }

    public static int peakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if ((mid == 0 || arr[mid] > arr[mid - 1]) && (mid == arr.length - 1 || arr[mid] > arr[mid + 1])) {
                return arr[mid];
            }
          
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return -1;
    }
}
