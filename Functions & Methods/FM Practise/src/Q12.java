import java.util.Scanner;

//Write a function to check if a given triplet is a Pythagorean triplet or not
//(A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number)
public class Q12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 3 numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println("The 3 entered numbers form a Pythagorean Triplet : " + triplet(a, b, c) );

    }

    static boolean triplet(int A, int B, int C) {

        if( C*C == A*A + B*B)  {
            System.out.println("Yes it is a Pythagorean Triplet ");
            return true;
        }
        else{
            System.out.println("No it is not a Pythagorean Triplet");
           return false;
        }

    }
}