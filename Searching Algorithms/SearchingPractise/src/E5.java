import java.util.Arrays;
//https://leetcode.com/problems/valid-perfect-square/
public class E5 {
    public static void main(String[] args) {

        System.out.println(isPerfectSquare(8));
        System.out.println(isPerfectSquare(9));

        System.out.println(isPerfectSquare2(14));
        System.out.println(isPerfectSquare2(16));
    }

    public static boolean isPerfectSquare(int num) {

        long start = 1; //if we put int failing for larger values so putting long which is passing for all values
        long end = num; //if we put int failing for larger values so putting long which is passing for all values

        while (start <= end) {

            long mid = start + (end - start) / 2; //if we put int failing for larger values so putting long which is passing for all values

            if (mid * mid == num) {
                return true;
            } else if (mid * mid > num) {
                end = mid - 1;
            } else { //mid*mid < num case
                start = mid + 1;
            }

        }


        return false;

    }


    //Better Approach (start searching from half values i.e end = num/2)
    public static boolean isPerfectSquare2(int num) {

        long start = 1;
        long end = num / 2; //squareroot of a number will be always lie in the range of 0 to number/2, as number/2 to number range values will always be higher than squareroot of number
 //for example squareroot of 9 which is 3 lies in the rang of 0 to 9/2, so no need to search in the range 9/2 to 9 as those values will anyways be higher than squareroot.....so instead of putting end at number we can put end at number/2 and just directly start our search in the first half and then continue further from there

        while (start <= end) {

            long mid = start + (end - start) / 2;

            if (mid * mid == num) {
                return true;
            } else if (mid * mid > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }


        return false;

    }

}