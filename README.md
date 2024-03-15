
# Find Kth Node From End ( ** Linked List)
## Description
Implement a method called findKthFromEnd that returns the k-th node from the end of the list.

If the list has fewer than k nodes, the method should return null.

## Note: 
This implementation of the Linked List class does not have the length attribute.

### Method Signature

```java
public Node findKthFromEnd(int k)
```
### EXAMPLE
```java
LinkedList myList = new LinkedList(1);
myList.append(2);
myList.append(3);
myList.append(4);
myList.append(5);
 
Node result = myList.findKthFromEnd(2); // Output: Node with value 4
 
result = myList.findKthFromEnd(5); // Output: Node with value 1
 
result = myList.findKthFromEnd(6); // Output: null
```

###  Implemented by using lenth of Node
1. Node's index will be starting from zero
2. First List will be reversed -->head and tail will be swaped and links b/w Node will be reversed
3. Then k'th element will be populated
```java
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
    
```

### Implemented by not using lenth of Node
1. We will not be using length parameter of List
2. We will not reverse the linked List
```java
    //Implement a method called findKthFromEnd that returns the k-th node from the end of the list.
    //If the list has fewer than k nodes, the method should return null.
    //Note: This implementation of the Linked List class does not have the length attribute.

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
```





