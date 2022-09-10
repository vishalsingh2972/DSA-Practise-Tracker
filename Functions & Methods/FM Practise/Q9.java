import java.util.Scanner;
//Write a program to print the factorial of a number by defining a method named 'Factorial'
public class Q9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();

        System.out.println("The factorial of " + n + " is " + Factorial(n));

    }

    static int Factorial( int N){
        int temp = 1;
         while (N > 0)
         {
             temp = temp * N;
             N--;
         }

        return temp;

    }


}
