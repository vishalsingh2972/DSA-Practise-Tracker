//https://leetcode.com/problems/spiral-matrix-ii/
public class M2 {
    public static void main(String[] args) {
        int n = 3;
//        int n = 4;
        System.out.println(generateMatrix(n));
    }

    public static int[][] generateMatrix(int n) {

        int[][] ans = new int[n][n];
        int size = n * n;

        int top = 0; //top row
        int bottom = n-1; //bottom row

        int left = 0; //top column
        int right = n-1; //bottom column
        int count = 1;

        while(count <= size){

//            if(n == 0){ //redundant //not required as constraint 1<= n <= 20 given already
//                return ans;
//            }

//            if(n < 0){ //redundant //not required as constraint 1<= n <= 20 given already
////                throw new IllegalArgumentException("Invalid input");
//                System.out.println("Invalid input");
//            }

            for(int i = left; i<=right ; i++){ //topleft to right
                ans[top][i] = count;
                count++;
            }
            top++;

            for(int i = top; i<=bottom  && count <= size; i++){ //topright to bottom
                ans[i][right] = count;
                count++;
            }
            right--;

            for(int i = right; i>=left && count <= size; i--){ //bottomright to left
                ans[bottom][i] = count;
                count++;
            }
            bottom--;

            for(int i = bottom; i>=top && count <= size; i--){ //bottomleft to top
                ans[i][left] = count;
                count++;
            }
            left++;

        }

        return ans;

    }

}
