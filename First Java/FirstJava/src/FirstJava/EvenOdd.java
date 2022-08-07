package FirstJava;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a positive Integer:");
        int num = input.nextInt();
        if (num%2==0) {
            System.out.println("Number is Even");
        }
        else
        System.out.println("Number is Odd");
    }
}
