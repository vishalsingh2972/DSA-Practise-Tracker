//https://leetcode.com/problems/product-of-array-except-self/
//https://leetcode.com/problems/product-of-array-except-self/discuss/1599115/238.-Product-of-Array-Except-Self%3A-Java-Solution
public class M5 {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int length = nums.length;
            int[] ans = new int[length];

//first multiply all left side parts (excluding the number from where you are counting)
            int[] left_products = new int[length];
            left_products[0] = 1;

            for (int i = 1; i < length; i++) {
                left_products[i] = nums[i-1] * left_products[i-1];
            }


//second multiply all right side parts (excluding the number from where you are counting)
            int[] right_products = new int[length];
            right_products[length-1] = 1;

            for (int i = length-2; i >= 0; i--) {
                right_products[i] = nums[i+1] * right_products[i+1];
            }


//now multiply both left side parts and right side parts (excluding the number from where you are counting)
            for (int i = 0; i<length; i++)
            {

                ans[i] = left_products[i] * right_products[i];

            }

            return ans;
        }
    }

}
