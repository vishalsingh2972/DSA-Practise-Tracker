import java.util.Scanner;
//Write a function to find if a number is a palindrome or not. Take number as parameter
public class Q10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = in.nextInt();

        System.out.println(palindrome(num));


    }
    static String palindrome(int NUM) {
        int sum = 0;
        int temp = NUM;
        while (NUM > 0) {
            int rem = NUM % 10;
            sum = 10 * sum + rem;
            NUM = NUM / 10;

        }
        if (sum == temp) {
            return "Yes it is a Palindrome";
        }
        //else {
        return "No it is not a Palindrome";
        //}
    }
}
