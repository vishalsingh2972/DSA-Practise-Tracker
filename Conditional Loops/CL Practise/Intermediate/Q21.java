import java.util.Scanner;
//Java program Vowel or Cononent
public class Q21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the letter to be checked : ");
        char ch = in.next().charAt(0); //for taking character input in java

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            System.out.println(ch + " is a Vowel");
        }
        else
        {
            System.out.println(ch + " is a Consonant");
        }
    }
}




