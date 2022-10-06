package introduction;

public class MainusingConstructors {
    public static void main(String[] args) {
    // store 5 roll nos
    int[] numbers = new int[5];

    // store 5 names
    String[] names = new String[5];

    // data of 5 students: {roll no, name, marks}
    int[] rno = new int[5];
    String[] name = new String[5];
    float[] marks = new float[5];

    Student2[] students = new Student2[5];

// just declaring
//        Student kunal;
//        kunal = new Student();
  Student2 kunal = new Student2();

  //kunal.rno = 69;
    System.out.println(kunal.rno);
    System.out.println(kunal.name);
    System.out.println(kunal.marks);


//Constructor that takes values from another object  (our new object random takes values from previous kunal object)
        Student2 random = new Student2(kunal);
        System.out.println("Kacha Badam");
        System.out.println(random.name);
        System.out.println(random.marks);

//Calling a constructor from another constructor (using this.)
        Student2 random2 = new Student2();
        System.out.println("Pakka Badam");
        System.out.println(random2.name);

//Both ref. variables pointing to same object in the heap memory
        Student2 one = new Student2(); //initially one.name = "default person" (check below)
        Student2 two = one; //two also pointing to same object as one now

        one.name = "Something something"; //if we make changes in object via ref. variable one (here we changed name)
        //change here I changed name of one but the name of two was also changed
        System.out.println(two.name); //then changes will be reflected if we access via two as well as both are pointing to same object in the heap

}

// create a class
// for every single student
static class Student2 //class name is Student2
{
    int rno;
    String name;
    float marks;

//Our Constructor (function named Student2(), no need of return type in this constructor function )
 /*
    No, constructor does not return any value.
    While declaring a constructor you will not have anything like return type.
    In general, Constructor is implicitly called at the time of instantiation.
    Basically a constructor is a special type of function that runs when you create an object ,and it
    allocates/initialises values to the variables for that particular object based on the variables that are present in the class
 */

//so constructor Student2 will basically run when we create a new object, jo object ban gaya hain uske variables ke values pass karta ye bas, itna hi kaam hai iska

//Also
// we need a way to add the values of the above
// properties object by object
// we need one word to access every object i.e this keyword

//    Student2() //here constructor name must be same as class name ( Constructor synatax : AccessModifier Classname/Constructorname ( Parameters ) ), as you can see in the syntax we don't have any returntype (int, void etc.) as constructor is not returning anything
//    {
//        this.rno = 13;
//        this.name = "KK";
//        this.marks = 86.4f;
//    }

//Constructor that takes values from another object
    Student2  (Student2 other) {
        this.name = other.name; //random.name = kunal.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    Student2()
    {
// this is how you call a constructor from another constructor
// internally: new Student2(13, "default person", 100.0f);
        this (13, "default person", 100.0f);
    }

    Student2(int rno, String name , float marks)
    {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
}
//References: https://youtu.be/HD5IyaOgdPQ ; https://youtu.be/lrIlVcsZrx0




