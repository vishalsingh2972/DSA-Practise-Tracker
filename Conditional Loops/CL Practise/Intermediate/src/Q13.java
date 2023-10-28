import java.util.Scanner;
//Sum of N numbers (consecutive)
public class Q13 {
//    public static void main(String[] args) {
//        int n;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of elements: ");
//        n = sc.nextInt();
//        float sum = (float)(n*n+n)/2; //Sum of N consecutive numbers formula n*(n +1)/2;
//
//        System.out.println("The sum of the consecutive numbers is : " + sum);
//    }
//}

//Sum of N numbers (not necessarily consecutve/ any input)
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = in.nextInt();
        int sum = 0;
        System.out.print("Enter the " + n + " elements respectively : ");

        for(int i = 0; i < n; i++)
        {
            int num = in.nextInt();
            sum += num;
        }
        System.out.println("The Sum of all the enetered numbers is : " + sum);
    }
}

