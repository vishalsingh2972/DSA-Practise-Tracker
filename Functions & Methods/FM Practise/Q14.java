import java.util.Scanner;
//Write a function that returns the sum of first n natural numbers
public class Q14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n = in.nextInt();

        System.out.println("The sum of the first " + n + " natural numbers is : "+ nsum(n));

    }

    static int nsum(int N){

        int sum = (N*(N+1))/2;

        return sum;
    }


}
