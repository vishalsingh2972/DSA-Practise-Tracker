import java.util.Scanner;
//Calculate Electricity Bill
public class Q2 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount of KWH used per day: ");
        double kwh = in.nextDouble();
        System.out.print("Enter the cost of the KWH: ");
        double cost = in.nextDouble();
        System.out.print("Enter the number of days used: ");
        int days = in.nextInt();
        double bill = 0;

        if(kwh > 0 && cost > 0 && days > 0){
            bill = kwh * cost * days;
            System.out.print("The bill is Rs: " + bill);
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}