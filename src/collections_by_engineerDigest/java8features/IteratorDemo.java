package collections_by_engineerDigest.java8features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : list){
            System.out.println(i);
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
//        for (Integer i : numbers){
//           if (i%2==0){
//               numbers.remove(i);
//           }
//            System.out.println(i);
//        }
        // this will give you the concrrent modification Exception
       Iterator<Integer> itr = numbers.iterator();
       while(itr.hasNext()) {
           Integer num = itr.next();
           if (num %2 ==0){
               itr.remove();
           }
           System.out.println(num);
       }
        System.out.println(numbers);
    }
}
