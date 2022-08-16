import java.util.Scanner;
//Area of Triangle
public class AreaofTriangle {
    public static void main(String[] args) {
        System.out.println("Finding the Area of the Triangle");

        System.out.print("Enter the height of the Triangle: ");
        Scanner input1 = new Scanner(System.in);
        double height = input1.nextInt();

        System.out.print("Enter the length of base of the Triangle: ");
        Scanner input2 = new Scanner(System.in);
        double base = input2.nextInt();

        double area = 0.5*height*base;
        System.out.println("The Area of the Triangle is "+ area);




    }
}
