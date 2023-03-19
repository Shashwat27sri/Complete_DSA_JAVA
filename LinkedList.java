public class LinkedList{
  public class Node{
    int data;
    Node next;

    public Node(int data){             //contructor
      this.data=data;
      this.next=null;
    }

  }
  public static Node head;
  public static Node tail;


  // ----------------------------methods




  //1.add();
      //addFirst -----------------O(1)
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




      //addLast -----------------

      public void addLast(int data){
        Node newNode =new Node(data);
        if (head==null){
          head =tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
      }



      //addMiddle ---------------

      public void addMid(int idx,int data){
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i < idx-1){
          temp=temp.next;
          i++;

        }
        newNode.next=temp.next;
        temp.next=newNode;
      }

  // remove();
  
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
      

  // search();

  public static void main(String args[]){
    LinkedList ll =new LinkedList();
    ll.addFirst(2);
    ll.printLL();
    ll.addFirst(1);
    ll.printLL();
    ll.addLast(3);
    ll.printLL();
    ll.addLast(4);
    ll.printLL();
    ll.addMid(2,9);
    ll.printLL();
  }
}