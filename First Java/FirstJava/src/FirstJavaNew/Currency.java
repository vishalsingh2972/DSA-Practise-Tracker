package FirstJavaNew;

import java.util.Scanner;
//Input currency in rupees and output in USD
public class Currency {
    public static void main(String[] args) {
        System.out.println("Converting INR to USD");
        Scanner INR = new Scanner(System.in);
        System.out.print("Enter currency in INR: Rs");
        int INRAmount = INR.nextInt();
        int USDAmount = (int) (0.013*INRAmount); //or double USAmount = 0.013*INRAmount (Automatic Type Promotion)
        System.out.println("Currency in USD is $"+ USDAmount);







    }
}
