import java.util.Scanner;
//Sum of digits of a number
public class Q24 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = in.nextInt();
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            sum += rem;
            System.out.println("The digit is " + rem);
        }

        System.out.println("The sum of all the digits is " + sum);

    }
}
