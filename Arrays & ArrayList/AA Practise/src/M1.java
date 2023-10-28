import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/spiral-matrix/
public class M1 {
    public static void main(String[] args) {

//        int[][] arr ={{1,2,3}, {4,5,6}, {7,8,9}};
//        int[][] arr = {{2,3}};
//        int[][] arr ={{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        int[][] arr ={{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        System.out.println(spiralOrder(arr));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> nums = new ArrayList<>();

        if(matrix == null || matrix.length == 0){
            return nums;
        }

        int top = 0; //top row
        int bottom = matrix.length-1; //bottom row

        int left = 0; //top column
        int right = matrix[0].length-1; //bottom column

        int size = matrix.length * matrix[0].length; //no repeating numbers exact same matrix numbers
        System.out.println(size);

        while(nums.size() < size){

//            System.out.println(right);
            for(int i = left ; i<=right; i++){ //no need to put && nums.size() < size as it will already check that in while and enter this for loop
                                               //"&& nums.size() < size" is redundant here as already being checked in while so no need to put i<=right  && nums.size() < size, just putting i<=right is enough
                nums.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i<=bottom && nums.size() < size; i++){
                nums.add(matrix[i][right]);
            }
            right--;

            for(int i = right; i>=left && nums.size() < size; i--){
                nums.add(matrix[bottom][i]);
            }
            bottom--;

            for(int i = bottom; i>=top && nums.size() < size; i--){
                nums.add(matrix[i][left]);
            }
            left++;

        }

        return nums;

    }

}
