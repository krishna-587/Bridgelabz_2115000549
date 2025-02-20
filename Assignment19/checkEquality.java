import java.util.*;

public class checkEquality {

    public static void main(String args[]) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,2,1));

        System.out.println(compare(set1, set2));
    }

    public static boolean compare(Set<Integer> set1, Set<Integer> set2) {
        if (set1.size() != set2.size()) {
            return false;
        }
        int count = 0;
        for (Integer i : set1) {
            if (set2.contains(i)) {
                count++;
            }
        }

        return count == set1.size() ? true : false;
    }
}
