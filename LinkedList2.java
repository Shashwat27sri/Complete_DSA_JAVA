// LL in collection Framework
// this will help us to easily usethe functionalities of LL without making it from Scratch

// import java.util.LinkedList;
// public class LinkedList2{
//   public static void main(String args[]){
    
//     // create LinkedList
//     LinkedList<Integer> ll=new LinkedList<>();       //type of arraylist which uses objects
    

//     //addition
//     ll.addLast(1);
//     ll.addLast(2);
//     ll.addLast(3);
//     ll.addFirst(0);

//     //printing LL
//     System.out.println(ll);


//     //remove
//     ll.removeLast();
//     ll.removeFirst();
//     System.out.println(ll);
//   }
// }


// Merged Sort in LL        --O(nlogn)

public class LinkedList2{
  public class Node{                            // this class is common for all the linkedlist questions
    int data;
    Node next;

    public Node(int data){             //contructor
      this.data=data;
      this.next=null;
    }

  }
  public static Node head;
  public static Node tail;


  public void addFirst(int data){
    //step 1 =create new node 
    Node newNode =new Node(data);

    //if linked list is empty
    if (head == null){
      head = tail=newNode;
      return;
    }
    
    //step 2 - assign newNode next to head
    newNode.next = head;          //linking

    //step3 - update head =newNode
    head = newNode;
  }

  public void addLast(int data){
        Node newNode =new Node(data);
        
        if (head==null){
          head =tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
      }

  public void printLL(){
    Node temp=head;
    if(head ==null){
      System.out.print("LL is empty");
      return;
    }
    while (temp!=null){
      System.out.print(temp.data+" -> ");
      temp=temp.next;

    }
    System.out.println("null");
  }





  //step 1
  private Node getMid(Node head){
    Node slow = head;
    Node fast = head.next;
    while(fast != null && fast.next !=null){
      slow = slow.next;
      fast =fast.next.next;

    }
    return slow;   // mid node
  } 


  //step3 ---------------merging the sorted two LL

  private Node merge (Node head1, Node head2){
    Node mergedLL = new Node(-1);
    Node temp = mergedLL;

    while (head1 != null && head2 != null){
      if(head1.data <= head2.data){
        temp.next = head1;    //itialising value to temp LL

        head1 = head1.next;    //updating pointer of head1 in LeftLL
        temp = temp.next;      //updating pointer of temp in mergedLL

      }else{
        temp.next = head2;    //itialising value to temp LL


        head2 = head2.next;      //updating pointer of head2 in RightLL
        temp = temp.next;        //updating pointer of temp in mergedLL
      }
    }

    while(head1 != null){            //for remaining values
      temp.next = head1;
      head1 = head1.next;
      temp = temp.next;
    }


    while(head2 != null){
      temp.next = head2;
      head2 = head2.next;
      temp = temp.next;
    }

    return mergedLL.next;          //removing -1 from LL
  }


  //step 2
  public Node mergeSort(Node head){     //by this we got our mid and divide the LL into two halfs.

    //base case
    if (head == null || head.next == null){
      return head;
    }

    // find mid
    Node mid = getMid(head);

    //left & right MergeSort 
    Node rightHead =mid.next;
    mid.next = null;
    Node newLeft = mergeSort(head);
    Node newRight =mergeSort(rightHead);


    //merge
    return merge(newLeft, newRight);
  }

  public void zigzag(){
    //find mid
    Node slow = head;
    Node fast = head.next;
    while( fast != null && fast.next != null){
      slow = slow.next;
      fast= fast.next.next;
    }
    Node mid = slow;

    //reverse 2nd half

    Node curr = mid.next;
    mid.next = null;
    Node prev = null;
    Node next;

    while (curr != null){
      next= curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;

    }

    Node left = head;
    Node right = prev;
    Node nextL , nextR;


    while(left  != null && right != null){
      //zigzag
      nextL=left.next;
      left.next = right;
      nextR= right.next;
      right.next = nextL;

      //update head
      left = nextL;
      right = nextR;
    } 
  }


  public static void main(String args[]){
    LinkedList2 ll=new LinkedList2();
    
    //merge sort


    // ll.addFirst(1);
    // ll.addFirst(2);
    // ll.addFirst(3);
    // ll.addFirst(4);
    // ll.addFirst(5);

    //5->4->3->2->1


    
    // ll.printLL();
    // ll.head = ll.mergeSort(ll.head);
    // ll.printLL();



    //zigzag LL
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.addLast(5);
    ll.addLast(6);
    //1->2->3->4->5

    ll.printLL();
    ll.zigzag();
    ll.printLL();
  }
}