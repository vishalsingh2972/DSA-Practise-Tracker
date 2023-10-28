import java.util.Scanner;
//Power in Java
public class Q7 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = in1.nextInt();

        Scanner in2 = new Scanner(System.in);
        System.out.print("Enter the Power : ");
        int power = in2.nextInt();

        int k = 1;

        while(power!=0)
        {
            k = number*k;
             power--;
        }

//        do {
//
//            k = number*k;
//             power--;
//        }while(power!=0);

        System.out.println("The answer is " + k); //statement gives correct output even if power is 0

    }
}
