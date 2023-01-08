import java.util.Arrays;
//https://leetcode.com/problems/sort-colors/
public class M9 {
    public static void main(String[] args) {
//        int[] arr = {1,2,0};
        int[] arr = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(sortColors(arr)));
    }
        public static int[] sortColors(int[] nums) {
            int zeroIndex = 0;
            int i = 0;
            int twoIndex = nums.length - 1;

            while(i <= twoIndex){
                if(nums[i] == 0){
                    swap(nums, zeroIndex, i);
                    i++;
                    zeroIndex++;
                }
                else if(nums[i] == 1){
                    i++;
                }
                else{ //when nums[i] == 2 case
                    swap(nums, i, twoIndex);
                    twoIndex--;
                }
            }
             return nums;
        }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}






















