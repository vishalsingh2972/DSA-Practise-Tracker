import java.util.Scanner;
//Factorial program in java
public class Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int factorial=1;

        while (number>0) {
            factorial=factorial*number;
            number--;

        }
        System.out.println("The factorial of the given number is "+factorial );

    }
}
