import java.util.Scanner;

public class ThreeDigitArmstrongs {
    public static void main(String[] args) {

        for (int i = 153; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i + " is an armstrong number");
            }
            //else System.out.println(".");
        }
    }
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }

        if (sum == original) {  // or just write return sum==original;, // here is sum is equal to original it will return true otherwise will return false
            return true;
        }
        else return false;
    }
}



