import java.util.Scanner;
//Perimeter of Rhombus
public class Q13 {
    public static void main(String[] args) {
        System.out.println("Finding the Perimeter of the Rhombus");

        System.out.print("Enter the side of the Rhombus: ");
        Scanner input1 = new Scanner(System.in);
        double side = input1.nextInt();

        double peri = 4*side;
        System.out.println("The Perimeter of the Rhombus is " + peri);

    }
}

