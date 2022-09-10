import java.util.Scanner;
//Define a method to find out if a number is prime or not
public class Q7{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println("Is "+ n + " prime ? " +ans);
        //System.out.println(isPrime(n));

    }
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }

        return c * c > n;
//        if (c * c > n){
//            return true;
//        }
//           return false;

    }
}


