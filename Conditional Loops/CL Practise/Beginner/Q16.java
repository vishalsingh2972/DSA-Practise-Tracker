import java.util.Scanner;
//Volume of Cylinder
public class Q16 {
    public static void main(String[] args) {
        System.out.println("Finding the Volume of Cylinder");

        System.out.print("Enter the height of the Cylinder: ");
        Scanner input1 = new Scanner(System.in);
        double height = input1.nextDouble();

        System.out.print("Enter the radius of base of the Cylinder: ");
        Scanner input2 = new Scanner(System.in);
        double radius = input2.nextDouble();

        double vol = (Math.PI * radius * radius * height) ;
        System.out.println("The Volume of the Cylinder is " + vol);
    }
}