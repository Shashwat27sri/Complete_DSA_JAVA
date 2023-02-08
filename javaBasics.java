// public class javaBasics{
//     public static void main(String args[]){
//         system.out.print("hello world");
//     }
// } 
// import java.util.*;
// public class javaBasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);



        // System.out.print("1 2 3 4 5");   //println gives the next line  
        // System.out.println("1 2 3 4 5");   //print continues in same line
        // System.out.print("\t1 2 3 4 5\n");
        // System.out.println("1 2 3 4 5\n 1 2 3 4 5\n1 2 3 4 5 6 ");


        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");


        // int a =100;
        // System.out.println(a);
        // int b=50;
        // System.out.println("b");

        // String name="tony stark";
        // System.out.println("name ="+name);


        // int a=10;
        // int b=50;
        // int c;
        // c=a+b;
        // System.out.println("c:\t"+c);

        // String name = sc.next();
        // System.out.println(name); //single word input

        // String full =sc.nextLine();
        // System.out.println(full);  // with spaces input full sentance

        // int data = sc.nextInt();
        // System.out.println(data); //integer value

        // float data =sc.nextFloat();
        // System.out.print("\n"+data);


        /*

        next()
        nextLine()
        nextInt() //to take input integer
        nextFloat() //to take input float
        nextDouble() //to take input Double
        nextBoolean() //to take input boolean
        nextShort() //to take input short
        nextLong() //to take input long

        */
        // boolean choice=sc.nextBoolean();
        // System.out.println(choice);




        //   sum
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=a+b;
        // System.out.println("sum= "+c);


//     }
// }


//        multiplication of numbers
import java.util.*;
public class javaBasics{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        

        int a= sc.nextInt();
        int b= sc.nextInt();
        int c;
        c=a*b;
        System.out.println(c);

    }
}



       area of circle
import java.util.*;
public class javaBasics{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);

        float pi= 3.14f;
        float a=sc.nextFloat();
        float area=pi *a*a;
        System.out.println("area of circle: "+area);
    }
}


//      circumference of circle

import java.util.*;
public class javaBasics{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        // float pi=3.14f;
        // float a=sc.nextFloat();
        // float circumference=2*pi*a;
        // System.out.println(circumference);



        // float num=99.99f;
        // int num2=(int) num;   //force fully conversion or type cast
        // System.out.println(num2);

        char ch='a';
        int num1=ch;
        System.out.println(num1);       //ascii value 97

    }
}

import java.util.*;
public class javaBasics{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        


        System.out.println("enetr your age:");
        int age =sc.nextInt();
        if (age>=18){
            System.out.println("eligible for driving licence");

        }
        else{
            System.out.println("Not an adult");
        }
    }
}






import java.util.*;                                         //loops and patterns
public class javaBasics{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int j=0;
        // while (i<10){                              //while loop
        //     System.out.print(i + " ");
        //     i++;
        // }
        // for (i=0;i<5;i++){
        //     for (j=0;j<5;j++){                         //square 5 row 5 column of * 
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }


        for (i=0;i<=n;i++){
            for (j=0;j<i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }


    }
}


import java.util.*;                                     //sum of n numbers for loop
public class javaBascics{
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter value of n: ");
        int a=sc.nextInt();
        int sum=0;
        for (int i=0;i<a;i++){
            sum += i;
        }
        System.out.print("sum of "+a+" is:"+sum);
    }
}

import java.util.*;                                    //sum of n numbers for loop
public class javaBasics{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n:");
        int i=1;
        int sum=0;
        int n=sc.nextInt();
        while(i<n){
            sum+=i;
            i++;
        }
        System.out.print("Sum is : "+ sum);
    }






import java.util.*;                                                // weeks and days(switch cases )
public class javaBasics{
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the week int:");
        int weekInt=sc.nextInt();
        switch (weekInt){
            case 1:System.out.print("MONDAY");
            break;
            case 2:System.out.print("TUESDAY");
            break;
            case 3:System.out.print("WEDNESDAY");
            break;
            case 4:System.out.print("THURSDAY");
            break;
            case 5:System.out.print("FRIDAY");
            break;
            case 6:System.out.print("SATURDAY");
            break;
            case 7:System.out.print("SUNDAY");
            break;
            default:System.out.print("invalid input");
        }

    } 
}



import java.util.*;                                                //Calculator(switch cases)
public class javaBasics{
    public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    char operator=sc.next().charAt(0);          // it take only single character


