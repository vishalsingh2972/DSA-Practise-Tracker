import java.util.Scanner;
//Calculate Discount of Product
public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("The Actual Price of the Product is Rs ");
        double price = in.nextDouble();
        double discount;

        if (price > 1000) {
            discount = price * 0.2;
        }
         else if (price > 500) {
            discount = price * 0.1;
        }
        else {
            discount = price*0.3;
        }
        double reducedprice = price-discount;
        System.out.println("Total Reduced Price of the Product is Rs " + reducedprice);
        System.out.println("Discount applied on the Product is Rs " + discount);

    }
}
