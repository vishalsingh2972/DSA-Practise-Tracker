import java.util.Scanner;
//Curved Surface Area of Cylinder
public class Q19 {
    public static void main(String[] args) {
        System.out.println("Finding the Curved Surface Area of Cylinder");

        System.out.print("Enter the height of the Cylinder: ");
        Scanner input1 = new Scanner(System.in);
        double height = input1.nextDouble();

        System.out.print("Enter the radius of base of the Cylinder: ");
        Scanner input2 = new Scanner(System.in);
        double radius = input2.nextDouble();

        double CSA = (2*Math.PI * radius * height) ;
        System.out.println("The Curved Surface Area of Cylinder is " + CSA);
    }
}

