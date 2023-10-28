
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
import java.util.Arrays;
public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {};
        int target = 6;

//        int[] arr = {5,7,7,7,9,10};
//        int target = 6;

//        int[] arr = {5,7,7,7,9,10};
//        int target = 7;

//        int[] arr = {5,7,7,8,9,10};
//        int target = 8;
        System.out.println(Arrays.toString(searchRange(arr, target)));

    }

    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        // check for first occurrence of target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        //below else statement is extra, written for understanding better (ye else nahi likhe to bhi chalta)
//        else //i.e when ans[0] == -1
//        {
//            ans[1] = -1;
//        }
        return ans;
    }

    // this function just returns the index value of target
    public static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex == true) //searching on left side of mid
                {
                    end = mid - 1;
                } else // i.e findStartIndex == false, searching on right side of mid
                {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}