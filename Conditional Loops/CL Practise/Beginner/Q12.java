import java.util.Scanner;
//Perimeter of Square
public class Q12 {
    public static void main(String[] args) {
        System.out.println("Finding the Perimeter of the Square");

        System.out.print("Enter the side of the Square: ");
        Scanner input1 = new Scanner(System.in);
        double side = input1.nextInt();

        double peri = 4*side;
        System.out.println("The Perimeter of the Square is " + peri);

    }
}



