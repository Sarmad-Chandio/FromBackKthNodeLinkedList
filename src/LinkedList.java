public class LinkedList {

    class Node{

        private Node next;
        public int value;

        // Constructore of Node
        public Node(int value) {
            this.value = value;
        }
    }
    private Node head;
    private Node tail;
    private int length;

    //constructor of Linked List
    public LinkedList(int value){
        Node node=new Node(value);
        this.head=node;
        this.tail=node;
        length=1;
    }
    //creating method to iterate Linked List
    public void pintList(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    public void append(int value){
        Node newNode= new Node(value);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            //connect this node with previous index of node
            // and node will be connected with tail
            tail.next=newNode;
            tail=newNode;
        }
        length++;
    }

    //Implement a method called findKthFromEnd that returns the k-th node from the end of the list.
    //If the list has fewer than k nodes, the method should return null.
    //Note: This implementation of the Linked List class does not have the length attribute.

    // WRITE FINDKTHFROMEND METHOD HERE //
    public Node findKthFromEnd(int k){
        Node slow=head;
        Node fast=head;
        for(int i=0;i<k;i++){
            if(fast==null){
                return null;
            }
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;

    }

    public void reverse(){
        Node temp=head;
        head=tail;
        tail=temp;

        Node after=temp.next;
        Node before=null;

        for(int i=0;i<length;i++){
            after=temp.next;
            temp.next=before;
            before=temp;
            temp=after;
        }
    }
    //Implement a method called findKthFromEnd that returns the k-th node from the end of the list.
    //If the list has fewer than k nodes, the method should return null.
    //Note: This implementation of the Linked List class can use length attribute.

    // Note: Index starts from 0

    public Node getKthNodeFromLast(int kth){
        if(kth<0 || kth>length){
            return null;
        }
        Node temp=head;
        for(int i=1; i<=kth; i++){
            temp=temp.next;
        }

        return temp;
    }


}
