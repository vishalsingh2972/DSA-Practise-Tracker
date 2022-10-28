package Polymorphism;

public class Circle extends Shapes {

    //this will run when object of Circle is created
    //hence it will override the parent method
    @Override// this is called annotation (used for check purposes), if you want to check whether a method is being overridden or not just put @Override above it
    void area(){
        System.out.println("Area is pi * r * r");
    }

//    @Override //here area2 is not being overridden hence @Override annotation is giving error
//    void area2(){
//        System.out.println("Area is pi * r * r");
//    }



}
