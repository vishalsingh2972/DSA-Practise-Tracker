import java.util.Scanner;
//Volume of Sphere
public class Q17 {
    public static void main(String[] args) {
        System.out.println("Finding the Volume of Sphere");

        System.out.print("Enter the radius of the Sphere: ");
        Scanner input1 = new Scanner(System.in);
        double radius = input1.nextDouble();

        double vol = ((Math.PI * radius * radius * radius * 4) / 3);
        System.out.println("The Volume of the Sphere is " + vol);
    }
}