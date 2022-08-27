import java.util.Scanner;
//Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August
public class Q25 {
    public static void main(String[] args) {
        int count = 0;
 int date;
       for ( date = 1; date<=31; date++) //August has 31 days
       {
            if (date % 2 == 0)
            {
               count++;

            }

        }
        System.out.println("The number of days the Kunal is allowed to go out in the month of August is " + count + " days");
    }
}





//Check if Kunal allowed or not (program where Kunal is allowed to go out only on even days of the August month)

//    Scanner in = new Scanner(System.in);
//        System.out.print("Let's see if Kunal gets permission! Enter the date : ");
//                int date =in.nextInt();
//
//                while (date<31)
//        {
//        if (date%2==0)
//        {
//        System.out.println("YAY ! He is allowed to go :) ");
//        }
//        else {
//        System.out.println("No, permission not granted X");
//        }
//        }
//        while (date>31)
//        {
//        System.out.println("Bhai mahine main 31 days hi hote hai !");
//        break;
//        }
//        }
//        }

