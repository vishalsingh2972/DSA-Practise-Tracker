import java.util.Scanner;
//Average of N numbers (consecutive)
public class Q3 {
//    public static void main(String[] args) {
//        int n;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of elements: ");
//        n = sc.nextInt();
//        float average = (float)(n+1)/2; //Average formula (n +1)/2;
//
//        System.out.println("Average is: " + average);
//    }
//}

//Average of N numbers (not necessarily consecutve/ any input)
public static void main(String[] args){

    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number of elements : ");
    int n = in.nextInt();
    int sum = 0;
    System.out.print("Enter the "+n+" elements respectively : ");

    for(int i = 0; i < n; i++)
    {
        int num = in.nextInt();
        sum += num;
    }
    double average = (double)sum / n;
    System.out.println("The Average of the given numbers is : " + average);
}
}

