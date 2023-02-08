/*Q. while marking the  marks of student due to some error there is fault in marks of student now WAP to upadte marks of all student and increase it by 10 for all. 
*/


import java.util.*;
public class Arrays{

  
  public static void update (int marks[]){
    System.out.println("updating value: ");
    for (int i=0;i<marks.length;i++){
      marks[i]+=10;

    }
    for (int i=0;i<marks.length;i++){
      System.out.println("marks "+i+": "+marks[i] );
    }
  }
  public static void main(String arga[]){
    Scanner sc=new Scanner(System.in);
    int marks[]=new int[5];
    // int marks[]={88,67,45};
    for (int i=0;i<marks.length;i++){
      marks[i]=sc.nextInt();
    }
    System.out.println("original values:");
    for (int i=0;i<marks.length;i++){
      System.out.println("marks "+i+": "+marks[i] );
    }
    update(marks);

  }
}




/*-------linear search---------*/

import java.util.*;
public class Arrays{
  public static int linearSearch(int arr[],int n){
    for (int i=0;i<arr.length;i++){
      if (arr[i]==n){
        return i;
      }
    }
    return -1;
  }


  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    int arr[]=new int[10];
    System.out.println("Enter elements in an array of size 10");
    for (int i=0;i<arr.length;i++){
      
      arr[i]=sc.nextInt();
    }
    

    System.out.print("Enter value to be found: ");
    int n=sc.nextInt();

    int var=linearSearch(arr,n);
    System.out.print(n+" is on index: "+var);


  }
}




//---------greatest from the array----------

import java.util.*;
public class Arrays{
  public static void main(String args[]){
    int arr[]={10,7,6,12,4,3};
    int max=arr[0];
    System.out.println("max before: "+max);
    for(int i=0;i<arr.length;i++){
      if (max<arr[i]){
        max=arr[i];
      }

    }
    System.out.print("max after: "+max);


  }

}


//-----------binary search------------

import java.util.*;
public class Arrays{

  public static int binarySearch(int arr[],int n,int lo,int up){
    while(lo<=up){
    int mid =(lo+up)/2;
    
    if(arr[mid]==n){
      return mid;
    }
    if (arr[mid]>n){
      // up=mid-1;
      return binarySearch(arr,n,lo,mid-1);
    }
    if (arr[mid]<n){
      // lo=mid+1;
      return binarySearch(arr,n,mid+1,up);
    }
    }
    return -1;
  }

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int arr[]={2,4,6,7,8,9,11,23,45};     //we need sorted array
    System.out.print("enter value to find");
    int n=sc.nextInt();
    int val=binarySearch(arr,n,0,arr.length-1);
    if (val>=0){
    System.out.print(n+" is on the index: "+val);}
    else{
      System.out.print(n+" Not Found");
    }
  }
}


//----------------Reversed array-------

import java.util.*;
public class Arrays{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int arr[]={23,34,56,77,54,34};
    System.out.println("original");
    for (int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();

    int lo=0, up= arr.length-1;
    while (lo<=up){
      int temp=arr[lo];
      arr[lo]=arr[up];
      arr[up]=temp;
      lo++;
      up--;
    }
    System.out.println("reversed-");
    for (int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
}


//--------------pair of array------------

import java.util.*;
public class Arrays{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    
  }
}
