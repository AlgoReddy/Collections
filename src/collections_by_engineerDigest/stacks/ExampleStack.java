package collections_by_engineerDigest.stacks;

import java.util.ArrayList;
import java.util.Stack;

public class ExampleStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.add(89);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);
        // ! search -- > shows the elements from the top to bottom & starts with index 1
        // not "0"
        System.out.println(stack.search(4));
        // ? you can use all the methods in vector as stack is an extends the vector
        // class
        stack.getLast();// peek;
        stack.removeLast();// pop;
        stack.push(6);// add
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(9);
        arrayList.add(8);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println(arrayList.getLast());
        System.out.println(arrayList.removeLast());

    }

}
