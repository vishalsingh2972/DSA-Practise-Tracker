package SwitchandNestedCases;

import java.util.Scanner;
/* NOTE:
-cases (Mango - string)  have to be same type as expressions(King of fruits - string), must be constat or literal.
-duplicate case values are not allowed.
-break is used to terminate the sequence. (otherwise everything else after the true statement will also get printed)
-if break is not used, it will continue to next case.
-default will execute when none of the above does.
-if default is not at the end, put a break after it.
 */
public class switchcases {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("Keeps doctor away");
                break;
            case "Orange":
                System.out.println("Tangy citrus fruit");
                break;
            case "Grapes":
                System.out.println("Small juicy fruit");
                break;
            default:
                System.out.println("Not a valid fruit");
        }

        //Enhanced Switch (cleaner Switch, and we don't require/use break in enhanced switch i.e break condition is there and is being used but its just not written)
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//             // if we have multiple conditions to be written in each case we can use{ } like
//             case "Mango" -> {
//            System.out.println("King of fruits");
//            // }
//            case "Apple" -> System.out.println("Keeps doctor away");
//            case "Orange" -> System.out.println("Tangy citrus fruit");
//            case "Grapes" -> System.out.println("Small juicy fruit");
//            default -> System.out.println("Not a valid fruit");
//        }

    }

}

        //Instances where not putting multiple break conditions for each case can be used
//Eg: So here just one break condition is enough, we input the day and we get output as whether it is a weekday or weekend.
//        switch (day) {
//                case 1:
//                case 2:
//                case 3:
//                case 4:
//                case 5:
//                 System.out.println("It is a Weekday");
//                 break;
//                case 6:
//                case 7:
//                System.out.println("Weekend is here");
//   }
// Similarly enhances switch for this can be like
//          switch (day) {
////                case 1,2,3,4,5 -> System.out.println("It is a Weekday");
//                  case 6,7 -> System.out.println("Weekend is here");
//                  }




