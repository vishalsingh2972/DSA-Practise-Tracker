package Interfaces.extendDemo;

public interface B extends A{ //interface to interface inheritance we use "extends"
    void greet();
    void fun();

    default void trial(){ // In cases in which one interface inherits another, with both defining a common default method, the inheriting interface’s version of the method takes precedence.
        System.out.println("I am in B"); //so here this overrides method in A (only if override is not present in main.java; check side arrows in IDE to understand better which is overriding which)
    }

}
