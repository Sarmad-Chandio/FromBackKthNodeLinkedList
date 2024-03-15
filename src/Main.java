public class Main {
    public static void main(String [] args){
        LinkedList linkedList=new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.pintList();
        System.out.println("********** getKthNodeFromLast");

        //If we don't want to use reverse method and not want to access length paramerter

        System.out.println(linkedList.findKthFromEnd(1).value);
        System.out.println("*******");
        //first
        System.out.println(linkedList.getKthNodeFromLast(1).value);
        System.out.println("*******Reverse the node");
        linkedList.reverse();

        linkedList.pintList();
        System.out.println("********** ");
        System.out.println(linkedList.getKthNodeFromLast(1).value);
        System.out.println(linkedList.getKthNodeFromLast(0).value);



    }


}
