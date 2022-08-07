package FirstJava;

import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        System.out.print("Hey what's your name:");
        Scanner input = new Scanner(System.in);
        System.out.println("Hello "+ input.next()+ "!"+  "  Welcome to the world of JAVA :)");


    }
}