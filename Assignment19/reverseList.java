import java.util.*;

public class reverseList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        LinkedList<Integer> linkedList = new LinkedList<>(list);

        System.out.println("Reversed ArrayList:");
        reverseList(list);

        System.out.println("\nReversed LinkedList:");
        reverseLinkedList(linkedList);
    }

    public static void reverseList(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static void reverseLinkedList(LinkedList<Integer> linkedList) {
        ListIterator<Integer> iterator = linkedList.listIterator(linkedList.size());

        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
    }
}
