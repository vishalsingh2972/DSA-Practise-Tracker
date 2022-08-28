import java.util.Arrays;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] Arr =  {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int Target = 56;
        int[] ans = search(Arr, Target); // format of return value {row index, col index}
        //System.out.print(ans);//why not this check- https://www.scaler.com/topics/print-array-in-java/

        //System.out.println(Arrays.toString(ans)); //prints the index values of the target in the array Arr in the form of an array
        //We can also print as, // System.out.println(("row value " + ans[0]+ " and" + " column value "+ ans[1])); //basically our element is present at ans[row][col] position


        System.out.println(max(Arr));
    }
//Search value in the array method
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                   return new int[] {row,col}; // here we can also write as  1) int[] output = new int[] {row,col}; or simply  int[] output = {row,col};
                                              //                                2)  return output;

                }
            }
        }

        return new int[] {-1,-1}; // similarly here also we can write as 1) int[] output2 = new int[] {-1,-1}; or simply int[] output2 = {-1, -1};
                                  //                                      2) return output2;
    }


//Max value in array method

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE; //The Integer.MIN_VALUE is a constant in the Integer class that represents the minimum or least integer value that JAVA can hold, the min value held is -2147483648
        for (int row = 0; row < arr.length; row++) //not mentioned but for max method for each loop, refer KK DSA file
        {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                     max = arr[row][col];
                }
            }
        }
        return max;
    }







}

