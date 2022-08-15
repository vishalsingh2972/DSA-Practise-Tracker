import java.util.Scanner;
//Area of Parallelogram
public class Q5 {
public static void main(String[] args) {
    System.out.println("Finding the Area of the Parallelogram");

    System.out.print("Enter the height of the Parallelogram: ");
    Scanner input1 = new Scanner(System.in);
    double height = input1.nextInt();

    System.out.print("Enter the length of base of the Parallelogram: ");
    Scanner input2 = new Scanner(System.in);
    double base = input2.nextInt();

    double area = height * base;
    System.out.println("The Area of the Parallelogram is " + area);


}

}
