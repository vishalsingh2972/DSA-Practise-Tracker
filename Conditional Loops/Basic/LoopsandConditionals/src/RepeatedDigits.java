import java.util.Scanner;

public class RepeatedDigits {
    public static void main(String[] args) {
        Scanner numb = new Scanner(System.in); //Take input from user or directly write int n = 45536 and check!
        int n = numb.nextInt();

        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 5) {
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }}