package AbstractDemo;

//use case-- why are/ why do we need abstract-- code looks much more cleaner and
// also if you definitely know that a function/methods that are there in the parent class needs to be overridden, then just make those methods abstract in the parent class
//also note: parent class abstract methods/functions have no body (they are empty)

public abstract class Parent { //if parent body has one or more than 1 (atleast 1) abstract method the class also needs to be made abstract----> that's why "public class Parent { " ---changed to---> "public abstract class Parent { "
//    final public abstract class Parent { //error (NOT Possible), as abstract classes need to be extended (e.g. Son extends Parent) so that its methods (parent class methods that are empty/have no body) can be overridden by the child class, so when we put abstract we confirm want it to be inherited BUT final prevents the parent class from being inherited, so clash hota final and abstract ka and so ERROR
    int age;
//   static int age; //static variables (Possible)

    final int VALUE = 2456 ; //initialising final variables (Possible)
   //* final int VALUE;

    public Parent(int age) { //parent class constructor (here constructor of an abstract class); non-abstract constructor in an abstract class (Possible)
        this.age = age;
    //*    VALUE = 2456;
    }
    //    abstract Parent() { } //error - no we CANNOT create abstract constructors (NOT Possible)


    abstract void career(); //parents are like just giving a basic idea (just declaring) but implementation i.e. career choice is yours to child class
    abstract void partner(); //similarly parents are like you choose your partner


    //              creating object of Parent class and calling Parent class constructor (NOT Possible)
    //Parent mom = new Parent(60);//will give error -----> so we cannot create objects of an abstract class (here parent class is abstract, so uske objects nahi create kar sakte hum)
    //Why we cannot create objects of abstract classes ? -------------------------------->//as if after creating object of parent class we try to call any method suppose career() or partner() it will give error as abstract methods are empty and have no body (java will be like hey this method does not have any body how can I call it)


//           abstract static methods CANNOT be created  [ Abstract Static Methods in Abstract Classes (NOT Possible) ]
    //do static methods get overridden ? ----> NO
    //do abstract methods get overridden ----> YES, obviously as by definition abstract methods need to be overridden
    //So what is the point of creating abstract static methods lol, abstract needs to be overridden and static cannot be overridden ----> so can we create abstract static methods ? ----> Obviously NO !


//            Static Methods in Abstract Classes (Possible)
    static void hello() { //there can be no objects created of abstract class (here parent class) and static is independent of objects
        System.out.println("Hey");
    }


//             Normal Methods in Abstract Classes (Possible)
    void normal(){
        System.out.println("this is a normal method");
    }

}
