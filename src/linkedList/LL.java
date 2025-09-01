package linkedList;

public class LL {
    private Node head ;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head = node;
        if (tail == null){
            tail=head;
        }
        size+=1;
    }
    public void insertLast(int val){
        if (tail.next==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        node = tail;
        size++;
    }
    public void insert(int val , int index){
        if (index==0){
            insertFirst(val);
            return;
        }
        if (index==size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1  ; i <index; i++) {
            temp =temp.next;
        }
        Node node = new Node(temp.next , val );
        size++;


    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if (head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public void display(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.value + " -->");
            temp  = temp.next;
        }
        System.out.println("END ");
    }

    private class Node {
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }

        public Node(Node next, int value) {
            this.next = next;
            this.value = value;
        }

    }
}
