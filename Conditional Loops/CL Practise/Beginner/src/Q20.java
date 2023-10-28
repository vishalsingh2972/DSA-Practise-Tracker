import java.util.Scanner;
//Total Surface Area of a Cube
public class Q20 {public static void main(String[] args) {
    System.out.println("Finding the Total Surface Area of a Cube");

    System.out.print("Enter the side of the Cube: ");
    Scanner input1 = new Scanner(System.in);
    double side = input1.nextInt();

    double TSA = 6*side*side;
    System.out.println("The Total Surface Area of Cube is " + TSA);

}
}

