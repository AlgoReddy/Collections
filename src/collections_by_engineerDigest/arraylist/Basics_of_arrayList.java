package collections_by_engineerDigest.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basics_of_arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(89);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6, 99);
        // adds the element at the particular index & moves the element in that place to
        // the next position
        list.add(2, 22);
        // it replaces the element at the particular index
        list.set(2, 222);
        // tells us the size of the list
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.contains(3));
        System.out.println(list.contains(99));
        System.out.println(list.size());
        for (int o : list) {
            System.out.print(o + " ");
        }
        List<String> liste = new ArrayList<String>();
        System.out.println(liste.getClass().getName());

        List<String> list1 = Arrays.asList("monday", "tuesdays", "wednesday");
        System.out.println(list1.getClass().getName());
        // list1.add(2, "weeednesday");
        // we cannot add any elements in to the list when created with the Arrays.aslist
        list1.set(1, "tueeeesday");
        System.out.println(list1);

        // you can also convert the an array which is already created like
        String[] arr = { "monday", "tuesdays", "wednesday", "thursday", "friday", "Saturday" };
        List<String> list4 = Arrays.asList(arr);
        System.out.println(list4);

        // second method of creating the list without the aslist
        List<Integer> list3 = List.of(1 , 2, 3 , 4 ,5 , 6 ,7 ,8 , 9 , 0 );
        // inthis one you can't even add/ replace the elements in the list

        /*
         * these are limitations we need to keep in mind
         * 
         */
    }

}
