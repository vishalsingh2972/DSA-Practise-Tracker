//https://leetcode.com/problems/split-array-largest-sum/
public class SplitArrayLargestSum {
    public static void main(String[] args) {

        int[] nums1 = {7,2,5,10,8};
        int k1 = 2; //number of splits i.e here we are required to split nums1 into 2 parts

        int[] nums2 = {1,2,3,4,5};
        int k2 = 2;

        System.out.println(splitArray(nums1,k1));
        System.out.println(splitArray(nums2,k2));

    }

    public static int splitArray(int[] nums, int m) {
            int start = 0;
            int end = 0;

            for (int i = 0; i < nums.length; i++) {
                start = Math.max(start, nums[i]); // in the end of the loop this will contain the max item of the array
                end += nums[i];
            }

            // binary search
            while (start < end) {
                // try for the middle as potential ans
                int mid = start + (end - start) / 2;

                // calculate how many pieces you can divide this in with this max sum
                int sum = 0;
                int pieces = 1;
                for (int num : nums) {
                    if (sum + num > mid) {
                        // you cannot add this in this subarray, make new one
                        // say you add this num in new subarray, then sum = num
                        sum = num;
                        pieces++;
                    } else {
                        sum += num;
                    }
                }

                if (pieces > m) {
                    start = mid + 1;
                } else {
                    end = mid;
                }

            }
            return end; // here start == end
        }

}