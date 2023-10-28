import java.util.Scanner;
//Calculate Commission Percentage
public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of sales done (in Rs) : ");
        double sales = in.nextDouble();
        double com;

        if (sales > 20000)
        {
            com = sales * 0.2;
        }
        else if (sales > 10000 && sales < 20000)
        {
            com = sales * 0.1;
        }
        else if (sales < 10000 && sales > 5000)
        {
            com = sales * 0.05;
        }
        else {
            com = 0;
            System.out.println("No Commission, better luck next time! ");
        }
        double aftercom = sales + com;
        System.out.println("Total Price including commision is Rs " + aftercom);
        System.out.println("The amount of commission recieved is Rs " + com);
        System.out.println("Commission Percentage is Rs " + com/sales);

    }
}


