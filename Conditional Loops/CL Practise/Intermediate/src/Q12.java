import java.util.Scanner;
//Calculate Average Marks
public class Q12 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        double marks = sc.nextDouble();
        double sum = 0;
        int num = 0;

        while(marks!=-1)
        {
            sum= sum + marks; //sum+=marks;
            System.out.print("Enter your next marks: ");
            marks = sc.nextDouble();
            num ++;
        }

        double average = sum/num;
        System.out.println("Average of all the entered marks is : " + average);
    }
}