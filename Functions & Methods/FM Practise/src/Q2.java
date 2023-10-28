import java.util.Scanner;
//Define a program to find out whether a given number is even or odd
public class Q2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = in.nextInt();

        System.out.println(EvenOdd(num));

    }

    static String EvenOdd(int NUM) {
        if (NUM % 2 == 0) {
            //return true; //when method is boolean
            //System.out.println("Number is EVEN");
            return "Number is EVEN";

        } else {
            // return false; //when method is boolean
            //System.out.println("Number is ODD");
            return "Number is ODD";
        }

    }

}


