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



public class Recursion{                                    //to check whether the array is sorted or not.
  public static boolean issorted(int arr[],int i){
    if (i==arr.length-1){
      return true;
    }
    if (arr[i]>arr[i+1]){
      return false;
    }
    return issorted(arr , i+1);
  }
  public static void main(String args[]){
    int arr[]={1,2,3,5,4};
    int i=0;
    System.out.print(issorted(arr,0));
  }
  
}



public class Recursion{                                   //first Occurence of an element 
  public static int firstOcc(int arr[],int k,int i){
    if (i==arr.length-1){
      return -1;
    }
    if (arr[i]==k){
      return i;
    }else{
    return firstOcc(arr,k,i+1);
    }
  }
  public static void main(String args[]){
    int arr[]={1,2,3,4,5,6,7,8,9};
    System.out.print(firstOcc(arr,5,0));
  }
}



public class Recursion{                                   //last Occurence of an element 
  public static int lastOcc(int arr[],int k,int i){           //######### doubt
    if (i==arr.length-1){
      return -1;
    }
    int isfound=lastOcc(arr,k,i+1);
    if (isfound==-1 && arr[i]==k ){
      // return i;
      System.out.print(i);
    }
    return isfound;
    
  }
  public static void main(String args[]){
    int arr[]={1,2,5,4,5,6,7,5,9};
    System.out.print(lastOcc(arr,5,0));
  }
}



public class Recursion{
  public static int power(int x,int n){                    //value of x^n
    if(n==0){
      return 1;
    }
    int pow=x*(power(x,n-1));
    return pow;
  }
  public static void main(String args[]){
    System.out.print (power(2,10));
  }
}



public class Recursion{
  public static int power(int x,int n){                    //value of x^n optimized O(logn).
  if (n==0){
    return 1;
  }
  //even
  int pow=power(x,n/2);
  int halfpower=pow * pow;      //to make it O(log n) we have not to call function twice although we store this value to a variable 'pow'.
    
  //for odd
  if (n%2!=0){
    halfpower=x*halfpower;
  }
  return halfpower;
  }
  public static void main(String args[]){
    System.out.print (power(2,5));
  }
}





public class Recursion{
  public static int  tilingProblem(int n){
    //base case
    if(n==0||n==1){
      return 1;
    }

    //kaam 
    //vertical choice
    // int fun1=tilingProblem(n-1);
    // //horizontal choice
    // int fun2=tilingProblem(n-2);

    // int totalchoice=fun1+fun2;
    // return totalchoice;

    return tilingProblem(n-1)+tilingProblem(n-2);              //also can be done by this single statement.


  } 

  public static void main(String args[]){
    System.out.print(tilingProblem(4));
  }
}





public class Recursion{                                        //removing Duplicates from string having only a-z character
  public static void removeDuplicate(String str,int idx,StringBuilder newstr,boolean map[]){
    if (idx==str.length()){
      System.out.print(newstr);
      return;
    }
    char currChar=str.charAt(idx);
    if(map[currChar-'a']==true){
      removeDuplicate(str,idx+1,newstr,map);
    }else{
      map[currChar-'a']=true;
      removeDuplicate(str,idx+1,newstr.append(currChar),map);
    }
  }
  public static void main(String args[]){
    String str="apnacollege";
    removeDuplicate(str,0,new StringBuilder(""),new boolean[26]);
  }
} 



public class Recursion{
  public static int friendPairing(int n){
    if (n==1||n==2){
      return n;

    }
    // //choice
    // //single
    // int fnm1=friendPairing(n-1);

    // //pair
    // int fnm2=friendPairing(n-2);
    // int pairways=(n-1)*fnm2;

    // //total ways 
    // int totways=fnm1+pairways;
    // return totways;


    return friendPairing(n-1)+(n-1)*friendPairing(n-2);              //all this can be done by just one single statement.


  }
  public static void main(String args[]){

    System.out.print(friendPairing(3));
  }
}






public class Recursion{
  public static void printBinaryStr(int n,int lastPlace,String str){
    //base case
    if(n==0){
      System.out.println(str);
      return; 
    }

    //kaam
    printBinaryStr(n-1,0,str+"0");
    if (lastPlace ==0 ){
      printBinaryStr(n-1,1,str+"1");
    }
  }
  public static void main(String args[]){
    printBinaryStr(3,0,"");
  }
}