import java.util.Scanner;
//Perimeter of Rectangle
public class Q11 {
    public static void main(String[] args) {
        System.out.println("Finding the Perimeter of the Rectangle");

        System.out.print("Enter the length of the Rectangle: ");
        Scanner input1 = new Scanner(System.in);
        double length = input1.nextInt();

        System.out.print("Enter the breadth of the Rectangle: ");
        Scanner input2 = new Scanner(System.in);
        double breadth = input2.nextInt();

        double peri = (2*length) + (2*breadth);
        System.out.println("The Perimeter of the Rectangle is " + peri);

    }
}


