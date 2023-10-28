import java.util.Scanner;
//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user
public class Q1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 3 numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println("The max of the 3 is " + max(a,b,c));
        System.out.println("The min of the 3 is " + min(a,b,c));

    }

    static  int max(int A, int B, int C){
        int max = A;

        if (B > max){
            max = B;
        }
        if (C > max){
            max = C;
        }

        return  max; //or instead of if directly write return Math.max(C,Math.max(A,B));
    }



    static  int min(int A2, int B2, int C2){
        int min = A2;

        if(B2 < min){
            min = B2;
        }
        if (C2 < min){
            min = C2;
        }
        return  min; //or instead of if directly write return Math.min(C2,Math.min(A2,B2));
    }

}
