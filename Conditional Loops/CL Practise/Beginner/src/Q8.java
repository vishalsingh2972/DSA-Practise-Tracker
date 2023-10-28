import java.util.Scanner;
//Perimeter of Circle
public class Q8 {
    public static void main(String[] args) {
        System.out.println("Finding the Perimeter of the Circle");

        System.out.print("Enter the Radius of the Circle: ");
        Scanner input = new Scanner(System.in);
        float radius = input.nextFloat();

        double area = 2 * 3.14 * radius; // or can also use PI constant--->double area = 2*Math.PI*radius;
        System.out.println("The Perimeter of the Circle is " + area);
    }
}