package Inheritance;

public class Box {
//public final class Box { //final keyword used to prevent inheritance
//when we declare a class as final, implicitly it declares all its methods/functions final too

    double l;
    double w;
    double h;
    //double weight = 69;

    static void greeting() {
        System.out.println("Hey, I am in Box Class. Greetings!");
    }

    Box() {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    //cube
    Box(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    //constructor 3
    Box(double l, double w, double h) {
        //    super();  //will call the constructor of the Object Class (future topic)
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box old) {
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }


}



























