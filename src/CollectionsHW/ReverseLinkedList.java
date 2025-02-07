package CollectionsHW;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main() {
        System.out.println("Reverse Linked List");
        LinkedList<Integer> list = new LinkedList<>();

        // Example 1
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        LinkedList<Integer> reversedList = ReverseLinkedList.reverseList(list);

        System.out.print("Example 1: ");
        for (int num : reversedList) {
            System.out.print(num + " ");
        }

        // Example 2
        list.clear();
        list.add(1);
        list.add(2);

        reversedList = ReverseLinkedList.reverseList(list);

        System.out.println("");
        System.out.print("Example 2: ");
        for (int num : reversedList) {
            System.out.print(num + " ");
        }

        // Example 3
        list.clear();

        reversedList = ReverseLinkedList.reverseList(list);

        System.out.println("");
        System.out.print("Example 2: ");
        System.out.println(reversedList);
    }

    public static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        LinkedList<Integer> reversedList = new LinkedList<>();

        while (!list.isEmpty()) {
            reversedList.addFirst(list.pollFirst());
        }

        return reversedList;
    }
}
