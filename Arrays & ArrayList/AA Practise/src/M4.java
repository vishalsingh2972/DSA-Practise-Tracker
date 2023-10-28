import java.util.Arrays;
//https://leetcode.com/problems/set-matrix-zeroes/
//Note: In LC put J loop (line 20) and I loop (line 28) also inside line 36 for loop
public class M4 {

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 2, 0},
                {3, 4, 0, 2},
                {1, 3, 1, 5},
                {8, 7, 6, 9}
        };
        System.out.println(Arrays.deepToString(setZeroes(matrix)));
    }

    public static int[][] setZeroes(int[][] matrix) {
        int firstRow = 1, firstCol = 1; //initially assume

        //first row (check if first row has any zero)
        for (int J = 0; J < matrix[0].length; J++) {
            if (matrix[0][J] == 0) {
                firstRow = 0;
            }
        }


        //first column (check if first column has any zero)
        for (int I = 0; I < matrix.length; I++) {
            if (matrix[I][0] == 0) {
                firstCol = 0;
            }
        }


        //Set markers in first row and first column
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {

                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        // Replace inner matrix
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {

                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }


        // Last remaning check (handling first row and first column)

        //first row (if firstRow = 0, then change all first row elements to 0)
        if (firstRow == 0) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }

        //first column (if firstCol = 0, then change all first column elements to 0)
        if (firstCol == 0) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
        return matrix;
    }
}