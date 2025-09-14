package collections_by_engineerDigest.vectors;

import java.util.Vector;

public class VectorThreadSafety {
    public static void main(String[] args) {
        // ArrayList<Integer> arrayList = new ArrayList<>();
        // ! when we use arraylist /linkedlist they are not thread safe hence produce
        // !different results everytime unlike vector which is a thread safe
        Vector<Integer> arrayList = new Vector<>();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                arrayList.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                arrayList.add(i);
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("size of the list " + arrayList.size());

    }

}
