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
    int arr[]={2,4,6,7,8,9,11,23,45};                        //we need sorted array
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


import java.util.*;                        //pair in arrays 
public class Arrays{

  public static void subArray(int arr[]){
    int count=0;
    for (int i=0;i<arr.length;i++){
      
      for (int j=i+1;j<arr.length;j++){
        System.out.print("("+arr[i]+","+arr[j]+")");
        count++;
      }
      System.out.println();
    }
    System.out.print("no. of subArrays: "+count);
  }

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    int arr[]={2,4,6,8,10};
    subArray(arr);
  }
}


import java.util.*;                            //print all sub arrays          
public class Arrays{
  public static void printSubArray(int arr[]){
    int count=0;
    for (int i=0;i<arr.length;i++){
      for (int j=i;j<arr.length;j++){
        for(int k=i;k<=j;k++){
          System.out.print(arr[k]+" ");
          count++;
        }
        System.out.println();
      }
      System.out.println();
    }
    System.out.println("Total no of sub arrays: "+count);

  }
  public static void main(String args[]){
    int arr[]={2,4,6,8,10};
    printSubArray(arr);
  }
}



// max subarraysum-1(BRUTE force)   complexity O(n^3)

import java.util.*;
public class Arrays{
  public static void maxsubarraysum(int arr[]){
    int currsum=0;
    int maxsum=Integer.MIN_VALUE;
    for (int i=0;i<arr.length;i++){
      for(int j=i;j<arr.length;j++){
        currsum=0;
        for (int k=i;k<=j;k++){
          currsum+=arr[k];
        }
        System.out.println(currsum);
        if(maxsum<currsum){
          maxsum=currsum;
        }
      }
    }
    System.out.print("max Sum is:"+maxsum);
  }


  public static void main(String args[]){
    int arr[]={2,4,6,8,10};
    maxsubarraysum(arr);
  }
  
// }



//MaxSubarray Sum-2 Prefix array   complexity -O(n^2)

import java.util.*;
public class Arrays{

  public static void maxsubarray(int numbers[]){
      int currsum=0;
      int maxsum=Integer.MIN_VALUE;
      int prefix[]=new int[numbers.length];

      prefix[0]=numbers[0];
      // calculate prefix array
      for(int i=1;i<prefix.length;i++){
      prefix[i]=prefix[i-1]+numbers[i];
      }
      for(int i=0;i<numbers.length;i++){
        int start=i;
        for(int j=i;j<numbers.length;j++){
          int end=j;
          currsum= start==0? prefix[end]: prefix[end]-prefix[start-1];
          if(maxsum<currsum){
            maxsum=currsum;
          }
        }
      }
      System.out.println("max sum =" + maxsum);

    }
    public static void main(String args[]){
    int arr[]={-2,-3,4,-1,-2,1,5,-3};
    maxsubarray(arr);
  } 
}



import java.util.*;                                        //kadanes algo   max sum subarray-3   complexity-O(n)

  public class Arrays{
    public static void kadanes(int arr[]){
    int maxsum=Integer.MIN_VALUE;
    int currsum=0;
    for(int i=0;i<arr.length;i++){
      currsum=currsum+arr[i];
      if(currsum<0){
        currsum=0;

      }
      maxsum=Math.max(currsum,maxsum);
    }
    System.out.print("oour max subarray sum is: "+maxsum);
  }

  public static void main(String args[]){
    int arr[]={-2,-3,4,-1,-2,1,5,-3};
    kadanes(arr);
  } 
}
  
  
  
//----------------------------- TRAPPING WATER ---------------- O(n)



public class Arrays{

  public static int trappingWater(int height[]){

    int n=height.length;
    //calculate left max boundary - helping array
    int leftMax[]=new int[n];
    leftMax[0]=height[0];
    for (int i=1;i<n;i++){
      leftMax[i]=Math.max(height[i], leftMax[i-1]);
    }
    //calculate right max boundary - helping array
    int rightMax[]=new int [n];
    rightMax[n-1]=height[n-1];
    for (int i=n-2;i>=0;i--){
      rightMax[i]=Math.max(height[i], rightMax[i+1]);

    }

    int trappedwater=0;
    int width=1;
    //loop-
    for (int i=0;i<n;i++){
      //waterlevel=min(left boundary ,right boundary)
      int waterlevel=Math.min(leftMax[i], rightMax[i]);

      //trappedwater =wtaerlevel-heigth[i]+width(1)
      trappedwater += waterlevel-height[i]* width; 
    }
    
    return trappedwater;

  }

  public static void main(String args[]){
    int height[]={4,2,0,6,3,2,5};
    System.out.print(trappingWater(height));
  }
}








//----------------------- buy and sell stock ---------  complexity-O(n)


public class Arrays{
  public static int buyAndsellStocks(int prices[]){
    int buyPrice=Integer.MAX_VALUE;
    int maxProfit=0;

    for (int i=0;i<prices.length;i++){
      if (buyPrice < prices[i]){          //----profit
        int profit = prices[i ]-buyPrice;                //--------today's profit
        maxProfit = Math.max(maxProfit,profit);
      } else{
        buyPrice=prices[i];        //update buyprice 
      }
    }
    return maxProfit;
  } 
  
