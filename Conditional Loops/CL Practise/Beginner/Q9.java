import java.util.Scanner;
//Perimeter of Equilateral Triangle
public class Q9 {
    public static void main(String[] args) {
        System.out.println("Finding the Perimeter of Equilateral Triangle");

        System.out.print("Enter the side of the Equilateral Triangle: ");
        Scanner input = new Scanner(System.in);
        float side = input.nextFloat();

        double peri = 3 * side;
        System.out.println("The Perimeter of Equilateral Triangle is " + peri);

    }
}
