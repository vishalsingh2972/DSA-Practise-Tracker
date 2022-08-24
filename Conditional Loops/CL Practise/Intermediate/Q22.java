import java.util.Scanner;

//Perfect number in Java (sum of all factors = number , is a perfect number)
public class Q22 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = in.nextInt();
        int i;
        int sum = 0;

        for (i=2; i<num; i++)
        {
            if (num % i == 0)
            {
                sum = sum + i;

            }

        }

        System.out.println("The sum of all factors of "+ num+ " is " + sum);

    }
}
