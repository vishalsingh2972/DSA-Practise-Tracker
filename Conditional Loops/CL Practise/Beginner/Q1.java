import java.util.Scanner;
//Area of Circle
public class Q1 {
    public static void main(String[] args) {
        System.out.println("Finding the Area of the Circle");
        System.out.print("Enter the Radius of the Circle: ");

        Scanner input =  new Scanner(System.in);
        float radius = input.nextFloat();

        double area = 3.14*radius*radius; // or can also use PI constant--->double area = Math.PI*radius*radius;
        System.out.println("The Area of the circle is " + area);
    }
}
