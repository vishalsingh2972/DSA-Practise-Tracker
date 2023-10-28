//https://leetcode.com/problems/shuffle-the-array/
public class E5 {
    class Solution {
        public int[] shuffle(int[] nums, int n) {

            //creating new array ans
            int[] ans = new int[2 * n];

            //filling new array ans
            for (int i = 0; i < n; i++) {
                //filling even positions in array ans
                ans[2 * i] = nums[i];

                //filling odd positions in array ans
                ans[2 * i + 1] = nums[i + n];
            }

            return ans;
        }
    }
}