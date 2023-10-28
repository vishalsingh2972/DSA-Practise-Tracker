import java.util.Scanner;
//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered
public class Q8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int marks = in.nextInt();

        System.out.println(grades(marks));

    }

    static String grades(int MARKS){
        while(MARKS >0) {
            if (MARKS >= 91 && MARKS <= 100) {
                return "AA";
            }
            if (MARKS >= 81 && MARKS <= 90) {
                return "AB";
            }
            if (MARKS >= 71 && MARKS <= 80) {
                return "BB";
            }
            if (MARKS >= 61 && MARKS <= 70) {
                return "BC";
            }
            if (MARKS >= 51 && MARKS <= 60) {
                return "CD";
            }
            if (MARKS >= 41 && MARKS <= 50) {
                return "AA";
            }
            if (MARKS <= 40) {
                return "Fail";
            }

        }
        return "Invalid Marks Entered";
    }

}
