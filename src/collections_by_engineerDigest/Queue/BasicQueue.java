package collections_by_engineerDigest.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class BasicQueue     {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);linkedList.add(3);
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        linkedList.clear();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        System.out.println(ll.remove());
        System.out.println(ll.poll());

        System.out.println(ll.add(1));
        System.out.println(ll.offer(1));
        System.out.println(ll.remove());
        System.out.println(ll.poll());
        System.out.println(ll.peek());
        System.out.println(ll.element());
    }
}
