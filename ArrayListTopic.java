/*it is a keyword which provide us a linear data structure of dynamic size
simple difference between array and arraylist is fixed & dynamic  size
, can use primitive datatypes but arraylist cant us e primitive datatypes it can be of non primitive type (E.g Integer, String, Boolean).

*/




//                  //------------------------SYNTAX OF ARRAYLIST-----------------
// import java.util.ArrayList;       // need to imort ArrayList library or util.* can also work
// public class ArrayListTopic{
//   public static void main(String args[]){
//     ArrayList<Integer>        list          =    new              ArrayList<>();
//       /* ^         ^               ^                 ^                      ^
//        is     non-primitive   object name        memory locator         class name
//        class   datatype
//        name */



//     // ArrayList<String> list2=new ArrayList<>();
//     // ArrayList<Boolean> list3=new ArrayList<>();


//     // --------------------------------Operations on ArrayList-------------

//     //1. Add Element     -O(1)

//     list.add(1);
//     list.add(2);
//     list.add(3);
//     list.add(4);
//     list.add(5);
//     // System.out.println(list);
//     list.add(6);
//     list.add(7);
//     System.out.println(list);




//     // we can also add element at specific index             -O(n)


//     list.add(1,9);                             //at index 1 9 is added and all other element get shifted forward
//     System.out.println(list);






//     //2. get elemnt at index from arraylist         -O(1)

//     // int element=list.get(2);   //2 is index
//     // System.out.println("element at index is "+element);





//     //3.  remove element from index        -O(n)


//     // list.remove(2);
//     // System.out.println("element removed from index "+list);





//     //4. set element at index       -O(n)

//     // list.set(2,10);            //element at index 2 is replaced by 10
//     // System.out.println(list);                                // syntax ---- objectname.set(index,element)




//     //5. contains element or not      -O(n)


//     // System.out.println(list.contains(1));              //for this it returns true
//     // System.out.println(list.contains(11));             //for this it returns false 






//     // 6.size of ArrayList ( AL )

//     // System.out.println(list.size());       //it return size of AL.



//     // for (int i=0;i<list.size();i++){                //we can also iterate in AL using this size().
//     //   System.out.print(list.get(i)+" ");
//     // } 
//     // System.out.println();

//   }
// }










// import java.util.ArrayList;                                //-------------- print reverse AL
// public class ArrayListTopic{
//   public static void main(String args[]){
//     ArrayList <Integer> list=new ArrayList<>();
//     list.add(1);
//     list.add(2);
//     list.add(3);
//     list.add(4);
//     list.add(5);
//     list.add(6);
//     for(int i=list.size()-1;i>=0;i--){
//       System.out.print (list.get(i)+" ");
//     }
//     System.out.println();
//   }
// }





// import java.util.ArrayList;               //---------------------------Find Maximum
// public class ArrayListTopic{

//   public static void main (String args[]){
//     int max=Integer.MIN_VALUE;
//     ArrayList<Integer> list=new ArrayList<>();
//     list.add(1);
//     list.add(7);
//     list.add(3);
//     list.add(9);
//     list.add(4);
//     list.add(5);
//     list.add(2);
//     list.add(8);
//     for (int i=0;i<list.size();i++){
//       // if (list.get(i)>max){
//       //   max=list.get(i);
//       // }
//       max=Math.max(max,list.get(i));            //we can also use this Math library to find and update vale of max 
//     }
//     System.out.println("Maximum element: "+max);
//   }
// }




// import java.util.ArrayList;                          //----------------Swap elements of AL by their indexes.
// public class ArrayListTopic{

// public static void swap(ArrayList<Integer> list,int idx1,int idx2){
//   int temp=list.get(idx1);
//   list.set(idx1,list.get(idx2));
//   list.set(idx2,temp);
// }

//   public static void main (String args[]){
//     ArrayList<Integer> list=new ArrayList<>();
//     list.add(1); 
//     list.add(2);
//     list.add(3);
//     list.add(4);
//     list.add(5);


//     int idx1=1,idx2=3;
//     System.out.println("Un-Swapped list"+list);
//     swap(list,idx1,idx2);
//     System.out.println("Swapped list"+list);
//   }
// }




// import java.util.ArrayList;              //multi dimentional Arraylist

// public class ArrayListTopic{
//   public static void main(String args[]){
//     ArrayList <ArrayList<Integer>> mainlist1= new ArrayList<>();        //this is multidimensional

    // ArrayList<Integer> list=new ArrayList<>();
    // list.add(1);list.add(2);
    // list.add(3); list.add(4);list.add(5);
    // mainlist1.add(list);  //by this normal arraylist get added into main arrayList.


    // ArrayList <Integer> list2= new ArrayList<>();
    // list2.add(2);
    // list2.add(4);
    // list2.add(6);
    // list2.add(8);
    // list2.add(10);
    // mainlist1.add(list2);


    // ArrayList <Integer> list3= new ArrayList<>();
    // list3.add(3);
    // list3.add(6);
    // list3.add(9);
    // list3.add(12);
    // list3.add(15);
    // mainlist1.add(list3);



    //--------OR WE CAN DO ---------

//     ArrayList <Integer> list1= new ArrayList<>();
//     ArrayList <Integer> list2= new ArrayList<>();
//     ArrayList <Integer> list3= new ArrayList<>();

//     for (int i=1;i<=5;i++){
//       list1.add(i*1);   //1 2 3 4 5
//       list2.add(i*2);   //2 4 6 8 10
//       list3.add(i*3);   //3 6 9 12 15 
//     }
    

