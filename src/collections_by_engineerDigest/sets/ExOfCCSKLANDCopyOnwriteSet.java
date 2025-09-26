package collections_by_engineerDigest.sets;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class ExOfCCSKLANDCopyOnwriteSet {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> copyOnWriteArraySet  = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();
        for (int i = 0; i < 5; i++) {
            copyOnWriteArraySet.add(i);
            concurrentSkipListSet.add(i);
        }
        System.out.println(copyOnWriteArraySet);

        System.out.println(concurrentSkipListSet);
        System.out.println("this is using the concurrentskiplistset");
        for (Integer i : concurrentSkipListSet ) {
            System.out.print(i );
            concurrentSkipListSet.add(6)      ;
        }
        System.out.println(" ");
        System.out.println("using copyOnArrayListset");
        for (Integer i : copyOnWriteArraySet){
            System.out.print(i);
            copyOnWriteArraySet.add(6);
        }
        System.out.println("");
        System.out.println(copyOnWriteArraySet);

    }
}
