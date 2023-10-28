import java.util.Scanner;

public class nthFibnumber {
    //To find the nth Fibonacci Number (WHILE LOOP)

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2; //Count starting from 2 as O and 1 have already been printed.

        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;

        }

        System.out.println("The " + n + " Fibonacci number is " + b );


    }
}