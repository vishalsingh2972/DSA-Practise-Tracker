package FirstJava;

import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        System.out.println("Calculating Simple Interest");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal:");
        int P = input.nextInt();
        System.out.print("Enter Time:");
        int T = input.nextInt();
        System.out.print("Enter Rate:");
        int R = input.nextInt();
        float Interest = P*R*T/100;
        System.out.print("The Simple Interest is Rs " + Interest);
    }
}