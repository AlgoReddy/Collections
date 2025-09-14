package collections_by_engineerDigest.vectors;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class TestVector {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(2, 2);
        vector.add(1);
        vector.add(2);
        System.out.println(vector.capacity());
        vector.add(3);
        System.out.println(vector.capacity());
        /*
         * in the vector you can specify the intial capacity & along with that how much
         * it should be increamented by the size when it is full , it's a multiplication
         * it's just increament
         */
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(9, 10, 11, 12, 13, 14, 15));
        Vector<Integer> vector2 = new Vector<>(Arrays.asList(1, 2, 3, 4, 5, 6, 8));
        vector2.addAll(linkedList);
        System.out.println(vector2);



    }

}
