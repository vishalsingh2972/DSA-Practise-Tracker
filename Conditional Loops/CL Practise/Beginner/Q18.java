import java.util.Scanner;
//Volume of Pyramid
public class Q18 {
    public static void main(String[] args) {
    System.out.println("Finding the Volume of Pyramid");

    System.out.print("Enter the length of base of the Pyramid: ");
    Scanner input2 = new Scanner(System.in);
    double length = input2.nextDouble();

    System.out.print("Enter the breadth of base of the Pyramid: ");
    Scanner input3 = new Scanner(System.in);
    double breadth = input3.nextDouble();

    System.out.print("Enter the height of the Pyramid: ");
    Scanner input1 = new Scanner(System.in);
    double height = input1.nextDouble();

    double vol = (length*breadth*height)/3;
    System.out.println("The Volume of the Pyramid is "+ vol);

}
}