//     mainlist1.add(list1);
//     mainlist1.add(list2);
//     mainlist1.add(list3);
//     list2.remove(2);    //different length of lists can also be stored in 2-d array.
//     list2.remove(3);

//     for (int i=0;i<mainlist1.size();i++){
//       ArrayList<Integer> currList =mainlist1.get(i);
//       for (int j=0;j<currList.size();j++){
//         System.out.print(currList.get(j)+" ");
//       }
//       System.out.println();
//     }


//     System.out.print(mainlist1);           //this will show full structure of multidimensional list
//   }
// }





// import java.util.ArrayList;          //container water Brute Force
// public class ArrayListTopic{

//   public static int containerWater(ArrayList<Integer > height){
//     int maxWater=0;


//     //brute force
//     for (int i=0;i<height.size();i++){
//       for (int j=0;j<height.size();j++){
//         int ht=Math.min(height.get(i), height.get(j));
//         int width=j-i;
//         int currWater=ht*width;
//         maxWater=Math.max(maxWater,currWater);
//       }
//     }
//     return maxWater;
//   }



//   public static void main(String args[]){
//    ArrayList <Integer> height=new ArrayList<>();
//    //1,8,6,2,5,4,8,3,7
//    height.add(1);
//    height.add(8);
//    height.add(6); 
//    height.add(2);
//    height.add(5);
//    height.add(4);
//    height.add(8);
//    height.add(3);
//    height.add(7);
//    System.out.print("Maximum water contained: "+containerWater(height));
//   }
// }








// ------------container water 2 pointer approch----

// import java.util.ArrayList;
// public class ArrayListTopic{
//     public static int storeWater(ArrayList<Integer> height){
//         int maxWater=0;
//         int lp=0;
//         int rp=height.size()-1;
//         while(lp<rp){
//             //calculate water area
//             int ht =Math.min(height.get(lp),height.get(rp));
//             int width=rp-lp;
//             int currWater=ht*width;
//             maxWater=Math.max(maxWater,currWater);

//             //update ptr
//             if (height.get(lp)<height.get(rp)){
//                 lp++;

//             }else{
//                 rp--;
//             }
//         }
//         return maxWater;
//     }
//     public static void main(String args[]){
//     ArrayList<Integer> height=new ArrayList<>();
//     height.add(1);
//     height.add(8);
//     height.add(6);    
//     height.add(2);
//     height.add(5);
//     height.add(4);
//     height.add(8);
//     height.add(3);
//     height.add(7);
//     System.out.print(storeWater(height));
//     }
// }













// import java.util.ArrayList;      //----------pairsum1 (Brute Force)

// public class ArrayListTopic{
//   public static boolean pairSum1(ArrayList <Integer> list,int target){
//     for (int i=0;i<list.size();i++){
//       for (int j=i+1;j<list.size();j++){
//         if ((list.get(i)+list.get(j))==target){
//           return true;
//         }
//       }
//     }
//     return false;
//   }
//   public static void main(String args[]){
//     ArrayList <Integer> list=new ArrayList<>();
//     list.add(1);
//     list.add(2);
//     list.add(3);
//     list.add(4);
//     list.add(5);
//     list.add(6);

//     int target=7;
//     System.out.print (pairSum1(list,target));
//   }
// }





// import java.util.ArrayList;            //-----optimised way for pair sum ArrayList (2-pointer approach)
// public class ArrayListTopic{
//   public static boolean pairSum1(ArrayList <Integer> list,int target){
//     int n=list.size();
//     int st=0;
//     int end=n-1;
//     while(st<end){
//       if ((list.get(st)+list.get(end))==target){
//         return true;
//       }
//       if((list.get(st)+list.get(end))<target){
//         st++;

//       }else{
//         end--;
//       }
//     }
//     return false;
//   }
//   public static void main(String args[]){
//     ArrayList <Integer> list=new ArrayList<>();
//     list.add(1);
//     list.add(2);
//     list.add(3);
//     list.add(4);
//     list.add(5);
//     list.add(6);

//     int target=5;
//     System.out.print(pairSum1(list,target));
//   }
// }





// -------------------Pair Sum 2-------------


// import java.util.ArrayList;          // 2 pointer approach  -O(n)
// public class ArrayListTopic{
//   public static boolean pairSum2(ArrayList <Integer> list,int target ){
//     int bp=-1;
//     for (int i=0;i<list.size();i++){
//         if (list.get(i)>list.get(i+1)){     //breaking point 
//             bp=i;
//             break;
//         }
//     }
//     int n=list.size();
//     int st=bp+1;       //starting point 
//     int end=bp;        //end point

//     while(st!=end){
//         //case 1
//         if ((list.get(end)+list.get(st))==target){
//             return true;
//         }
//         //case 2
//         if ((list.get(end)+list.get(st))<target){
//             st=(st+1)%n;
//         }
//         //case 3
//         else{
//             end=(n+end-1)%n;
//         }
//     }
//     return false;
    
//   }
//   public static void main(String args[]){
//     ArrayList <Integer> list =new ArrayList<>();
//     //11 15 6 8 9 10 -sorted and rotated Arraylist
//     list.add(11);
//     list.add(15);
//     list.add(6);
//     list.add(8);
//     list.add(9);
//     list.add(10);
//     int target=16;
//     System.out.print(pairSum2(list,target));

//   }
// }