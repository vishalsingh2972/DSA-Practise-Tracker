import java.util.Scanner;
//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method
public class Q6 {
public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("Enter the radius : ");
    double r = in.nextDouble();

    System.out.println("The circumference of the circle is " + peri(r));
    System.out.println("The area of the circle is " + area(r));

}
    static double peri(double R){
        double PERI = Math.PI*2*R;
        return PERI;
    }
    static double area(double R1){
        double area = Math.PI*R1*R1;
        return area;
    }
}
