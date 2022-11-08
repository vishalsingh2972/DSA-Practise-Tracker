package Interfaces.extendDemo2;

public interface B{
     void greet();
//    void fun();

//   default void fun2(){ //will give error; default there in both A and B for fun() together will again collapse. lol so the problem we are trying to tackle with interfaces (i.e. Multiple inheritance like here chor() method is being inherited in main.java from both A and B, this is possible only using interfaces but not using abstract classes) we are getting again in this case
//                        //In cases in which a class implements two interfaces that both have the same default method, but the class does not override that method, then an error will result.
//                        //will not give error when both A and B have default and are being overridden in main
//       System.out.println("I am in A");
//    }


    void chor();


}