    switch(operator){
        case '+': System.out.print("Sum: "+ (a+b));
                break;
        case '-':System.out.print("subtraction: "+  (a-b));
        break;
        case '*': System.out.print("multiplication: "+(a*b));
        break;
        case '/': System.out.print("division: " +(a/b));
        break;
        case '%': System.out.print("remainder: "+(a%b));
        break;
        default: System.out.print("invalid operator");
    }

    }
}




import java.util.*;                                     
public class javaBasics{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=1;
        for (int i=0;i<=n;i++){
            for (int j=0;j<i;j++){
                System.out.print(i+"  ");        //1  2 2  3 3 3  4 4 4 4  5 5 5 5 5
                
            }
            System.out.println();
        }
        for (int i=0;i<=n;i++){
            for (int j=0;j<i;j++){
                System.out.print(j+"  ");       //0  0 1  0 1 2  0 1 2 3  0 1 2 3 4 
                
            }
            System.out.println();
        }
        
        for (int i=0;i<=n;i++){
            for (int j=0;j<i;j++){
                System.out.print(k+"  ");            //1  2 3  4 5 6  7 8 9 10  11 12 13 14 15
                k+=1;
            }
            System.out.println();
        }
    }
}


import java.util.*;                                       //table of number
public class javaBasics{
        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter number for table");
                int n =sc.nextInt();
                for (int i=1;i<=10;i++){
                        System.out.println(n+"X"+i+"="+n*i);
                }
        }
}




import java.util.*;
public class javaBasics{
        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int oddsum=0;
                int evensum=0;

                do{
                if (n%2==0){
                        evensum+=n;

                }
                else{
                        oddsum+=n;
                
                System.out.println("do you want to continue1 or 0");
                int choice=sc.nextInt();
                }
                }while (choice==1) ;
                System.out.print("odd num sums: "+evensum);
                System.out.print("odd num sums: "+oddsum);
                
        }
}

import java.util.*;                                           //reverse star pattern
public class javaBacics{
        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                for (int i=0;i<n;i++){
                        for (int j=n;j>i;j--){
                                System.out.print("*"+" ");
                        }
                        System.out.println();
                }

                for (int i=1;i<=n;i++){
                        for (int j=1;j<=n-i+1;j++){
                                System.out.print("*"+" ");

                        }
                        System.out.println();
                }
        }
}




import java.util.*;                                       //**********half pyramid
public class javaBasics{
        public static void main(String args[]){
                Scanner sc=new Scanner (System.in);
                System.out.println("enetr number :");
                int n=sc.nextInt();
                for (int i=1;i<=n;i++){
                        for (int j=1;j<=i;j++){
                                System.out.print(j+" ");
                        }
                        System.out.println();
                }
        }
}




import java.util.*;                               // character pyramid
public class javaBasics{
        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                char ch='A';
                for (int i=1;i<=n;i++){
                        for (int j=1;j<=i;j++){
                                System.out.print(ch+" ");
                                ch++;
                        }
                        System.out.println();
                }
        }
}




      //**************************funtions and method************************

                                                       //without parameter
import java.util.*;
public class javaBasics{
        public static void sum(){                                          /*function / methods      fumction when implemented in the scope of class known as methods other wise they are */
                System.out.print("print the sum");
        }
        public static void main(String args[]){
                sum();                                               //calling
        }
}








import java.util.*;                                         //with parameter
public class javaBasics{
        public static int add(int a,int b){
                int sum=0;
                sum=a+b;
                return sum;
        }
        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                int a=sc.nextInt();
                int b=sc.nextInt();
                int addition=add(a,b);                                               //calling
                System.out.println("Sum of a and b is: "+addition);
                
                
                
                
                
                int a=10;
                System.out.println(a--*a--);


                
                
        }
}






import java.util.*;                     //swapping 
public class javaBasics{
	public static void main (String args[]){
		// int a=5;                                                   //swapping using third variable
		// int b=45;
		// int c=b;
		// b=a;
		// a=c;
		// System.out.println("a= "+a);
		// System.out.println("b= "+b);
                                                                  //swapping without using third variable


		// int a=5;
		// int b=45;
		// b=b+a;
		// a=b-a;
		// b=b-a;		 
		// System.out.println("a= "+a);
		// System.out.println("b= "+b);                                       
	}
}




