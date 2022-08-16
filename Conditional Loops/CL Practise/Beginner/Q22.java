//Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        System.out.println("To find the Difference between Product and Sum of Digits of an Integer");

        System.out.print("Enter the Number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int a = 0;
        int sum = 0;
        int pro = 1;
        int dif=0;

        while (num>0) {

            int rem = num % 10;
            num = num / 10;

            a = rem;
            //System.out.println(a);
            sum = sum + a;
            pro = pro * a;
            dif = pro - sum;
        }

            System.out.println("Sum of all digits is: "+ sum);
            System.out.println("Product of all digits is: "+ pro);
            System.out.println("Difference between Product and Sum of digits is: "+ dif);

        }

    }


