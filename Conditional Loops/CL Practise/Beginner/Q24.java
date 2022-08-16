
import java.util.Scanner;
// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class Q24 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int num = in.nextInt();
        int sum = 0; //Initially

        while (num != 0) {
            sum = sum + num;

            System.out.print("Enter the Remaining Number: ");
            num = in.nextInt();

        }
        System.out.println("The Sum of the non-zero numbers is: "+ sum);
    }
}