import java.util.*;                                  //product of two numbers
public class javaBasics{
	public static int  product(int a,int b){
		int prod=a*b;
		return prod;
	}
	public static void main (String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.print("enter the 1st value: ");
		int n=sc.nextInt();
		System.out.print("enter the 2nd value: ");
		int m=sc.nextInt();
		int call=product(n,m);
		System.out.print("Productof numbers is : "+call);
	}
}


import java.util.*;                                  //factorial of numbers
public class javaBasics{
	public static int  factorial(int a){
		int fact=1;
		for (int i=1;i<=a;i++){
			fact=fact*i;
			
		}
		return fact;
	}
	public static void main (String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.print("enter the value");
		int a=sc.nextInt();
		if (a==1){
			System.out.print("factorial is:  "+a);
		}else{
			int call=factorial(a);
			System.out.print("factorial is:  "+call);
		}
	}
}

import java.util.*;                                           //binomial coefficient
public class javaBacics{
	
	public static int binomial(int n){
		int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String args[]){ 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		int bino=binomial(n)/binomial(r)*binomial(n-r);
		System.out.print(bino);
	}
}

	
	

import java.util.*;                                              // Binary to Decimal
public class javaBasics{

        public static void binDec(int n){
                int deci=0;
                for (int i=0;n>0;i++){
                        int last=n%10;
                        deci=deci+(int)(last*Math.pow(2,i));
                        n=n/10;
                        
                }
                System.out.print(deci);
        }

        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                binDec(n);
        }
}
	
	

import java.util.*;                                              // Decimal to Binary
public class javaBasics{

        public static void decBin(int n){
                int deci=0;
                for (int i=0;n>0;i++){
                        int last=n%2;
                        deci=deci+(int)(last*Math.pow(10,i));
                        n=n/2;
                        
                }
                System.out.print(deci);
        }

        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                decBin(n);
        }
}

	
	
/*-------------------------------
---------------------------------
ADVANCED PATTERN QUESTIONS
---------------------------------
---------------------------------*/
	
	
import java.util.*;                                // hollow rectangle
public class javaBasics{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i=1;i<=n;i++){
			for (int j=1;j<=n;j++){
				if (i==1||i==n||j==1||j==n){
					System.out.print("*");
				}
				else{
					System.out.print(" ");

				}
			}
			System.out.println();
		}
	}
}



import java.util.*;                   //reverse pyramid
public class javaBasics{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		for (int i=1;i<=n;i++){
			for (int j=1;j<=(n-i);j++){
				System.out.print(" ");
			}
      for(int j=1;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
		}
    
	}
}



import java.util.*;                        //upside down pyramid column
public class javaBasics{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for (int i=1;i<=n;i++){
      for (int j=1;j<=(n-i+1);j++){
        System.out.print(j);
      }
      System.out.println();
    }
  } 
}


import java.util.*;                   //FLOYD'S triangle
public class javaBascics{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=1;
    for (int i=1;i<=n;i++){
      for (int j=1;j<=i;j++){
        
        System.out.print(k);
        k=k+1;

      }
      System.out.println();
    }
  }
}


import java.util.*;              //0-1 Triangle
public class javaBascics{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
      for (int j=1;j<=i;j++){
        int sum=i+j;
        if (sum%2==0){
          System.out.print("1");

        }else{
        System.out.print("0");}
      }
      System.out.println();
    }
  }
}


import java.util.*;                     //butterfly pattern
public class javaBascics{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    //upper half

    for (int i=1;i<=n;i++){
      for (int j=1;j<=i;j++){
        System.out.print("*");
      }
      for(int j=1;j<=2*(n-i);j++){
        System.out.print(" ");
      }
      for (int j=1;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }

    //lower half

    for (int i=n;i>=1;i--){
      for (int j=1;j<=i;j++){
        System.out.print("*");
      }
      for(int j=1;j<=2*(n-i);j++){
        System.out.print(" ");
      }
      for (int j=1;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}


import java.util.*;                                 //solid rhombus
public class javaBasics{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for (int i=1;i<=n;i++){
      for (int j=1;j<=(n-i);j++){
        System.out.print(" ");
      }
      for (int j=1;j<=n;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}



import java.util.*;                                 //hollow rhombus
public class javaBasics{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for (int i=1;i<=n;i++){
      for (int j=1;j<=(n-i);j++){
        System.out.print(" ");
      }
      for(int j=1;j<=n;j++){
        if (i==1||i==n||j==1||j==n){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }

      }
      System.out.println();

    }
  }         
}  
