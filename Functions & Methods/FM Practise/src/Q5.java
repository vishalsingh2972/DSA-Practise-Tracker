import java.util.Scanner;
//Define a method that returns the product of two numbers entered by user
public class Q5 {
public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("Enter the 2 numbers : ");
    int a = in.nextInt();
    int b = in.nextInt();

    System.out.println("The product of the 2 numbers is " + pro(a,b));

}
    static  int pro(int A, int B){
        int pro = A*B;
        return pro;
    }
}
