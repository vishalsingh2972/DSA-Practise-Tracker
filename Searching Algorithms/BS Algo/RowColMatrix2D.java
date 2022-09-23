import java.util.Arrays;
//Matrix is sorted in a row wise and column wise manner (without using Binary Search)
public class RowColMatrix2D {
    public static void main(String[] args) {

        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int target = 37;
        System.out.println(Arrays.toString(search(arr, target)));
        //System.out.println(Arrays.toString(search(arr, 37))); //Direct Attack
    }

    public static int[] search(int[][] matrix, int target) {
        //int[] ans = {-1,-1};
        int row = 0;
        int col = matrix.length - 1; //for n x n matrix i .e here int col = n - 1 ;
        //for n x m matrix int col = last column index i.e here m - 1 ;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }
            if (matrix[row][col] < target) {
                row++;
            } else //i.e when if(matrix[row][col] > target)
            {
                col--;
            }

        }

        return new int[]{-1, -1};
        //return ans;

    }
}


