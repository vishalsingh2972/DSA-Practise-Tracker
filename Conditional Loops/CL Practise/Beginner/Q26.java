import java.util.Scanner;
//Addition of Two Numbers

public class Q26 {
    public static void main(String[] args) {
        System.out.println("Finding the Sum of Two Numbers");

        System.out.print("Enter the First Number: ");
        Scanner input1 = new Scanner(System.in);
        int num1 = input1.nextInt();

        System.out.print("Enter the Second Number: ");
        Scanner input2 = new Scanner(System.in);
        int num2 = input2.nextInt();

        int add = num1 + num2;
        System.out.println("The Sum of the Two Numbers is " + add);
    }
}
