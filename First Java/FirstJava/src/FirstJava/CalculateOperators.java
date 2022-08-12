package FirstJavaNew;
import java.util.Scanner;
//Take in two numbers and an operator (+, -, *, /) and calculate the value (Use if conditions)
public class CalculateOperators {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            // Take input from user till user does not press X or x
            int ans = 0;
            while (true) {
                // take the operator as input
                System.out.print("Enter the operator: ");
                char op = in.next().trim().charAt(2); // Taking Operator to be used as input; operator being used is at a particular index position.

                if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                    // input two numbers
                    System.out.print("Enter two numbers: ");
                    int num1 = in.nextInt();
                    int num2 = in.nextInt();

                    if (op == '+') {
                        ans = num1 + num2;
                    }
                    if (op == '-') {
                        ans = num1 - num2;
                    }
                    if (op == '*') {
                        ans = num1 * num2;
                    }
                    if (op == '/') {
                        if (num2 != 0) {
                            ans = num1 / num2;
                        }
                    }
                    if (op == '%') {
                        ans = num1 % num2;
                    }
                } else if (op == 'x' || op == 'X') {
                    break;
                } else {
                    System.out.println("Invalid operation!!");
                }
                System.out.println(ans);
            }
        }
    }





