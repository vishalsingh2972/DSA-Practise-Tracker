package FirstJavaNew;
import java.util.Scanner;
//Take name as input and print a greeting message for that particular name
public class Greeting {

    public static void main(String[] args) {
        System.out.print("Hey what's your name:");
        Scanner input = new Scanner(System.in);
        System.out.println("Hello "+ input.next()+ "!"+  "  Welcome to the world of JAVA :)");


    }
}