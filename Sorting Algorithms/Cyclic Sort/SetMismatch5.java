import java.util.Arrays;

// https://leetcode.com/problems/set-mismatch/

class SetMismatch5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
//        int[] arr = {1, 1};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    public static int[] findErrorNums(int[] nums) {
//FIRST, we do cyclic sort

        int i = 0;
        while (i < nums.length) {
            int correctindex = nums[i] - 1; //as here given elements in range [1,N]; //leetcode main error aa raha tha isliye yaha correctindex kar diya
            //if element not present at correct index swap
            if (nums[i] != nums[correctindex]) {
                swap(nums, i, correctindex);
            } else {
                i++;
            }
        }
//SECOND, after array is sorted we will find the repeated number and the deleted number and add both these in a new array

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) { //as here when [1,N] range, indexValue = nums[i] - 1 ==> nums[i] = indexValue + 1;
                return new int[] {nums[index], index + 1};
            }
        }
        return new int[] {-1, -1};
    }

    static void swap(int[] arr, int first, int second) { //to avoid error in leetcode made it first and second
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}