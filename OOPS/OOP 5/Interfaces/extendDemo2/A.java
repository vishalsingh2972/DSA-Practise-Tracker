package Interfaces.extendDemo2;

public interface A {

//    Static Interface Methods should always have a body (static methods cannot be inherited which means they cannot be overridden. So they must have a body here itself,because the static methods in interfaces are the ones that will be used ONLY)
                                                         //static methods will never get inherited, as if you are inheriting you have to override, and overriding means it depends on objects because it is runtime polymorphism and as we know static methods do not depend on objects, that is why they cannot be inherited SIMPLE!
      //call via the interface name
       static void greeting(){
        System.out.println("Hey I am static method");
    }

//    default void fun2(){ //this method is present in an interface (present in interface ,so it is abstract by default and needs to be overridden), BUT this method is not being overridden (like methods in extendDemo package, methods in A and B are being overridden by methods in Main.java) and still not giving an error because it is a Default method
//        //System.out.println("I am in A");
//    }

//     void fun();
    void chor();

}