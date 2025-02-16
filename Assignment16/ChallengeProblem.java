import java.util.*;

public class ChallengeProblem {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 4, -1, 1));
        int target = 4;

        System.out.println("Missing integer is: " + missingPositiveInteger(list));

        Collections.sort(list);
        System.out.println(binarySearch(list, target));

    }

    public static int missingPositiveInteger(List<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n; i++) {
            while (list.get(i) > 0 && list.get(i) <= n && !list.get(i).equals(list.get(list.get(i) - 1))) {
                Collections.swap(list, i, list.get(i) - 1);
            }
        }

        for (int i = 0; i < n; i++) {
            if (list.get(i) != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    public static int binarySearch(List<Integer> list, int target) {
        int left = 0;
        int right = list.size()-1;
 
        while (left <= right) {
            int mid = left + (right - left)/2;

            if(list.get(mid) == target){
                return mid;
            }
            else if(list.get(mid) < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;
   }
}