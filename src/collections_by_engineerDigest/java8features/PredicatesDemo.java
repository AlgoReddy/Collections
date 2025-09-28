package collections_by_engineerDigest.java8features;

import java.util.function.Predicate;

public class PredicatesDemo {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x->x%2==0;
        System.out.println(isEven.test(10));
        Predicate<String> isStartingWithA = x->x.toLowerCase().startsWith("a");
        Predicate<String> isEndingWithH = x->x.toLowerCase().endsWith("h");
        Predicate<String> and = isStartingWithA.and(isEndingWithH);
        System.out.println(and.test("ankshith"));
    }
}
