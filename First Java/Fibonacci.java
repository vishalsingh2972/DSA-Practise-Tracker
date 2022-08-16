package FirstJavaNew;

import java.util.Scanner;

//To calculate Fibonacci Series upto n numbers
public class Fibonacci {
    public static void main(String[] args) {
        Scanner Palindrome=  new Scanner(System.in);
        System.out.print("Please enter the number n = ");
        int number= Palindrome.nextInt();
        int i,n1=0,n2=1,n3;
        System.out.println(n1+""+n2);

      for (i=2; i<number ; i++) //loop starts from 2 because 0 and 1 have already been printed.
{
         n3 = n1+ n2;
    System.out.println(" "+ n3);
    n1=n2;
    n2=n3;
}
}
}
