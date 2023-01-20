import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/lucky-numbers-in-a-matrix/
public class E23 {
    public static void main(String[] args) {
        int[][] matrix = {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
//        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[][] matrix = {{3, 25, 7}, {40, 6, 8}, {5, 75, 9}}; //unique numbers no lucky number present--->output empty arraylist []
        System.out.println(luckyNumbers(matrix));
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {  //or can also write public static Arraylist<Integer> luckyNumbers(int[][] matrix) {

        int[] minEachRow = new int[matrix.length];
        int[] maxEachColumn = new int[matrix[0].length];

        //Finding min element of each row and storing in array minEachRow
        for (int i = 0; i < matrix.length; i++) {
            int minElement = matrix[i][0];
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < minElement) {
                    minElement = matrix[i][j];
                }
            }
            minEachRow[i] = minElement;
        }

        //Finding max element of each column and storing in array maxEachColumn
        for (int i = 0; i < matrix[0].length; i++) {
            int maxElement = matrix[0][i];
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] > maxElement) {
                    maxElement = matrix[j][i];
                }
            }
            maxEachColumn[i] = maxElement;
        }


        //Initializing an ArrayList for storing the common element in minEachRow and maxEachColumn
        ArrayList<Integer> ans = new ArrayList<>(); //or can also write List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < minEachRow.length; i++) {
            for (int j = 0; j < maxEachColumn.length; j++) {
                if (minEachRow[i] == maxEachColumn[j]) {
                    ans.add(minEachRow[i]); // or can also write ans.add(maxEachColumn[j]);
                }
            }
        }

        return ans;

    }
}