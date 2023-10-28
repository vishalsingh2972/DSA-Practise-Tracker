import java.util.Scanner;
//Area of Isosceles Triangle
public class Q4 {

public static void main(String[] args) {
    System.out.println("Finding the Area of the Isosceles Triangle");

    System.out.print("Enter the length of the base of the Isosceles Triangle: ");
    Scanner input1 = new Scanner(System.in);
    double base = input1.nextInt();

    System.out.print("Enter the length of equal side of the Triangle: ");
    Scanner input2 = new Scanner(System.in);
    double equalside = input2.nextInt();

    double area = (base/4)*Math.sqrt((4*equalside*equalside)-(base*base));
    System.out.println("The Area of the Isosceles Triangle is " + area);


}

}
