package collections_by_engineerDigest.copyonwritearrayslistexamples;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyonWriteArrayListExample {
    public static void main(String[] args) {
        // List<String> shoppingList = new ArrayList<>();
        // ! if you use arraylist/ linked list or anyother it will gives
        // concurrentModificationException
        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Bread");
        shoppingList.add("Milk");
        shoppingList.add("butter");
        System.out.println("Initial items in shoppingList" + shoppingList);
        for (String item : shoppingList) {
            System.out.println(item);
            if (item.equals("Milk")) {
                shoppingList.add("Eggs");
                System.out.println("Added the eggs in the Milk");

            }

        }
        System.out.println("final list of the items" + shoppingList);
    }

}
