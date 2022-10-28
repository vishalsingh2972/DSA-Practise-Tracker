package Inheritance;

public class BoxWeight extends Box {
    double weight;

    BoxWeight() {
        //System.out.println(this.l);
        this.weight = 200;
        //this.l = 44;
    }

    //@Override (error as static methods cannot be overridden)
    static void greeting() {        //hidden for box8
        System.out.println("Hey, I am in BoxWeight Class. Greetings!");
    }

    BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h);// it is calling the parent class constructor (with same parameters i.e. here constructor 3)
        //used to initialise values present in parent class
        //super(l);
        //super(); this acts in same way as not putting super at all does the same thing basically - it goes to the box default constructor (without parameters box constructor)
        this.weight = weight;

        System.out.println(this.weight); //will point to weight present in the subclass (or child class)
        // System.out.println(super.weight); //will point to weight present in superclass (or parent class)

    }

    BoxWeight(BoxPrice other) {

    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }


}


