import java.util.Scanner;
//Calculate Depreciation of Value
public class Q8 {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);

        double initialcost, depPercent, year;

        System.out.print("Enter initial amount of asset: ");
        initialcost=sc.nextInt();

        System.out.print("Enter percentage depreciation: ");
        depPercent=sc.nextInt();

        System.out.print("Enter number of years: ");
        year=sc.nextInt();

        double value = initialcost;

        //calculating cost after depreciation
        for(int i = 0 ; i < year ; i++)
        {
            value=((100-depPercent)*value)/100;
        }
        System.out.println("Before depreciation value was  "+initialcost);
        System.out.println("After depreciation value is  "+value);

    }
}

