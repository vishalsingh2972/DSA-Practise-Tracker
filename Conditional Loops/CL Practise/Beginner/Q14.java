import java.util.Scanner;

//Volume of Cone Java Program
public class Q14 {
    public static void main(String[] args) {
        System.out.println("Finding the Volume of Cone");

        System.out.print("Enter the height of the Cone: ");
        Scanner input1 = new Scanner(System.in);
        double height = input1.nextDouble();

        System.out.print("Enter the radius of base of the Cone: ");
        Scanner input2 = new Scanner(System.in);
       double radius = input2.nextDouble();

       double vol = ((Math.PI *radius*radius*height)/3); //or   double vol = ((Math.PI *radius*radius*height)*1.0/3);
        System.out.println("The Volume of the Cone is "+ vol);

     //Note
//double vol = ((Math.PI *radius*radius*height)*1.0/3);  here 1.0/3 is float so value is stored as 0.33 and then further multiplication is taking place so answer is not zero.
//double vol = ((Math.PI *radius*radius*height)*1/3);   here 1/3 (num. int, den. int) so 0.33 will be stored as int i.e it will be solved as 0 and then proceed further for multiplication hence resultant value comes out as zero.


    }
}

