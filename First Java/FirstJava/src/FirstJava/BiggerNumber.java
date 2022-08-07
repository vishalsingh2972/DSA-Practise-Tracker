package FirstJava;

import java.util.Scanner;
//Take 2 numbers as input and print the largest number
public class BiggerNumber {
    public static void main(String[] args) {
        Scanner Big = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = Big.nextInt();
        System.out.print("Enter second number:");
        int num2 = Big.nextInt();
        System.out.println("Largest of the two numbers is "+Math.max(num1,num2));
    }
}
