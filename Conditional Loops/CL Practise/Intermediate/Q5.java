import java.util.Scanner;
//Calculate Distance between Two Points
public class Q5 {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter the x coordinate of the first point: ");
        int x1 = in1.nextInt();
        double distance;

        Scanner in2 = new Scanner(System.in);
        System.out.print("Enter the y coordinate of the first point: ");
        int y1 = in2.nextInt();

        Scanner in3 = new Scanner(System.in);
        System.out.print("Enter the x coordinate of the second point: ");
        int x2 = in3.nextInt();

        Scanner in4 = new Scanner(System.in);
        System.out.print("Enter the y coordinate of the second point: ");
        int y2 = in4.nextInt();

        distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("The distance between the two points is : " + distance);
    }
}
