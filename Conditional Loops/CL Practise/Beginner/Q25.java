
import java.util.Scanner;
// Take integer inputs till the user enters 0 and print the largest number from all
public class Q25 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int num = in.nextInt();
        int max = num; //Assuming first entered number as maximum and proceeding ahead

        while (num != 0) {

            System.out.print("Enter the Remaining Number: ");
            num = in.nextInt();
            if (max<num)
            {
                max = num;
            }

        }
        System.out.println("The maximum of all the entered numbers is: "+ max);
    }
}