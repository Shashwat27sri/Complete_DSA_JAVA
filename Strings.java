import java.util.*;
public class Strings{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);


    char arr[]={'a','b','c','d','e','f','g'};
    String str ="abc";
    String str2=new String("xyz");

    strings are of immutable type

    taking input 
    String name=sc.next();           //take only single word 
    
    System.out.print(name);
    String fullname=sc.nextLine();     //take full name or line as integer does not terminate at 'spaces'.
    System.out.print(fullname);
    //it breaks when 'space' encountered      "shashwat srivastva" only "shashwat"  is printed.



    String fullName="shashwat srivastava";
    System.out.print(fullName.length());      //Inbuilt function to calculate length of string in array .length is a property and here it is an in built function.. concatenation of string


    String firstName="shashwat";
    String lastName="srivastava";
    String fullName=firstName+" "+lastName;
    // System.out.print(fullName);


    //traversing through string
    for (int i=0;i<fullName.length();i++){
      System.out.print(fullName.charAt(i));
    }




     


  }
}


//--------------------checkwhether a string is palindrome or not


import java.util.*;
public class Strings{
  public static boolean palindrome(String check){
    int len=check.length();
    for (int i=0;i<len/2;i++){
      if (check.charAt(i)!=check.charAt(len-1-i)){
        return false;
      }
    }
    return true;
  }

  public static void main(String args[]){
    String check="shashwat";
    boolean call= palindrome(check);
    if (call==true){
      System.out.println(check+" is a palindrome");
    }
    else{
      System.out.println(check+" is not a palindrome");
    }
  }
}






//--------------shortest distance (displacement )


import java.util.*;
public class Strings{
  public static void main (String args[]){
    String route="WNEENESENNN";
    int startx=0;
    int starty=0;
    int finalx=0;
    int finaly=0;

    // calculating final position
    for (int i=0;i<route.length();i++){
      if (route.charAt(i)=='N'){
        finaly++;
      }
      else if (route.charAt(i)=='E'){
        finalx++;
      }
      else if (route.charAt(i)=='W'){
        finalx--;
      }
      else if(route.charAt(i)=='S'){
        finaly--;
      }
    }
    System.out.println("final coordinates: "+finalx+" "+finaly);

    //calculating shortest distance (displacement)
    int displacement =(float)Math.sqrt(Math.pow((finalx-startx),2)+Math.pow((finaly-starty),2)); 
    System.out.print("Shortest distance: "+displacement);
  }
}





                                                     //String  function campare 
import java.util.*;
public class Strings {
  public static void main(String args[]){
    String s1="tony";
    String s2="tony";
    String s3=new String ("tony");
    if(s1==s2){
      System.out.println("s1 equal s2");

    }else{
      System.out.println("s1 not equal s2");
    }

    if(s1==s3){                              // this give not equal as it check by memory location.
      System.out.println("s1 equal s3");

    }else{
      System.out.println("s1 not equal s3");
    }

    to check by value  we use  '.equals()'
    if (s1.equals(s3)){
      System.out.println("s1 equal s3");
    }else{
      System.out.println("s1 not equal s3");
    }

  }
}


import java.util.*;                             // first letter to become capital of every word
public class Strings{
  public static String capital(String stru){
    
    StringBuilder sb=new StringBuilder("");
    char ch =Character.toUpperCase(sb.charAt(0));
    sb.append(ch);
    for(int i=1;i<stru.length();i++){
      if (stru.charAt(i)==' ' && i<stru.length()-1){
        sb.append(stru.charAt(i));   //this will append 'space'
        i++;
        sb.append(Character.toUpperCase(stru.charAt(i)));

      }else{
        sb.append(stru.charAt(i));
      }
    }
    return sb.toString();
  }
  public static void main(String args[]){
    String stru="hello shashayhsdb jbfkbk sbfkbld ksbfb";
    System.out.print(capital(stru));
  }
}






                                                  //compress the string 
import java.util.*;
public class Strings{
  public static String compress(String str){
    String new_str="";
    for(int i=0;i<str.length();i++){
      Integer count=1;
      while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
        count++;
        i++;

      } 
      new_str += str.charAt(i);
      if(count>1){
        new_str += count.toString();            //toString function only work for objects 
      } 
    }
    return new_str;
  } 

  public static void main(String args[]){
    String str="aaaabbbbccdeeeee";
    System.out.print(compress(str));
  }
}
