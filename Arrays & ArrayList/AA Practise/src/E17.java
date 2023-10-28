//https://leetcode.com/problems/transpose-matrix/
public class E17 {
    class Solution {
        public int[][] transpose(int[][] matrix) {

            int[][] transpose = new int[matrix[0].length][matrix.length];
            //some have only 1 row,and given atleast 1 row/column

            for (int i=0; i<matrix.length; i++){

                for(int j=0; j<matrix[i].length; j++){

                    if (i == j){
                        transpose[i][j] = matrix[i][j];
                    }
                    if(i != j){

                        transpose[j][i] = matrix[i][j];

                    }

                }

            }

            return transpose;
        }
    }
}
