// https://leetcode.com/problems/find-the-duplicate-number/
// Amazon & Microsoft Question
 class FindDuplicate3 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
//        int[] arr = {3, 1, 3, 4, 2};
//        int[] arr = {1, 3, 4, 2}; //no duplicates present case will return -1
        System.out.println(SingleDuplicateNumber(arr));
    }

    public static int SingleDuplicateNumber(int[] nums) {
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
//now after array is sorted,so all numbers will go to their correct index positions [where correctIndex = value - 1], except the repeated number
//SECOND, now we will check correctIndex = value - 1 for each position one by one, and for the repeated element this value will be false,so we will return that number
        for(int index = 0; index < nums.length; index++){
            if (nums[index] != index + 1){ //as here when [1,N] range, indexValue = nums[i] - 1 ==> nums[i] = indexValue + 1;
                return nums[index];
            }
        }
        return -1;
    }

    static void swap(int[] arr, int i, int correctIndex){
        int temp =  arr[i];
        arr[i] =  arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
