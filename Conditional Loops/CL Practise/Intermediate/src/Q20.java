import java.util.Scanner;
//LCM of Two Numbers
public class Q20
{
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("Enter the numbers : ");
    int a = in.nextInt();
    int b = in.nextInt();
    int HCF = 0;
    System.out.print("The Common Factors of the both numbers are : ");


    for (int i = 1; i <= a; i++)
    {
        if (a % i == 0 && b % i == 0)
        {
            System.out.print(i + ","); //prints all common factors of a and b;
            HCF = i;
        }

    }

    int LCM = (a*b)/(HCF); //As we know, HCF x LCM = Product of the two numbers
        System.out.println();
    // System.out.println("Highest Common Factor of "+ a + " and " + b + " is " + HCF);
        System.out.println( "Least Common Multiple of "+ a + " and " + b + " is " + LCM );

}
}
