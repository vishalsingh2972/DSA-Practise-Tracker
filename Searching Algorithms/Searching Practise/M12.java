//https://leetcode.com/problems/search-a-2d-matrix/
public class M12 {
    public static void main(String[] args) {

        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
//        int target = 2;
//        System.out.println(searchMatrix(arr, target));

        System.out.println(searchMatrix2(arr, target));

    }

// WITH BINARY SEARCH approach
    public static boolean searchMatrix2(int[][] matrix, int target) {
//here we kind of make the sorted 2d array as a sorted 1d array and then proceed with same approach that we did for binary search in a sorted 1d array
        int m = matrix.length;
        int n = matrix[0].length;

        int start = 0;
        int end = n*m - 1;

        while(start <= end) {

            int mid = start + (end-start)/2;

            if(matrix[mid/n][mid%n] == target){
                return true;
            }

            else if(matrix[mid/n][mid%n] < target){
                start = mid + 1;
            }

            else //matrix[mid/n][mid%n] > target case
                end = mid - 1;
        }
        return false;

    }

// WITHOUT using binary search approach
    public static boolean searchMatrix(int[][] matrix, int target) {

        int row = 0;
        int col = matrix[0].length-1;

        while(row < matrix.length && col >= 0){

            if(matrix[row][col] == target){
                return true;
            }

            else if(matrix[row][col] < target){
                row++;
            }

            else{ //matrix[row][col] > target case
                col--;
            }
        }
        return false;
        //will execute if all above conditions while loop ran but element still not found
    }

}
