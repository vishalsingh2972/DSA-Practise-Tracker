import java.util.Scanner;
//Reverse a String in Java
public class Q16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the word : ");
        String word = in.next();
        String rev = ""; //putting empty as if we put null, null also gets added and printed along with the word
        int len = word.length();

        for (int i = len - 1; i >= 0; i--) {
            rev = rev + word.charAt(i);//here initially i will be at the last letter.
        }
        System.out.println("The reverse of the given word is : " + rev);
    }
}