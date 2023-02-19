public class OOPS{
  public static void main(String args[]){
    // Pen p1=new Pen();                        //p1 is the object for the class Pen   and all the objects are stored into the Heap
    // p1.setColor("Blue");
    // System.out.println(p1.color);                //using '.' we can access the menber item or functions of a class 
    // p1.setTip(5);
    // System.out.println(p1.Tip);

    // p1.color="yellow";             //we can also make changes to datamember by this also without calling any function
    // System.out.println(p1.color); 


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


//                                       //access modifier
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





//#############################################################################################






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







//#######################################################  INHERITANCE  #######################################
public class OOPS{
  public static void main(String args[]){
    Katana fi=new Katana();
    System.out.println("katana  --");
    fi.swims();
    fi.type();
    fi.eats();

    Mammal m1=new Mammal();
    System.out.println("Mammals   --");
    m1.eats();
    m1.breathe();
    m1.walk();
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

class Fish extends Animals{                     // single inheritance
  int fins;

  void swims(){
    System.out.println("swims");
  }
}
class Katana extends Fish{                          //multi-level inheritance
  int age;
  void type(){
    System.out.println("type");
  }
}


class Mammal extends Animals{                         //heirarchical inheritance  as Fish and Mammal both inherited the Animals class
  int stepWalk;

  void walk(){
    System.out.print("Walk");
  }
}

class Dog extends Mammal{                       //Hybrid Inheritance  having all types of inheritance
  String barks;
  void barks(){
    System.out.print("dog barks");
  }
}







//####################################################  Polymorphism ############## same name different parameter

public class OOPS{                             
  public static void main(String args[]){
    calculation c1=new calculation();
    c1.add(5,10);                            // compile time polymorphism (function overloading)
    c1.add(5.5f,10.5f);
    System.out.print("retun sum "+c1.add(2,3,5));     //this is also compile time  and we an call like this also (function overloading)
  }
}

class calculation{
  int sum;
  float fsum;

  void add(int a,int b){                    //compile time (function overloading)
    sum=a+b;
    System.out.println("int sum: "+sum);
  }
  void add(float a,float b){                        //compile time (function overloading)
    fsum=a+b;
    System.out.println("float sum: "+fsum);
  }
  int add(int a,int b,int c){                    //compile time (function overloading)
    return a+b+c;
    
  }
}







public class OOPS{                                 //overriding (runtime polymorphism)
  public static void main(String args[]){
    Deer d1=new Animal();                   // here object is of child class means childs eat function is called 
    d1.eat();
  }
}
class Animal{
  void eat(){                                          //same name and parameters of function in parent and child class
    System.out.println("eat anything");
  }
}
class Deer extends Animal{                    //but of whom funtion is called depend on runtime as whose class object is made that class function is called
  void eat(){
    System.out.println("eat grass");
  }
}








//########################################### Abstraction ##############################################

//can be implemented in two ways -> abstract keyword or -> interfaces  
//############### abstract keyword  


public class OOPS{
  public static void main(String args[]){
    Horse h1=new Horse();
    Octopus o1=new Octopus();
    h1.eat();
    h1.walk();
    o1.eat();
    o1.walk();

    // Animal a1=new Animal();              // this give error as abstract class cannot have objects but can have constructor in it 

    System.out.println(h1.color);          //bydefault brown color 
    h1.changecolor(); 
    System.out.println(h1.color);           //changed color black of Horse 


  }
}

abstract class Animal{
  String color;


  Animal(){                        // abstract class can have constructor in it 
    color="brown";                 //it gives a bydefault color value to all the child class (like horse and octopus and if they want to change they have a changecolor() function )
  }

  void eat(){
    System.out.println("eats");
  }
  abstract void walk();                 //as it is abstract compusory for all child class tohave this and provid edefinition for itself
}   


class Horse extends Animal{
  void changecolor(){
    color="black";
  }

  void walk(){                                 // defination ofn abstract function 
    System.out.println("Walks on 4 legs");
  }
}

class Octopus extends Animal{
  
  void changecolor(){
    color="purple";
  }

  void walk(){
    System.out.println("Walks on 7 legs");
  }
}



//############### Using Interfaces##################



public class OOPS{                                     //normal use of interfaces 
  public static void main (String args[]){
    Queen q=new Queen();
    System.out.println("Queen Moves -");
    q.moves();

    Rook r=new Rook();
    System.out.println("Rook  Moves -");
    r.moves();

    king k=new king();
    System.out.println("King  Moves -");
    k.moves();

    soldier s=new soldier();
    System.out.println("Soldier Moves -");
    s.moves();
  }
}

interface ChessPLayers{
  void moves();           //this function is public ,abstract

}

class Queen implements ChessPLayers{
  public void moves(){
    System.out.println("up,down,left,right,diagonal - (in all 4 directions)");

  }
}

class Rook implements ChessPLayers{
  public void moves(){
    System.out.println("up,down,left,right");

  }
}
class king implements ChessPLayers{
  public void moves(){
    System.out.println("up,down,left,right,diagonal - (in all 1 directions)");

  }
}
class soldier implements ChessPLayers{
  public void moves(){
    System.out.println("up,digonal(1 step on condition )");

  }
}





public class OOPS{                                           //########### multiple Inheritance using interfaces ###########
  public static void main(String args[]){
    Bear b=new Bear();
    b.herbs();

  }
}

interface Herbivore{
  void herbs();
}
interface Carnivore{
  void meat();

}
class Bear implements Herbivore,Carnivore{
  public void herbs(){
    System.out.println("wants to Eat herbs ");
  }
  public void meat(){
    System.out.println("wants to Eat non veg ");
  }
}





//############## super keyword ******************

public class OOPS{
  public static void main(String args[]){
    Horse h=new Horse();
  System.out.println(h.color);
  }
}
class Animal{
  String color;
  void fun(){
    System.out.println("its a fun");
  }
  Animal(){
    System.out.println("its an animal");
  }
}
class Horse extends Animal{

  Horse(){
    super.color="brown";
    super.fun();
    System.out.println("its an horse ");
  }
}



