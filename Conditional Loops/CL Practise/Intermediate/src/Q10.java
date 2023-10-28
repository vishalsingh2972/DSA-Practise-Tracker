import java.util.Scanner;
//Calculate CGPA Java Program
public class Q10 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int subject ;
        double total = 0;
        int count = 0;

        while(true){
            System.out.print("Enter a subject grade points : ");
            subject= input.nextInt();

            if (subject == 0)
            {
                break; //You can't break out of if statement until the if is inside a loop. (break does not break out of an if statement)
            }
            count++;
            total+=subject;
        }
        System.out.print("the cgpa will be : "+total/count);
    }
}