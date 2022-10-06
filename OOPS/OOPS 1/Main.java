package introduction;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

// just declaring
//        Student kunal;
//        kunal = new Student();
        Student kunal = new Student();
        System.out.println(kunal.rno);

        kunal.rno = 13; //means rno present inside the kunal object
        kunal.name = "Kunal Kushwaha";
        kunal.marks = 88.5f;

        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);
    }


    // create a class
// for every single student
    static class Student {
        int rno = 12;
        String name;
        float marks;
    }
}

//Also note that the constructor is called when the object is created.
//(All classes have constructors by default) , Here as we are not providing any constructors ourselves, so Java creates one for us. However, then you are not able to set initial values for object attributes, it will just give default values, in order to initialise values we need to provide constructor ourselves
//Basically, If we don’t define any constructor inside the class, Java compiler automatically creates a default constructor at compile-time and assigns default values for all variables declared in the class.