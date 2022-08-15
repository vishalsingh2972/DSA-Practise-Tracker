import java.util.Scanner;
//Perimeter of Parallelogram
public class Q10 {
    public static void main(String[] args) {
        System.out.println("Finding the Perimeter of Parallelogram");

        System.out.print("Enter the height of the Parallelogram: ");
        Scanner input1 = new Scanner(System.in);
        double height = input1.nextInt();

        System.out.print("Enter the length of base of the Parallelogram: ");
        Scanner input2 = new Scanner(System.in);
        double base = input2.nextInt();

        double peri = (2*height) + (2*base);
        System.out.println("The Perimeter of the Parallelogram is " + peri);


    }

}

