public class LinkedList{
  public class Node{                            // tis class is common for all the linkedlist questions
    int data;
    Node next;

    public Node(int data){             //contructor
      this.data=data;
      this.next=null;
    }

  }
  public static Node head;
  public static Node tail;

  public static int size;


  // ----------------------------methods




  //1.add();
      //addFirst -----------------O(1)
      public void addFirst(int data){
        //step 1 =create new node 
        Node newNode =new Node(data);

        size++;              //increment in size of LL

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




      //addLast -----------------

      public void addLast(int data){
        Node newNode =new Node(data);
        size++;
        if (head==null){
          head =tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
      }



      //addMiddle ---------------

      public void addMid(int idx,int data){
        if (idx==0){
          addFirst(data);
          return;
        }

        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i < idx-1){
          temp=temp.next;
          i++;

        }
        newNode.next=temp.next;
        temp.next=newNode;
      }
  
  //2.print();
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
      
  

  // remove();
    //1.removeFirst
      public int removeFirst(){
        if (size==0){
          System.out.println("LL is empty");
          return Integer.MIN_VALUE;
        }else if(size==1) {
          int val=head.data;
          head=tail=null;
          size=0;
          return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
      }

    //2.removeLast
      public int removeLast(){
        if (size ==0){
          System.out.println("LL is empty");
          return Integer.MIN_VALUE;

        }else if(size==1){
          int val=head.data;
          head=tail=null;
          size=0;
          return val;
        }
        Node prev=head;
        for (int i=0;i<size-2;i++){
          prev=prev.next;
        }
        int val=prev.next.data;   //tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;
      }

  // search();
    //1. iterative search
      public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
          if(temp.data==key){            //key found
            return i;
          }
          temp=temp.next;
          i++;
        }
        return -1;          //key not found
      }

    //2. recursive search
    public int helper(Node head,int key){
      if (head==null){
        return -1;
      }
      if (head.data==key){
        return 0;
      }
      int idx=helper(head.next,key);
      if (idx == -1){
        return -1;
      }
      return idx+1;
    }
    public int recSearch(int key){
      return helper(head,key);
    }


  // reverse a linked list
  public void reverseLL(){
    Node prev=null;
    Node curr=tail=head;
    Node next;

    while(curr!=null){
      next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
    }
    head=prev;
  }


  //delete Nth Node from end


  public void deleteNthfromEnd(int n){
    //calculated size
    int sz = 0;
    Node temp =head;
    while(temp != null){
      temp=temp.next;
      sz++;
    }

    if(n == sz){
      head=head.next;     //if removing the first
      return;
    }

    //size -n           that node is sz-n+1
    int i=1;
    int iToFind =sz-n;
    Node prev=head;
    while (i<iToFind){       //by this we reached to the previous node of whom we have to delete
      prev =prev.next;
      i++;

    }
    prev.next=prev.next.next;
    return;



  } 


  //if the LL is palindrome or not?

  public Node findMid(Node head){   //helper
    Node slow =head;
    Node fast =head;

    while(fast!=null && fast.next != null){
      slow =slow.next;//+1
      fast=fast.next.next;//+2

    }
    return fast;
  }

  public boolean checkPalindrome(){              //error hai  issme 

  //base case
    if (head ==null || head.next ==null){
      return true;
    }

    //step1 -find mid
    Node mid = findMid(head);

    //step 2- reverse 2nd half
    Node prev=null;
    Node curr=mid;
    Node next;

    while (curr!=null){
      next = curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;

    }

    Node right=prev; //right half head
    Node left=head;


    //step3- check left half & right half

    while (right != null){
      if (left.data != right.data){
        return false;
      }
      left =left.next;
      right=right.next;
    }

    return true;
  }







  // check whether there is a cycle present or not in LinkedList

  public boolean isCycle(){
    Node slow =head;
    Node fast = head;
    while (fast !=null && fast.next !=null){
      slow = slow.next;           //+1
      fast=fast.next.next;        //+2
      if(slow == fast){
        return true;

      }
    }
    return false;
  }



  //removing cycle from the LL

  public void removeCycle(){
    //detect cycle
    Node slow =head;
    Node fast =head;
    boolean cycle =false;
    while(fast !=null && fast.next !=null){
      slow = slow.next;
      fast = fast.next.next;
      if(fast ==slow){             //means cycle found
        cycle =true;
      }
    }
    if (cycle == false){           //cycle not found
      return;
    }

    //find meeting point
    slow =head;
    Node prev=null;      //last Node

    while(slow != fast){
      prev = fast; 
      slow =slow.next;       //+1
      fast=fast.next.next;   //+2
    }

    //lastnode.next=null
    prev.next=null;
    return;
  } 








  // ------------------------------------------------------
  // --------------First Phase Break-----------------------
  // ------------------------------------------------------










  public static void main(String args[]){
    // LinkedList ll =new LinkedList();                      /*        valid    
    // ll.addFirst(2);
    // // ll.printLL();                                              till delete
    // ll.addFirst(1);
    // // ll.printLL();
    // ll.addLast(3);                                                 nth from
    // // ll.printLL();
    // ll.addLast(4);
    // // ll.printLL();                                                   end
    // ll.addMid(2,9);
    // ll.printLL();                                                      */

    // System.out.println("Size of the Linked List "+ll.size);


    // // remove First
    // ll.removeFirst();
    // ll.printLL();
    // System.out.println("Size of the Linked List "+ll.size);


    // //remove Last
    // ll.removeLast();
    // ll.printLL();
    // System.out.println("size of the Linked List "+ll.size);


    // //iterative search
    // System.out.println("key found at "+ll.itrSearch(3));
    // System.out.println("key found at "+ll.itrSearch(10));

    // //recursive search
    // System.out.println("key found at "+ll.recSearch(3));
    // System.out.println("key found at "+ll.recSearch(10));

    // // reverse a linked list
    // ll.reverseLL();
    // System.out.println("LL is reversed");
    // ll.printLL();



    // delete nth node from end
    // ll.deleteNthfromEnd(3); 
    // ll.printLL();

    //check for palindrom Linked List
    // LinkedList LL=new LinkedList();           //error hai isme 
    // LL.addFirst(1);
    // LL.addLast(2);
    // LL.addLast(2);
    // LL.addLast(1);
    // LL.printLL();
    
    // System.out.println(ll.checkPalindrome());
    




    // check whether there is a cycle present or not in LinkedList

    // LinkedList ll =new LinkedList();                      //1->2->3->2
    // ll.addFirst(1);                                       //head = 1
    // ll.addLast(2);
    // ll.addLast(3);
    // System.out.println(head.next.next.next);
    // head.next.next.next=head.next;
    
    // System.out.println(ll.isCycle());




    //removing cycle from the LL
    LinkedList ll =new LinkedList();                      //1->2->3->2
    ll.addFirst(1);                                       //head = 1
    ll.addLast(2);
    ll.addLast(3);
    // System.out.println(head.next.next.next);
    head.next.next.next=head.next;
    
    System.out.println(ll.isCycle());
    ll.removeCycle();
    System.out.println(ll.isCycle());

  }
}





// ------------------------------------------------------
// --------------First Phase Break-----------------------
// ------------------------------------------------------