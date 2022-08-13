package SwitchandNestedCases;

import java.util.Scanner;

public class NestedSwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();


        switch (empID) {
            case 1:
                System.out.println("Vishal Singh");
                break;
            case 2:
                System.out.println("Sahil Singh");
                break;
            case 3:
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "DevOps":
                        System.out.println("DevOps Department");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;
            default:
                System.out.println("Enter correct EmpID");
        }
    }
}
// Enhanced Switch
//        switch (empID) {
//            case 1 -> System.out.println("Vishal Singh");
//            case 2 -> System.out.println("Sahil Singh");
//            case 3 -> {
//                System.out.println("Emp Number 3");
//                switch (department) {
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "DevOps":
//                        System.out.println("DevOps Department");
//                        break;
//                    default:
//                        System.out.println("No department entered");
//                }
//            }
//            default -> System.out.println("Enter correct EmpID");
//        }
