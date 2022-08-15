import java.util.Scanner;
//Area of Rectangle
public class Q3 {
    public static void main(String[] args) {
        System.out.println("Finding the Area of the Rectangle");

        System.out.print("Enter the length of the Rectangle: ");
        Scanner input1 = new Scanner(System.in);
        double length = input1.nextInt();

        System.out.print("Enter the breadth of the Rectangle: ");
        Scanner input2 = new Scanner(System.in);
        double breadth = input2.nextInt();

        double area = length * breadth;
        System.out.println("The Area of the Rectangle is " + area);

    }
}
