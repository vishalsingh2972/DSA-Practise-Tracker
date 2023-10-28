//https://leetcode.com/problems/search-insert-position/
public class E9 {
    public int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;

        while(start <= end){

            int mid = start + (end-start)/2;

            if(target > nums[mid]){
                start = mid + 1;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else {
                return mid;
            }

        }
        return start;
// Ceiling concept we used : smallest element in the array greater than or equal to target
    }
}
