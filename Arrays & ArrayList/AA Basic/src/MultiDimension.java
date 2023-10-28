import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
             1 2 3
             4 5 6
             7 8 9
        */
        Scanner in = new Scanner(System.in);
//        int[][] arr = new int[3][];

//        int[][] arr = {
//                {1, 2, 3}, // 0th index
//                {4, 5}, // 1st index
//                {6, 7, 8, 9} // 2nd index -> arr[2] = {6, 7, 8, 9}
//        };

        int[][] arr = new int[3][2];
        //System.out.println(arr.length); // no of rows = arr.length

        // Input
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();

            }

        }

        // output
//        for (int row = 0; row < arr.length; row++) {
//             //for each col in every row
//            for (int col = 0; col < arr[row].length; col++)
//            {
//                System.out.print(arr[row][col] + " ");
//            }
//
//            System.out.println();
//        }
            // output
//            for (int row = 0; row < arr.length; row++) {
//                System.out.println(Arrays.toString(arr[row]));
//            }


        // output (for each loop /enhanced for loop)
        for(int[] a : arr) { //every single element in the array "arr", is also an array(here represented as int[].
            System.out.println(Arrays.toString(a));
        }
        }
    }




