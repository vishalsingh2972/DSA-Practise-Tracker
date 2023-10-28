import java.util.Scanner;
//Compound Interest Java Program
public class Q11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount : ");
        double p = sc.nextDouble();
        System.out.print("Enter Rate of interest : ");
        double rate = sc.nextDouble();
        System.out.print("Enter time : ");
        double time = sc.nextDouble();

        System.out.println("The Compound Interest value is "+ compoundInterest(p, rate, time));

    }
    static double compoundInterest(double p,double rate,double time)
    {
        double CI = p * Math.pow((1 + rate/100),time) - p;
        return CI;
    }

          //Another Approach
//        compoundInterest(p, rate, time);
//        double CI =  compoundInterest(p, rate, time);
//        System.out.println("The Compound Interest value is "+ CI);
//
//}
//    static double compoundInterest(double p,double rate,double time)
//    {
//        return p * Math.pow((1 + rate/100),time) - p;
//    }


}