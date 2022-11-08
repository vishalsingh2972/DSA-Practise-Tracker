package Interfaces.extendDemo;

import Interfaces.extendDemo2.A;

public class Main implements B{ //classes to interfaces we use "implements"
//    public class Main implements A, B{ //also possible

    @Override //Annotation internally is also an interface - " public @interface Override { "
    public void fun() { //Both A and B have fun(), so which one will the Main.java class fun() method override, it actually does not care/it does not matter which one it is overriding as it is providing its own body after overriding
         //This is fun ki BODY
        //it is providing its own body, so it does not care which one it is overriding; it is just overriding we know that
    }

    @Override
    public void greet() {

    }

//    @Override //if this override is present it will override method present in B which itself was overriding method present in A
//    public void trial() {
//        System.out.println("I am in Main");
//    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.trial();
    }
}
