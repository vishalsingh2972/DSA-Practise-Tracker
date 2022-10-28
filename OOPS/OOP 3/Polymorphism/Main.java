package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        Shapes square2 = new Square();
      //Shapes square2 = new Circle();
//+
        Shapes circle2 = new Circle(); //object of Circle created
        //ref. variable is of type SHAPES but object Circle() is of type Circle. hence circle method will be called
        //which method is being run / will run depends on the right side(object type)-----> new Circle();
        //what can be accessed depends on the left side(ref. type)-----> Shapes circle2 (only parameters accessible to Shapes will be available to run)
//Therefore, what it is able to access is defined by the type of reference, which one it is able to access is defined by the type of the object

        circle2.area(); //so here which area method should we call, should we run shapes area method or circle area method ?
        //Type of Method in Overriding that is called depends on what the type of the object is, like here object is Circle(), so circle method is called
     //Here child method is overriding the parent method (i.e. child area() method is being given more preference than parent area() method)
//When a superclass ref. variable is referring to a subclass object, in this case if a method is called Java determines which version of that method to call based on the type of object
//+

           //shape.area();
         // circle.area();
         //square.area();

        // square2.area();



    }
}


