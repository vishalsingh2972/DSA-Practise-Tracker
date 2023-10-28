import java.util.Scanner;
//Area of Rhombus
public class Q6 {
    public static void main(String[] args) {
        System.out.println("Finding the Area of the Rhombus");

        System.out.print("Enter the length of diagonal 1 of the Rhombus: ");
        Scanner input1 = new Scanner(System.in);
        double d1 = input1.nextInt();

        System.out.print("Enter the length of diagonal 2 of the Rhombus: ");
        Scanner input2 = new Scanner(System.in);
        double d2 = input2.nextInt();

        double area = 0.5 * d1 * d2;
        System.out.println("The Area of the Rhombus is " + area);

    }
}
