import java.util.Scanner;
//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote
public class Q3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = in.nextInt();

        System.out.println(eligiblity(age));

    }

    static String eligiblity(int AGE) {
        while (AGE > 0) {
            if (AGE >= 18) {
                return "Yes , you are eligible";
            } else {
                return "No , you are not Eligible now";
            }

        }
        return "You have entered a negative number! Enter a positive age";
    }
}
