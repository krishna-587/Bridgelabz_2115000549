
import java.util.*;

public class NthElement {

    public static void main(String[] args) {
        LinkedList<Character> linkedlist = new LinkedList<>(Arrays.asList('A', 'B', 'C', 'D', 'É'));
        int N = 2;
        System.out.println("Nth Element: " + nthElement(linkedlist, N));
    }

    public static Character nthElement(LinkedList<Character> linkedlist , int N){
        ListIterator <Character> iterator1 = linkedlist.listIterator();
        ListIterator <Character> iterator2 = linkedlist.listIterator();
        int idx = 0;
        while(idx < N){
            iterator1.next();
            idx++;
        }
        while(iterator1.hasNext()){
            iterator1.next();
            iterator2.next();
        }

        return iterator2.next();
    }
}
