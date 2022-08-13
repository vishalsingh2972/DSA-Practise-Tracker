import java.util.Scanner;
//Find the Largest of 3 numbers (3 methods)

Method 1 Assuming a =  Max
public class Largestof3 {

   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       int a = in.nextInt();
       int b = in.nextInt();
       int c = in.nextInt();

       int max= a;
       if(b > max) {
           max = b;
       }
       if(c > max) {
           max =c;
       }
       System.out.println("The Maximum number is "+max);

   }
}
---------------------------------------------------------------

//Method 2 Assuming max = 0 initially
public class Largestof3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = 0;
        if (a > b){
            max =  a;
        } else {
            max = b;
        }

        if (c > max){
            max = c;
        }
        System.out.println("The Maximum number is "+ max);
        }


    }
//---------------------------------------------------------------

////Method 3 Using Math.max function
//public class Largestof3 {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//
//         int max = Math.max(c,Math.max(a,b));
//
//        System.out.println(max);
//      //For 2 numbers you can directly check as System.out.println(Math.max(20,45));
//    }}