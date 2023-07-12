import java.util.ArrayList;  
import java.util.*;


public class Stacks{
  public static class Stack{                                           // Stacks using ArrayList
    static ArrayList<Integer> list = new ArrayList<>();                      
    
    public static boolean isEmpty(){
      return list.size() == 0;

    }

    public static void push(int data){
      list.add(data);

    }
    
    public static int pop(){
      if (isEmpty()){
        return -1;
      }
      int top = list.get(list.size()-1);
      list.remove(list.size()-1);
      return top ;

    }
    
    public static int peek(){
      if (isEmpty()){
        return -1;
      }
      return list.get(list.size()-1);
    }
  }




  static class Node{                         //Stack using Linkedlist 
      int data;
      Node next;
      Node(int data){
        this.data=data;
        this.next= null;
      }
    }
  public static class Stack{
    static Node head = null;

    public static boolean isEmpty(){
      return head == null;

    }
    public static void push(int data){
      Node newNode = new Node(data);

      if(isEmpty()){
        head = newNode;
        return;

      }
      newNode.next = head;
      head = newNode;

    }

    public static int pop(){
      if (isEmpty())
        return -1;
      int top = head.data;
      head=head.next;
      return top; 

    }

    public static int peek(){
      return head.data;
    }

  } 




  public static void main(String args[]){               //main function for arraylist and linkedlist
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);

    while(!s.isEmpty()){
      System.out.println(s.peek());
      s.pop();
    }
  }





  public static void main(String args[]){                             //Stacks using JCF(java collection framework)
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);

    while(!s.isEmpty()){
      System.out.println(s.peek());
      s.pop();
    }

  }






  public static void placeAtBottom(Stack<Integer> s , int data){                           //placing element at Bottom of stack

    if (s.isEmpty()){
      s.push(data);
      return;
    }
    int top= s.pop();
    placeAtBottom(s,data);
    s.push(top);

  }



  public static void main(String args[]){
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);


    placeAtBottom(s , 4);
    while(!s.isEmpty()){
      System.out.println(s.pop());

    }
  }
  


  public static String reverseString(String str){                        //reversing the string using Stack
    Stack<Character> s =new Stack<>();
    int idx= 0;
    while (idx < str.length()){
      s.push(str.charAt(idx));
      idx++;

    }

    StringBuilder result = new StringBuilder("");
    while(!s.isEmpty()){
      char curr = s.pop();
      result.append(curr);

    }
    return result.toString();

  }
  public static void main(String args[]){
    String str= "HelloWorld";
    String output = reverseString(str);
    System.out.println(output);

  }




}
