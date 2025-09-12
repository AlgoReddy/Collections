package linkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(8);
        list.insertFirst(88);
        list.insertLast(99);
        list.insert(100 , 3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        System.out.println("this is after the deletion of the last element ");
        list.display();
        System.out.println("deletion at particular point");
        System.out.println(list.delete(2));
        System.out.println("using the recursion for adding the elements");
        list.insertRec(2 , 2);
        list.display();


        System.out.println("start of the doubly linked list");
        DLL doublelinkedlist = new DLL();
        doublelinkedlist.insertFirst(3);
        doublelinkedlist.insertFirst(4);
        doublelinkedlist.insertFirst(8);
        doublelinkedlist.insertFirst(88);
        doublelinkedlist.insertLast(99);
        doublelinkedlist.display();
        doublelinkedlist.insert(88 , 878);
        doublelinkedlist.display();


        System.out.println("Now we are in CC");
        CCLL cc = new CCLL();
        cc.insert(1);
        cc.insert(2);
        cc.insert(3);
        cc.insert(4);
        cc.insert(5);
        cc.display();
        cc.delete(3);
        cc.display();
    }

}
