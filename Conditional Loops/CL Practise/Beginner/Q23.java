import java.util.Scanner;
// Input a number and print all the factors of that number (use loops)
public class Q23 {
    public static void main(String[] args) {

        System.out.print("Enter the Number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int count = 2;

        while (count <= num) {
            if (num % count == 0)
            {
                System.out.println(count + " is a factor");
            }
//            else{
//                System.out.println(count+ " is not a factor");
//            }
            count++;

            }


        }


    }

