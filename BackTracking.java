// public class BackTracking {
  
//   public static void printArr(int arr[]){
//     for (int i=0;i<arr.length;i++){
//       System.out.print(arr[i]+" ");
//     }
//     System.out.println();
//   }

//   public static void changeArr(int arr[],int i, int val){          //while going up increase val in arr and while returning -2 from every position of array.

//     //Base Case
//     if (i==arr.length){
//       printArr(arr);
//       return;
//     }

//     //kaam (recursion)
//     arr[i]=val;
//     changeArr(arr,i+1,val+1);     //function call statement 
//     arr[i]=arr[i]-2;    //backtracking step


//   }

//   public static void main(String args[]){
//     int arr[]= new int[5];
//     changeArr(arr,0,1);
//     printArr(arr);
//   }
// }


// public class BackTracking{                            //finding subset        complexity-O(n * 2^n)

//   public static void findSubsets(String str,String ans,int i){
//     //base case
//     if (i==str.length()){
//       if(ans.length()==0){
//         System.out.print("null");
//       }else{
//       System.out.println(ans);
//       }
//       return;
//     }

//     //recursion
//     // choioce yes 
//     findSubsets(str,ans+str.charAt(i),i+1);
//     //choice no
//     findSubsets(str,ans,i+1);
//   }


//   public static void main(String args[]){
//     String str="abc";
//     findSubsets(str,"",0);
//   }
// }




// public class BackTracking{                                        //find number of permutations       complexity-O(n * n!)
//   public static void findPermutation(String str,String ans){
//     //base case
//     if(str.length()==0){
//       System.out.println(ans);
//       return;
//     }
//     //recursion
//     for(int i=0;i<str.length();i++){
         //initialsing 
//       char current=str.charAt(i);

//       //deleting picked character
//       //"abcde"="ab"+"de"="abde"        c is picked
//       String newStr=str.substring(0,i)+str.substring(i+1);       //if we dont write anything it take till end 
      
//       findPermutation(newStr,ans+current);
//     }
//   }
//   public static void main(String args[]){
//     String str="abc";
//     findPermutation(str,"");
//   }
// }





// // ---------------------- N Queens ---------------------------------


// //without checking Queens attack we just find all the possible sequences/combinations to place queens in each rows- just remove the isSafe function



// //----------------------- nQueens -All Solutions-----------------



// public class BackTracking {

//   public static boolean isSafe(char board[][],int rows ,int col){     //to provide security to queens 
     
//     //------------vertically up

//     for(int i=rows-1;i>=0;i--){
      
//       if(board[i][col]=='Q'){
//         return false;
//       }

//     }

//     //--------------diagonal left up

//     for(int i=rows-1 ,j=col-1; i>=0 && j>=0;i--,j--){
//       if(board[i][j]=='Q'){
//         return false;
//       }
//     }

//     //---------------diagonal right up

//     for(int i=rows-1 ,j=col+1; i>=0 && j<board.length;i--,j++){
//       if(board[i][j]=='Q'){
//         return false;
//       }
//     }

//     return true;
//   }

//   public static void nQueens(char board[][],int rows){


//     //base case
//     if(rows == board.length){
//       printBoard(board);
//       return;
//     }
//     //column loop
//     for (int j=0;j<board.length;j++){
//       if(isSafe(board,rows,j)){
//       board[rows][j]='Q';
//       nQueens(board,rows+1);       //function calling 
//       board[rows][j]='x';}          // back tracking it again update the last Queen pos to "."
//     }

//   }

//   public static void printBoard(char board[][]){
//     System.out.println("------------------ chess board ----------------");
//     for (int i=0;i<board.length;i++){
//       for (int j=0;j<board.length;j++){
//         System.out.print(board[i][j]+" ");
//       }
//       System.out.println();
//     }
//   }


//   public static void main(String args[]){
//     int n=4;
//     char board[][]=new char[n][n];
//     for (int i=0;i<n;i++){
//       for (int j=0;j<n;j++){
//         board[i][j] = 'x';
//       }
//     }

//     nQueens(board,0);
//   }
// }