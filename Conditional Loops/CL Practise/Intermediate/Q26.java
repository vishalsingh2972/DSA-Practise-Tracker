import java.util.Scanner;
//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
public class Q26 {
    public static void main(String[] args) {
        System.out.print("Enter the numbers and press 0 to stop the process : ");
        int num;
        int negativesum = 0;
        int evenPositive = 0;
        int oddPositive = 0;

        while (true) {

            Scanner in = new Scanner(System.in);
            num = in.nextInt();
            if (num < 0) {
                negativesum = negativesum + num; //negativesum += num;
            } else {
                if (num % 2 == 0) {
                    evenPositive = evenPositive + num;
                } else {
                    oddPositive = oddPositive + num;
                }
            }
            if (num == 0) {

            System.out.println("Negative Sum is " + negativesum);
            System.out.println("Even Positive Sum is " + evenPositive);
            System.out.println("Odd Positive Sum is " + oddPositive);
            break; //to exit while loop after 0 is entered
        }
        }
    }
}
