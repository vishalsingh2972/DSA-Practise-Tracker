package FirstJava;

import java.util.Scanner;

//To find Armstrong Number between two given numbers given as input.
public class Armstrongnumber {
    public static void main(String[] args) {
        Scanner Arms = new Scanner(System.in);
        System.out.print("Enter your first number:");
        int n1 = Arms.nextInt();
        System.out.print("Enter your second number:");
        int n2 = Arms.nextInt();

        {
            int temp1 = n1;
            int r1, sum1 = 0;
            while (n1 > 0) {
                r1 = n1 % 10;
                n1 = n1 / 10;
                sum1 = sum1 + r1 * r1 * r1;
            }
            if (temp1 == sum1)
                System.out.println(temp1 + " is an Armstrong number");
            else
                System.out.println(temp1 + " is not an Armstrong number");

        }

        {
            int temp2 = n2;
            int r2, sum2 = 0;
            while (n2 > 0) {
                r2 = n2 % 10;
                n2 = n2 / 10;
                sum2 = sum2 + r2 * r2 * r2;
            }
            if (temp2 == sum2)
                System.out.println(temp2 + " is an Armstrong number");
            else
                System.out.println(temp2 + " is not an Armstrong number");

        }

    }
    }



