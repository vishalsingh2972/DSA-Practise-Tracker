public class StringParameters {
    public static void main(String[] args) {

        String personalised = myGreet("Vishal Singh");
        System.out.println(personalised);
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

}

//If we are giving name as input then
/*
package FMBasic;
import java.util.Scanner;
public class StringParameters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String naam = in.next();
        String personalised = myGreet(naam);
        System.out.println(personalised);
    }
    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }
}
*/