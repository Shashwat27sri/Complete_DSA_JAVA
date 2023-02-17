  public class OOPS{
    public static void main(String args[]){
      Pen p1=new Pen();                        //p1 is the object for the class Pen   and all the objects are stored into the Heap
      p1.setColor("Blue");
      System.out.println(p1.color);                //using '.' we can access the menber item or functions of a class 
      p1.setTip(5);
      System.out.println(p1.Tip);

      p1.color="yellow";             //we can also make changes to datamember by this also without calling any function
      System.out.println(p1.color); 


      BankAccount b1=new BankAccount();            //---------------access modifiers 
      b1.username="shashwat";
      System.out.println(b1.username);
      // b1.password="Shashwat@sri";                                 //this will not work as password is private and can be accessed into the class only
      b1.setPassword("Shashwat@sri");
      b1.showPassword();                 
    }

  }


                                                                                //any other class to be made below the main class for easy access.
        class Pen{               //class named pen 
          String color;                    /*property of pen color and Tip */
          int Tip;

          void setColor(String newcolor){          //member functions setColor and setTip
            color = newcolor;
          }

          void setTip(int newTip){
            Tip= newTip;
          }
        }


                                              //access modifier
        class BankAccount{
          public String username;
          private String password;
          public void setPassword(String pwd){
            password=pwd;
          }
          public void showPassword(){
            System.out.println(password);
          }

        }





      //  #############################################################################################






        public class OOPS{                                    //constructors 
          public static void main(String args[]){
            // Pen p1=new Pen();                  // a constructor is initialised when a object is made

            Pen p1=new Pen("shashwat");        //contructor with some initial value for the function

            Pen p4=new Pen(5);
            Pen p3=new Pen("Shashwat",5);
            p3.Price[0]=100;                //here when we initialise the price[values] for p3 object but as this is initalised after the execution of p2 object generation with same text of p3 details her comes the use of referencing in the array. 
            p3.Price[1]=60;
            p3.Price[2]=30;


            Pen p2=new Pen(p3);                                      //p2 is the object for copy constructor having copy of p3 
            p2.Owner="aashi";
            p3.Price[2]=40;                                //changes are getting reflected even after the execution statement.
                                                           //Shallow Copy



            System.out.println(p2.username);
            System.out.println(p2.Quantity);
            System.out.println(p2.Owner);

            for (int i=0;i<3;i++){
              System.out.println(p2.Price[i]);
            }

          }
        }

public class Pen{

  String username;
  int Quantity;
  String Owner;
  int Price[];

                                                            //Non-parameterized constructor

  Pen(){                                                //this function is invoked at creation of function
    System.out.print("How much pens do you want");
  }

                                                            //Parameterized Constructor

  Pen(String username){                     // updation of usename value for the argument passed from the constructor
    Price=new int[3];
    this.username=username;
    // System.out.println(username);
  }
  Pen (int Quantity){
    Price=new int[3];
    this.Quantity=Quantity;
  }

  Pen (String username,int Quantity){
    Price=new int[3];
    this.username=username;
    this.Quantity=Quantity;
  }


                                                          
  Pen(Pen p1){                                     //p1 is of type Pen as it is the object of Pen
    this.username=p1.username;
    this.Quantity=p1.Quantity;

    Price=new int[3];
    this.Price=p1.Price;                     //shallow copy
  }                                                            
  
}





public class OOPS{                                  //#################### Deep copy constructor
  public static void main(String args[]){ 
    Pen p1=new Pen("Shashwat",5,"aashi");
    // p1.username("shashwat");
    // p1.Quantity(6);
    // p1.Owner("aashi");
    p1.Price[0]=100;                
    p1.Price[1]=60;
    p1.Price[2]=30;


    Pen p2=new Pen(p1);
    
    p1.Price[2]=40;     // as here i changed the value but does not get reflected into the copy constructor values
    
    System.out.println(p2.username);
    System.out.println(p2.Quantity);
    System.out.println(p2.Owner);

    for (int i=0;i<3;i++){
      System.out.println(p2.Price[i]);
    }
  }
  
}
class Pen{
  String username;
  int Quantity;
  String Owner;
  int Price[];

  Pen(String username,int Quantity,String Owner){
    Price=new int[3];
    this.username=username;
    this.Quantity=Quantity;
    this.Owner=Owner;
  }


                                      //Deep copy constructor
  Pen(Pen p1){
    Price=new int[3];
    this.username=p1.username;
    this.Quantity=p1.Quantity;
    this.Owner=p1.Owner;
    for(int i=0;i<Price.length;i++){             //deep copy constructor here once copied changes in original cant be seen in copy 
      this.Price[i]=p1.Price[i];
    }
  }
}







// //#######################################################  INHERITANCE  #######################################
public class OOPS{
  public static void main(String args[]){
    Katana fi=new Katana();
    fi.swims();
    fi.type();
    fi.eats();
  }
}

class Animals{
  String color;
  
  void eats(){
    
    System.out.println("eats");
  
  }
  void breathe(){
    System.out.println("breath");
  }

}

class Fish extends Animals{
  int fins;

  void swims(){
    System.out.println("swims");
  }
}
class Katana extends Fish{
  int age;
  void type(){
    System.out.println("type");
  }
}
