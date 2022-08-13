import java.util.Scanner;
//Check case of the Alphabet at a given Index position
public class CaseChecker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
          char ch= in.next().trim().charAt(1); //gives me the character at particular index of the string.

       if (ch >= 'a' && ch<= 'z') {
           System.out.println("Alphabet is lowercase");
       }
       else {
           System.out.println("Alphabet is UPPERCASE");
       }


    }


}
