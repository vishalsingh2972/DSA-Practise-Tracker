import java.util.Scanner;
//Area of Equilateral Triangle
public class Q7 {
    public static void main(String[] args) {
        System.out.println("Finding the Area of the Equilateral Triangle");

        System.out.print("Enter the side length  of the Equilateral Triangle: ");
        Scanner input =  new Scanner(System.in);
        float side = input.nextFloat();

        double area = 0.25*side*side*Math.sqrt(3);
        System.out.println("The Area of the Equilateral Triangle is " + area);
    }
}

