package collections_by_engineerDigest.Queue;

import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(30);
        pq.add(15);
        pq.add(20);
        pq.add(10);
        pq.add(34);
        pq.add(1);
        System.out.println(pq);
        while (!pq.isEmpty()){
            System.out.print(pq.poll()+ " ");

        }
       PriorityQueue<Integer> p2 = new PriorityQueue<>(4,(a,b)->b-a );
        p2.add(1);
        p2.add(2);
        p2.add(3);
        p2.add(4);
        p2.add(5);
        System.out.println(" ");
        System.out.println("This is line separator");
        System.lineSeparator();
        System.out.println("is it working");
        System.out.println("this is p2 ");
        System.out.println(p2);
        while(!p2.isEmpty()){
            System.out.print(p2.poll());
        }

    }
}
