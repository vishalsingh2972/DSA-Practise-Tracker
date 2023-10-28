package Interfaces.extendDemo;

public interface A {
    void fun();

    default void trial(){
        System.out.println("I am in A");
    }
}
