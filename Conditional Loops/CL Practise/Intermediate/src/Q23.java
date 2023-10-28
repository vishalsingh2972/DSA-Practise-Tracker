import java.util.Scanner;
//Check Leap Year or Not
public class Q23 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Year: ");
        int year = input.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }
    }
}



