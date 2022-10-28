package Inheritance;

public class Main {

    public static void main(String[] args) {
        //Box box1 = new Box(4, 5, 9);
        //Box box2 = new Box(box1);
//        System.out.println(box1.l + " , " + box1.w + " , " + box1.h);
//        System.out.println("kardiya copy");
//        System.out.println(box2.l + " , " + box2.w + " , " + box2.h);

//        BoxWeight box3 = new BoxWeight();
//        System.out.println(box3.l);
//        System.out.println(box3.w);
//        System.out.println(box3.weight);

//        BoxWeight box4 = new BoxWeight(2,4,6, 100);
//        System.out.println(box4.l);
//        System.out.println(box4.h);
//        System.out.println(box4.w);
//        System.out.println(box4.weight);

//        Box box5 = new BoxWeight(2, 3, 4, 8);
//        System.out.println(box5.w); //possible as w is a parameter of the ref. variable box5 of Box class (parent class)
//        //System.out.println(box5.weight); //not possible as weight is variable of child class but ref. variable is box5 of type Box (parent class)

        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error
//        BoxWeight box6 = new Box(2, 3, 4); //here BoxWeight is available, so I can access weight parameter BUT when java is trying to create object of type Box, we are unable to initialise the weight variable here as we have called the constructor of parent class(Box),parent class has no idea what is weight parameter hence error

//        BoxPrice box = new BoxPrice();
//        System.out.println(BoxPrice.l);

//        BoxPrice box = new BoxPrice(5,8,200);


//        Box.greeting(); //like here Classname.staticMethod------>correct convention to write
        //box1.greeting(); will give same output but convention is to write Classname.staticMethod, as static methods (here greeting() ) are not dependent on the objects (box1) of the Class (Box)

        Box box7 = new BoxWeight();
        //BoxWeight box = new BoxWeight();
        //   Box.greeting();  //convention
        box7.greeting();     //same output but not convention //NOT OVERRIDDEN //here dynamic memory dispatch will not happen as greeting() method is static
        // overriding depends on objects, static does not depend on objects--Hence static methods cannot be Overridden
        //basically in order to override something we need to deal with objects but static stuff eliminates all the objects, hence we cannot override it (i.e. override static)


        BoxWeight box8 = new BoxWeight();
        BoxWeight.greeting(); //when static greeting() in BoxWeight is grey(hidden) [i.e. when greeting() is not present in BoxWeight Class, then it will check in Box Class and Inherit Box Class greeting() method ], then it will INHERIT Box Class greeting method


        //Hence, Static Method you can Inherit but, you cannot Override

//Both Overloading and Overriding does not apply to instance variables, for that we have this and super (check Double weight in Box and BoxWeight Example)

    }


}











































































