  public static void main(String args[]){
    int prices[]={7,1,5,3,6,4};
    System.out.print("Maximum Profit: "+buyAndsellStocks(prices));
  }
}








//--------------------------------------------------------sorting ---------------------

  
  
  
public class Arrays{                                            //bubble sort
  public static void bubbleSort(int arr[]){
    for (int i=0;i<arr.length-1;i++){
      for (int j=0;j<arr.length-i-1;j++){
        if (arr[j]>arr[j+1]){
          //swap
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
          
        }

      }
    }
    for (int i=0;i<arr.length;i++){
      System.out.print(arr[i] +" ");
    }
    
    
  }

  public static void main(String args[]){
    int arr[]={2,4,1,3,5};
    bubbleSort(arr);
  }
}



  
  
public class Arrays{                                        //-------------optimized bubble sort

  public static void optimizedBubble(int arr[]){               
    for(int i=0;i<arr.length-1;i++){
      boolean Swapped=false;
      for (int j=0;j<arr.length-i-1;j++){
        if (arr[j]>arr[j+1]){
          //swap
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
          Swapped=true;
        }
        
      }
      if (Swapped==false){
        break;
      }
    }
    for (int  i=0;i<arr.length;i++){
      System.out.print(arr[i]+" "); 
    }
  }

  public static void main(String args[]){
    int arr[]={2,4,3,5,1};
    optimizedBubble(arr);
  }
}


//------------------------------------------------------------------------------------





// ----------------------2D arrays------------------------


import java.util.*;
public class Arrays{
  public static void matrix(int r,int c){
    Scanner sc=new Scanner(System.in);
    int matrics[][]=new int[r][c];                     // taking input in 2d array
    int n=matrics.length,  m=matrics[0].length;       //n has row length ,m has column length
    for (int i=0;i<n  /*row length */;i++){
      for(int j=0;j<m  /*colunm length */;j++){
        matrics[i][j]=sc.nextInt();
      }
    } 
    for(int i=0;i<n;i++){                       // printing of matrics elements

      for (int j=0;j<m;j++){
        System.out.print(matrics[i][j]+" ");
      }
      System.out.println();
    }
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt(); 
    matrix(r,c);
  }
}




// ----------------------- spiral matric


import java.util.*;
public class Arrays{
  public static void spiral(int arr[][]){
    int startrow=0;
    int startcol=0;
    int endrow=arr.length-1;
    int endcol= arr[0].length-1;
    while(startrow<=endrow && startcol<=endcol){
      //for top
      for(int j=startcol;j<=endcol;j++){
        System.out.print(arr[startrow][j]+" ");
      }

      //for right
      for(int i=startrow+1;i<=endrow;i++){
        System.out.print(arr[i][endcol]+" ");
      }

      //for bottom
      for(int j=endcol-1;j>=startcol;j--){
        System.out.print(arr[endrow][j]+" ");
        if(startrow==endrow){
          break;
        }
      }

      //for left
      for(int i=endrow-1;i>=startrow+1;i--){
        System.out.print(arr[i][startcol]+" ");
        if(startcol==endcol){
          break;
        }
      }
      startrow++;
      startcol++;
      endrow--;
      endcol--;
    }
    System.out.println();
  }
  public static void main(String args[]){
    int arr[][]={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
    spiral(arr);
  }
}




//---------------diagonal sum


import java.util.*;
public class Arrays{
  public static void diagonalsum(int arr[][]){
    
    
    
    int sum=0;                   //--------not a optimised approch complexity O(n^2)
    for (int i=0;i<arr.length;i++){
      for (int j=0;j<arr[0].length;j++){
        if(i==j){
          sum+=arr[i][j];
        }
        else if(i+j==arr.length-1){ //secondary diagonal condition
          sum+=arr[i][j];
        }
      }
    }
    System.out.print( sum);




//     //--------optimised way     complexity O(n)

    int sum=0;
    for (int i=0;i<arr.length;i++){
      //primary diagonal
      sum+=arr[i][i];             //jaha jaha row column same vo sum me add
      //secondary diagonal
      if (i!=arr.length-1-i){
        sum+=arr[i][arr.length-1-i];   // 
      }
    }
    System.out.print( sum);
    
  }
  public static void main(String args[]){
    int arr[][]={{1,2,3,4,2},
                {5,6,7,8,3},
                {9,10,11,12,5},
                {13,14,15,16,7},
                {17,18,19,20,1}};
    diagonalsum(arr);
  }
}





//------------search in 2d array                                    //starircase method

import java.util.*;
public class Arrays{
  public static boolean staircaseSearch(int arr[],int key){
    int row=0;
    int col=arr[0].length-1;

    while(row<arr.length && col>=0){
      if(arr[row][col]==key){
        System.out.println("found key at ("+ row + "," +col+")");
        return true;
      }
      else if(key <arr[row][col]){
        col--;
      }
      else{
        row++;
      }
    }
    System.out.println("key not found!");
    return false;
  }

  public static void main(String args[]){
    int arr[][]={{1,2,3,4,2},
                 {5,6,7,8,3},
                 {9,10,11,12,5},
                 {13,14,15,16,7},
                 {17,18,19,20,1}};
    int key=18;
    staircaseSearch(arr,key);
  }
}

