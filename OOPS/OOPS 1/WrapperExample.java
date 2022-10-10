package introduction;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
//        Integer num = 45;

        Integer a = 10;
        Integer b = 20;

        swap(a, b);

        System.out.println(a + " " + b);

//        final int bonus = 2;
//        bonus = 3; //will give error as for primitives once final is added no changes can be made thereafter i.e you cannot change the value of the variable afterwards once final is added

/*
Unfortunately, final guarantees immutability only when instance variables are primitive types, not reference types.
If an instance variable of a reference type has the final modifier, the value of that instance variable (the reference
to an object) will never change—it will always refer to the same object—but the value of the object itself can change
 */

        final A kunal = new A("Kunal Kushwaha");
        kunal.name = "other name"; //here reference variable (kunal) is pointing to same object but the value of the object itself we have changed from "Kunal Kushwaha" to "other name" (this is possible)
        // kunal.name = "koyal"; //can change name (i.e edit the existing object) as many times as we want

        // when a non primitive is final, you cannot reassign it (we can change the values/edit the existing values, but we cannot reassign it)
//       kunal = new A("new object"); //will give error as here we are trying to reassign reference variable (kunal) to another object (basically making kunal(present in stack) to point to another object present in heap---this is not possible) , once final is already declared (this is not possible)

        System.out.println(kunal.name);

//The finalize( ) Method:
        A obj;//declaration

        for (int i = 0; i < 1000000000; i++) {
            obj = new A("Random name"); //initialisation; or we can also do both together, as written below
            // A obj = new A("Random name"); (can also do both declaration and initialisation together)
        }

    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

}

class A {
    //final int num; this will give error as final variables once declared have to be initialised (mandatory),see below
    final int num = 10;
    String name;

    public A(String name) {
        //      System.out.println("object created");
        this.name = name;
    }


//The finalize( ) Method:
   /*
Sometimes an object will need to perform some action when it is destroyed.
To handle such situations, Java provides a mechanism called finalization. By using finalization,
you can define specific actions that will occur when an object is just about to be reclaimed by the garbage collector.
To add a finalizer to a class, you simply define the finalize( ) method. The Java run time calls that method whenever
it is about to recycle an object of that class. Right before an asset is freed, the Java run time calls the finalize( )
method on the object.
    */

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}