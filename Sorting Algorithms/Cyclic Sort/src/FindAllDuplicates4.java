import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/

class FindAllDuplicates4 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
//        int[] arr = {1, 1, 2};
//        int[] arr = {1}; OR int[] arr = {1, 2};  //isme koi bhi duplicate value/number nahi hai to kuch bhi add nahi hoga "ans" arraylist main, jo hum arraylist diye hai wahi khali wala arraylist dedega java output main
        System.out.println(findDuplicateNumbers(arr));
    }
    public static List<Integer> findDuplicateNumbers(int[] nums) {
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
//SECOND, now after sorting is done we will find the extra values/numbers in the sorted arrayList and put those extra values in a new arrayList and return that arrayList
        List<Integer> ans = new ArrayList<>(); //is wale arraylist main extra values store honge

        for(int index = 0; index < nums.length; index++){
            if (nums[index] != index + 1){ //as here when [1,N] range, indexValue = nums[i] - 1 ==> nums[i] = indexValue + 1;
                ans.add(nums[index]);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

