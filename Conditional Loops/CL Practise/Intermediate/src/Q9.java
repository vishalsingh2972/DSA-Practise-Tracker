import java.util.Scanner;
//Calculate Batting Average
public class Q9 {
  public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of Runs : ");
        int runs = input.nextInt();

        System.out.print("Enter number of matches played : ");
        int matches = input.nextInt();

        System.out.print("Enter number of not-out matches : ");
        int notout = input.nextInt();
        int outmatches = matches - notout;

      double bataverage = runs/outmatches;

      //bat average is total runs divided by only times out
//batsman's average is calculated by total number of runs scored by him, divided by how many times he was gone out in those innings.
// Thus, it doesn't count not outs, so if the numerator goes on increasing but the denominator still remains the same,the resulting figure also goes on increasing, and vice versa.

      System.out.println("Batting Average= " + bataverage);

  }
}