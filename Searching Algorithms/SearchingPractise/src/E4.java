import java.util.Arrays;
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class E4 {
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15, 17};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
//Method 1 (Best way/approach)
    public static int[] twoSum(int[] nums, int target) {
        //using ONLY two pointers (Most efficient O(N) TC here)
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            //if sum greater tha target reduce end
            if (target < nums[start] + nums[end]) {
                end--;
            }
            //if sum lesser than target increase start
            else if (target > nums[start] + nums[end]) {
                start++;
            }
//if sum becomes equal to target we have got the pair of 2 numbers that add to target
            else {       //if(target == nums[start] + nums[end]) case
                return new int[]{start + 1, end + 1};
// we are adding one because we have to return in 1 based indexing as per question
            }
        }
        return new int[]{-1, -1};
    }
}

//Method 2 //EXTRA/REDUNDANT
//    public static int[] twoSum(int[] nums, int target) {
//        //using two pointers and a small part of binary search (not very efficient)
//        int start = 0;
//        int end = nums.length-1;
//
//        while(start < end){
//
//            int mid = start + (end-start)/2;
//
//            if(target < nums[start] + nums[mid]){
//                end = mid; //binary search part
//            }
//
//            //if sum greater tha target reduce end
//            if(target < nums[start] + nums[end]){
//                end--;
//            }
//            //if sum lesser than target increase start
//            else if(target > nums[start] + nums[end]){
//                start++;
//            }
////if sum becomes equal to target we have got the pair of 2 numbers that add to target
//            else{       //if(target == nums[start] + nums[end]) case
//                return new int[]{start+1, end+1};
//// we are adding one because we have to return in 1 based indexing as per question
//            }
//        }
//        return new int[]{-1,-1};
//    }

//Method 3 //EXTRA/REDUNDANT
//    public int[] twoSum(int[] nums, int target) {
//
//        // using binary search and 2 pointers
//        //first doing binary search and then searching via 2 pointers
////first use binary search and fix end value, i.e if target < nums[start] + nums[mid] then make end = mid and now use two pointers and search target in this smaller part only
//        //but this approach fails as Time limit exceeded error as TC here is o(NlogN) so better to use ONLY 2 pointers approach (i.e Method 1) as it is giving 99% pass
//
//        int start = 0;
//        int end = binarySearch(nums, target);
//
//        while(start < end){
//            //if sum greater tha target reduce end
//            if(target < nums[start] + nums[end]){
//                end--;
//            }
//            //if sum lesser than target increase start
//            else if(target > nums[start] + nums[end]){
//                start++;
//            }
////if sum becomes equal to target we have got the pair of 2 numbers that add to target
//            else{       //if(target == nums[start] + nums[end]) case
//                return new int[]{start+1, end+1};
//// we are adding one because we have to return in 1 based indexing as per question
//            }
//        }
//        return new int[]{-1,-1};
//    }
//
//
//    public int binarySearch(int[] nums, int target){
//        int start = 0;
//        int end = nums.length-1;
//        int mid = start + (end-start)/2;
//        while(target < nums[start] + nums[mid] && start<end){
//
//            end = mid-1;
//        }
//        return end;
//    }
