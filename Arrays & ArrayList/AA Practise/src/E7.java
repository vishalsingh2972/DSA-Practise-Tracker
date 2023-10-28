//https://leetcode.com/problems/number-of-good-pairs/
public class E7 {
    class Solution {
        public int numIdenticalPairs(int[] nums) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    //putting j = i+1 is more efficient than putting j=0, as we are removing redundant steps
                    if (nums[i] == nums[j]) {
                        if (i < j) {
                            count++;
                        }

                    }

                }

            }

            return count;

        }
    }
}