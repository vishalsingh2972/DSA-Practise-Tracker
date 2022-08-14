import java.util.Scanner;

public class ReverseNumber  {
    public static void main(String[] args) {
        Scanner Reverse = new Scanner(System.in);
        int sidha = Reverse.nextInt();

        int ans = 0;
         while (sidha>0) {
             int rem = sidha % 10;
             sidha /=10; // sidha = sidha/10 or can also use sidha = (sidha-rem)/10;

            ans = ans * 10 + rem;


    }
        System.out.println("The Reverse of the the number is "+ans);
    }

}
