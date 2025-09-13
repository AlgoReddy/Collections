package collections_by_engineerDigest.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class StringLengthComparator implements java.util.Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.length() - o1.length();
    }

}

class MyComparator implements java.util.Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1; // returns in desc order
        // ! return o1 -o2 // return in asc order
    }

}

public class Comparator {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(9);
        // numbers.sort(new MyComparator());
        //using lamda expressions
        numbers.sort((a,b)->b-a);
        System.out.println(numbers);

        List<String> words = Arrays.asList("banana ", "palkova", "apple", "odash");
        // words.sort(new StringLengthComparator());
        words.sort((a,b)->b.length()-a.length());
        System.out.println(words);

    }

}
