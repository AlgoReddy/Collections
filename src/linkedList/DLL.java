package linkedList;

public class DLL {
    private Node head;
    public  void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        node.prev=null;
        if (head!=null){
            head.prev=node;
        }
        head =node;


    }
    public void insertLast(int val){
        Node node  = new Node(val);
        Node last = head;

        node.next=null;
        if (head==null){
            node.prev  = head;
            head = node;
            return;
        }
        while (last.next!=null){
            last = last.next;
        }
        last.next=node;
        node.prev=last;

    }

    public Node find(int val){
        Node node =head;
        while (node!=null){
            if (node.val  ==val){
                return node;

            }
            node = node . next;
        }
        return null;
    }
    public void insert(int after , int val){
        Node p = find(after);
        if (p==null){
            System.out.println("the element does not exit"  );
            return;
        }
        Node node  = new Node(val);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if (node.next!=null ){
            node.next.prev=node;
        }
    }
    public void display(){
        Node node  =head;
        Node last = null;
        while (node!=null){
            System.out.print(node.val+" -->");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("printing in reverse");
        while (last!=null){
            System.out.print(last.val+" -> ");
            last =last.prev;

        }
        System.out.println("START");

    }



    private class  Node{
        int val;
        Node prev;
        Node next;

        public Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
        public Node(int val) {
            this.val = val;
        }
    }



}
