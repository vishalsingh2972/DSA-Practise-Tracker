import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Google Question
class FindAllMissing2 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
//        int[] arr = {1, 1};
        System.out.println(findDisappearedNumbers(arr));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
//FIRST, we do cyclic sort

            int i = 0;
            while (i < nums.length) {
                int correctIndex = nums[i] - 1; //as here given elements in range [1,N];
                //if element not present at correct index swap
                if (nums[i] != nums[correctIndex]) {
                    swap(nums, i, correctIndex);
                } else {
                    i++;
                }
            }
//SECOND, now after sorting is done we will find the missing values/numbers in the sorted arrayList and put those missing values in a new arrayList and return that arrayList
        List<Integer> ans = new ArrayList<>(); //is wale arraylist main missing values store honge

        for(int index = 0; index < nums.length; index++){
            if (nums[index] != index + 1){ //as here when [1,N] range, indexValue = nums[i] - 1 ==> nums[i] = indexValue + 1;
                ans.add(index + 1);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int i, int correctIndex){
        int temp =  arr[i];
        arr[i] =  arr[correctIndex];
        arr[correctIndex] = temp;
    }
}

