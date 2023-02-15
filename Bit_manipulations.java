import java.util.*;
public class Bit_manipulations{
  
  public static void oddeven(int n){              // to check whether a number is odd or even
    int bitmask=1;

    if ((n & bitmask)==0){
      System.out.print("Even");
    }else{
      System.out.print("Odd");
    }
  }


  public static int get_ith(int n,int i){      //to get ith bit 
    int bitmask=1<<i;
    if ((n & bitmask) == 0){
      return 0;  //if ith is 0

    }else{
      return 1;   //if ith is 1
    }
  }

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    // oddeven(n);
    
    System.out.print(get_ith(n,2));  //want to check 2nd bit
  }
}



import java.util.*;         //set ith bit
public class Bit_manipulations{

public static int set_ith(int n,int i){
  int bitmask=1<<i;
  return n|bitmask;
}

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.print(set_ith(n,2));
  }
}




import java.util.*;         //clear ith bit
public class Bit_manipulations{

public static int clear_ith(int n,int i){
  int bitmask=~(1<<i);
  return n & bitmask;
}

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.print(clear_ith(n,1));
  }
}




import java.util.*;                              //upadate ith bit
public class Bit_manipulations{

public static int clear_ith(int n,int i){
  int bitmask=~(1<<i);
  return n & bitmask;
}
public static int set_ith(int n,int i){
  int bitmask=1<<i;
  return n|bitmask;
}

public static int update_ith(int n,int i,int new_bit){
  // there are two approaches to get to it 

  //1.
  // if (new_bit==0){
  //   return clear_ith(n,i);

  // }else {
  //   return set_ith(n,i);
  // }

  //2.
  n=clear_ith(n,i);
  int bitmask=new_bit<<i;
  return n|bitmask;
}

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    // System.out.print(update_ith(n,2,1));
    System.out.print(update_ith(n,1,0));
  }
}






import java.util.*;
public class Bit_manipulations{

  public static int clear_last_ith(int n,int i){
    int bitmask=~(0)<<i;           //we can use any of them
    // int bitmask =(-1)<<i;
    return n & bitmask ;
  }
  public static void main(String args[]){
    System.out.print(clear_last_ith(15,2));
  }
}



import java.util.*;
public class Bit_manipulations{
  public static int clear_range(int n,int i,int j){                                //clears a  range of bits 
    int a = ((~0)<<(j+1));
    int b = ((1<<i)-1);
    int bitmask =a | b;
    return n & bitmask;  
  }  
  public static void main(String args[]){
    System.out.print(clear_range(10,2,4));
  }
}




                                                   Swapping without third variable 
import java.util.*;
public class Bit_manipulations{

  public static void  swapped(int a ,int b){
    a=a^b;
    b=a^b;
    a=a^b;
    System.out.println("a= "+a);
    System.out.println("b= "+b);
  }
  public static void main(String args[]){
    int a=10;
    int b=20;
    swapped(a,b);
  }
}


