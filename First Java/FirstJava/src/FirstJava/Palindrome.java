
package FirstJava;

import java.util.Scanner;

    public class Palindrome {
        public static void main(String[] args) {
            System.out.println("Check whether word is Palindrome or not");
            System.out.print("Enter the string which you want to check:");
            String original, reverse = "";
            Scanner word = new Scanner(System.in);
            original = word.nextLine();
            int length = original.length();

            for (int i = length - 1; i >= 0; i--)
                reverse = reverse + original.charAt(i);
            if (original.equals(reverse))
                System.out.println(original + " is a Palindrome");
            else
                System.out.println(original + " is not a Palindrome");
        }
    }





