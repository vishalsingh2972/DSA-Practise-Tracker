import java.util.Scanner;
//Write a program to print the sum of two numbers entered by user by defining your own method
public class Q4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 2 numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println("The sum of the 2 numbers is " + sum(a,b));

    }
    static  int sum(int A, int B){
        int sum = A +  B;
        return  sum;
    }
}
