//https://leetcode.com/problems/matrix-diagonal-sum/
public class E15 {
    class Solution {
        public int diagonalSum(int[][] mat) {
            int sum = 0;
            int n = mat.length; //int only stores integer values and decimal part is not counted in n/2...2.5 becomes 2

            if (n % 2 == 0) // (even matrix length)
            {
                for (int i = 0; i < mat.length; i++) {

                    for (int j = 0; j < mat[0].length; j++) {

                        if (i == j) {
                            sum = sum + mat[i][j] + mat[i][n - i - 1];

                        }

                    }
                }
            } else { // i.e when n%2 !=0 (odd matrix length)

                for (int i = 0; i < mat.length; i++) {

                    for (int j = 0; j < mat[0].length; j++) {

                        if (i == j) {
                            sum = sum + mat[i][j] + mat[i][n - i - 1];
                        }
                    }

                }
                sum = sum - mat[n / 2][n / 2];
            }
            return sum;
        }
    }
}