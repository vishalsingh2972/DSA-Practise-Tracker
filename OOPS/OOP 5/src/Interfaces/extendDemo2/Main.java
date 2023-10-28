package Interfaces.extendDemo2;

public class Main implements A, B {

    @Override //NOTE : when overriding methods, the access modifier should be same or better i.e. if in Parent Class it was protected, then overridden should be either protected or public.
    public void greet() {//interface methods in A and B are by default public, so this can be public or anything higher than public, nothing is higher than public so that is why this has to be public
//  void greet() { //for example this is default which is lower than public , so that is why error
    }


    @Override
    public void chor() {

    }

//    @Override // In all cases, a class implementation takes priority over an interface default implementation.
//    public void fun2() {
//
//    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting(); // must call static via the interface name that it is present in, here static method greeting() is present in A.java----so calling it as A.greeting();
    }

}
