import java.util.*;
public class removeDuplicates{
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 2, 2, 3, 4));
        duplicates(list);
    }

    public static void duplicates(List<Integer> list){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        int i =0;
        while(i < list.size()){
            if(!set.contains(list.get(i))){
                set.add(list.get(i));
                System.out.print(list.get(i) + " ");
            }
            i++;
        }
    }
}