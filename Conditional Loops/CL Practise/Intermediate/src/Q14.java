import java.util.Scanner;
//Armstrong Number in Java
public class Q14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to be checked: ");
        int num = in.nextInt();
        int temp = num;
        int sum = 0;


         while (num > 0) {
             int rem = num % 10;
             num = num / 10;
             sum = sum + rem * rem * rem;

         }
             if (sum == temp) {
                 System.out.println("Hey the number you entered is Armstrong");
             } else {
                 System.out.println("Not Armstrong Number");

             }

    }
}
