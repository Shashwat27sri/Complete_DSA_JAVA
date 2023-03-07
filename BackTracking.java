public class BackTracking {
  
  public static void printArr(int arr[]){
    for (int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

  public static void changeArr(int arr[],int i, int val){          //while going up increase val in arr and while returning -2 from every position of array.

    //Base Case
    if (i==arr.length){
      printArr(arr);
      return;
    }

    //kaam (recursion)
    arr[i]=val;
    changeArr(arr,i+1,val+1);     //function call statement 
    arr[i]=arr[i]-2;    //backtracking step


  }

  public static void main(String args[]){
    int arr[]= new int[5];
    changeArr(arr,0,1);
    printArr(arr);
  }
}







public class BackTracking{                            //---------------------------------------------------finding subset        complexity-O(n * 2^n)

  public static void findSubsets(String str,String ans,int i){
    //base case
    if (i==str.length()){
      if(ans.length()==0){
        System.out.print("null");
      }else{
      System.out.println(ans);
      }
      return;
    }

    //recursion
    // choioce yes 
    findSubsets(str,ans+str.charAt(i),i+1);
    //choice no
    findSubsets(str,ans,i+1);
  }


  public static void main(String args[]){
    String str="abc";
    findSubsets(str,"",0);
  }
}




public class BackTracking{                                        //find number of permutations       complexity-O(n * n!)
  public static void findPermutation(String str,String ans){
    //base case
    if(str.length()==0){
      System.out.println(ans);
      return;
    }
    //recursion
    for(int i=0;i<str.length();i++){
         initialsing 
      char current=str.charAt(i);

      //deleting picked character
      //"abcde"="ab"+"de"="abde"        c is picked
      String newStr=str.substring(0,i)+str.substring(i+1);       //if we dont write anything it take till end 
      
      findPermutation(newStr,ans+current);
    }
  }
  public static void main(String args[]){
    String str="abc";
    findPermutation(str,"");
  }
}





// // ---------------------- N Queens ---------------------------------


// //without checking Queens attack we just find all the possible sequences/combinations to place queens in each rows- just remove the isSafe function



// //----------------------- nQueens -All Solutions-----------------



public class BackTracking {

  public static boolean isSafe(char board[][],int rows ,int col){     //to provide security to queens 
     
    //------------vertically up

    for(int i=rows-1;i>=0;i--){
      
      if(board[i][col]=='Q'){
        return false;
      }

    }

    //--------------diagonal left up

    for(int i=rows-1 ,j=col-1; i>=0 && j>=0;i--,j--){
      if(board[i][j]=='Q'){
        return false;
      }
    }

    //---------------diagonal right up

    for(int i=rows-1 ,j=col+1; i>=0 && j<board.length;i--,j++){
      if(board[i][j]=='Q'){
        return false;
      }
    }

    return true;
  }

  public static void nQueens(char board[][],int rows){

    
    //base case
    if(rows == board.length){
      printBoard(board);
      return;
    }
    //column loop
    for (int j=0;j<board.length;j++){
      if(isSafe(board,rows,j)){
      board[rows][j]='Q';
      nQueens(board,rows+1);       //function calling 
      board[rows][j]='x';}          // back tracking it again update the last Queen pos to "."
    }

  }

  public static void printBoard(char board[][]){
    System.out.println("------------------ chess board ----------------");
    for (int i=0;i<board.length;i++){
      for (int j=0;j<board.length;j++){
        System.out.print(board[i][j]+" ");
      }
      System.out.println();
    }
  }


  public static void main(String args[]){
    int n=4;
    char board[][]=new char[n][n];
    for (int i=0;i<n;i++){
      for (int j=0;j<n;j++){
        board[i][j] = 'x';
      }
    }

    nQueens(board,0);
  }
}

 


// ------------------- N Queens - count ways  ------------------------------------


public class BackTracking {

  public static boolean isSafe(char board[][],int rows ,int col){     //to provide security to queens 
     
    //------------vertically up

    for(int i=rows-1;i>=0;i--){
      
      if(board[i][col]=='Q'){
        return false;
      }

    }

    //--------------diagonal left up

    for(int i=rows-1 ,j=col-1; i>=0 && j>=0;i--,j--){
      if(board[i][j]=='Q'){
        return false;
      }
    }

    //---------------diagonal right up

    for(int i=rows-1 ,j=col+1; i>=0 && j<board.length;i--,j++){
      if(board[i][j]=='Q'){
        return false;
      }
    }

    return true;
  }

  public static void nQueens(char board[][],int rows){

    
    //base case
    if(rows == board.length){
      count ++;
      return;
    }
    //column loop
    for (int j=0;j<board.length;j++){
      if(isSafe(board,rows,j)){
      board[rows][j]='Q';
      nQueens(board,rows+1);       //function calling 
      board[rows][j]='x';}          // back tracking it again update the last Queen pos to "."
    }

  }

  public static void printBoard(char board[][]){
    System.out.println("------------------ chess board ----------------");
    for (int i=0;i<board.length;i++){
      for (int j=0;j<board.length;j++){
        System.out.print(board[i][j]+" ");
      }
      System.out.println();
    }
  }


  static int count =0;
  public static void main(String args[]){
    int n=4;
    char board[][]=new char[n][n];
    for (int i=0;i<n;i++){
      for (int j=0;j<n;j++){
        board[i][j] = 'x';
      }
    }

    nQueens(board,0);
    System.out.print("No. of ways to find "+count);
  }
}




------------ N Queens - print 1 solution  ------------------------------------


public class BackTracking {

  public static boolean isSafe(char board[][],int rows ,int col){     //to provide security to queens 
     
    //------------vertically up

    for(int i=rows-1;i>=0;i--){
      
      if(board[i][col]=='Q'){
        return false;
      }

    }

    //--------------diagonal left up

    for(int i=rows-1 ,j=col-1; i>=0 && j>=0;i--,j--){
      if(board[i][j]=='Q'){
        return false;
      }
    }

    //---------------diagonal right up

    for(int i=rows-1 ,j=col+1; i>=0 && j<board.length;i--,j++){
      if(board[i][j]=='Q'){
        return false;
      }
    }

    return true;
  }

  public static boolean nQueens(char board[][],int rows){

    
    //base case
    if(rows == board.length){
      count ++;
      return true;
    }
    //column loop
    for (int j=0;j<board.length;j++){
      if(isSafe(board,rows,j)){
      board[rows][j]='Q';
      
      if (nQueens(board,rows+1)){                  //function calling
        return true;
      }        
      board[rows][j]='x';
      }          // back tracking it again update the last Queen pos to "."
    }
    return false ;

  }

  public static void printBoard(char board[][]){
    System.out.println("------------------ chess board ----------------");
    for (int i=0;i<board.length;i++){
      for (int j=0;j<board.length;j++){
        System.out.print(board[i][j]+" ");
      }
      System.out.println();
    }
  }


  static int count =0;
  public static void main(String args[]){
    int n=4;
    char board[][]=new char[n][n];
    for (int i=0;i<n;i++){
      for (int j=0;j<n;j++){
        board[i][j] = 'x';
      }
    }

    if (nQueens(board,0)){
      System.out.println("solution is possible ");
      printBoard(board);
    }
    else{
    System.out.print("No. of ways to find "+count);}
  }
}








//--------------------- total no. of grid ways----------------------------

public class BackTracking{
  
  public static int gridWays(int i,int j,int n,int m){
    //base case
    if (i==n-1 && j==m-1){             //if position = target postion 
      return 1;
    }else if( i==n || j==m){                         //condition for when i and j exceeds from size
      return 0;
    }

    int w1=gridWays(i+1,j,n,m);         //down choice
    int w2=gridWays(i,j+1,n,m);           //Right choice
    return w1+w2;
  }
  
  public static void main (String args[]){
    int n=3,m=3;
    System.out.print("total no. of Ways  "+gridWays(0,0,n,m)); 
  }
}




//--------------------------------- sudoku solver ---------------------------

public class BackTracking{
  
  public static boolean isSafe(int sudoku[][],int row,int col,int digit){

    //column
    for(int i=0;i<=8;i++){
      if (sudoku[i][col] == digit){
        return false;
      }
    }



    //row 
    for (int j=0;j<=8;j++){
      if (sudoku[row][j] == digit){
        return false;
      }
    }


    //grid
    int sr=(row/3)*3;
    int sc=(col/3)*3;
    //3X3 grid
    for (int i=sr; i<sr+3;i++){
      for (int j=sc; j<sc+3;j++){
        if (sudoku[i][j] == digit){
          return false;
        }
      }
    }

     return true;
  }

  public static boolean sudokuSolver(int sudoku[][],int row ,int col){

    //base case
    if(row==9){
      return true;
    }


    //recursion
    int nextRow=row, nextCol = col+1; 
    if(col+1 == 9){
      nextRow= row+1;
      nextCol =0 ;
    }



    if (sudoku[row][col] !=0){
      return sudokuSolver(sudoku,nextRow,nextCol);
    }

    for (int digit=1;digit<=9;digit++){
      if (isSafe(sudoku,row,col,digit)){
        sudoku[row][col]=digit;
        if(sudokuSolver(sudoku,nextRow,nextCol)){           //if solution exists
          return true;
        }
        sudoku[row][col]=0;
      }
    }


    return false;
  }


  public static void printSudoku(int sudoku[][]){
    for (int i=0;i<9;i++){
      for (int j=0;j<9;j++){
        System.out.print(sudoku[i][j]+" ");
      }
      System.out.println();
    }
  }
  public static void main(String args[]){
    int sudoku[][]={
      {0,0,8,0,0,0,0,0,0},
      {4,9,0,1,5,7,0,0,2},
      {0,0,3,0,0,4,1,9,0},
      {1,8,5,0,6,0,0,2,0},
      {0,0,0,0,2,0,0,6,0},
      {9,6,0,4,0,5,3,0,0},
      {0,3,0,0,7,2,0,0,4},
      {0,4,9,0,3,0,0,5,7},
      {8,2,7,0,0,9,0,1,3} };

      if (sudokuSolver(sudoku,0,0)){
        System.out.println("solution exists");
        printSudoku(sudoku);

      }else{
        System.out.println("solution does not exists");
      }

  }
}
