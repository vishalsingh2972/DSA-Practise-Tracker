import java.util.Scanner;
//Volume of Prism (Rectangular)
public class Q15 {public static void main(String[] args) {
    System.out.println("Finding the Volume of Prism");

    System.out.print("Enter the length of base of the Prism: ");
    Scanner input2 = new Scanner(System.in);
    double length = input2.nextDouble();

    System.out.print("Enter the breadth of base of the Prism: ");
    Scanner input3 = new Scanner(System.in);
    double breadth = input3.nextDouble();

    System.out.print("Enter the height of the Prism: ");
    Scanner input1 = new Scanner(System.in);
    double height = input1.nextDouble();

    double vol = length*breadth*height;
    System.out.println("The Volume of the Prism is "+ vol);

}
}


