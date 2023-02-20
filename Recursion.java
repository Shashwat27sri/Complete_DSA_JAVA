import java.util.*;                         //decreasing order from n to 1
public class Recursion{
  public static void main(String args[]){
    int n=10;
    func(n);
  }
  public static void func(int n){
    if (n==1){
      System.out.print(n);
      return;
    }
    System.out.print(n+" ");
    func(n-1);
  }
}



import java.util.*;                         //increasing order from n to 1
public class Recursion{                     //simple approach
  public static void main(String args[]){
    int n=1;
    int n1=10;
    func(n);
    funcInc(n1);
  }
  public static void func(int n){
    if (n==10){
      System.out.print(n);
      return;
    }
    System.out.print(n+" ");
    func(n+1);
    
  }

  

  public static void funcInc(int n){                  //another approach to print 1 to 10 just some change on the decrease function 
    if (n==1){
      System.out.print(n+" ");
      return;
    }
    funcInc(n-1);                       // these two
    System.out.print(n+" ");            //swap these two 
    
  }
}



public class Recursion{                                       //factorial using factorial
  public static int facto(int n){
    if (n==0){
      return 1;
    }
    // int factoor=facto(n-1) ;
    int fact=n*(facto(n-1));
    return fact;
  }
  public static void main(String args[]){
    System.out.print(facto(5));
  }
}

public class Recursion{                          //sum of n natural numbers
  public static int sumNatural(int n){
    if (n==1){
      return 1;
    }
    int sum=n+sumNatural(n-1);
    return sum;
  } 
  public static void main(String args[]){
    System.out.print(sumNatural(5));
  }
}



public class Recrusion{                //fibonacci series 
  public static int fibonacci(int n){
    if (n==0 ||n==1){
      return n;
    }
    
    int fibN=(fibonacci(n-1))+(fibonacci(n-2));
    return fibN;
  }
  public static void main(String args[]){
    System.out.print("25th term of fibonacci series  ");
    System.out.print(fibonacci(25));
  }
}



