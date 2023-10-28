import java.util.Arrays;
//https://leetcode.com/problems/product-of-array-except-self/
//https://leetcode.com/problems/product-of-array-except-self/discuss/1599115/238.-Product-of-Array-Except-Self%3A-Java-Solution
public class M5 {

    public static void main(String[] args) {

        int[] arr = {4,5,1,8,2};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
        System.out.println(Arrays.toString(productExceptSelf2(arr)));

    }

//    LONG WAY
        public static int[] productExceptSelf(int[] nums) {
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

//    OPTIMIZED WAY
    public static int[] productExceptSelf2(int[] nums) {
        int[] output = new int[nums.length];
        for (int i = 0, left = 1; i < nums.length; i++) {
            output[i] = left;
            left *= nums[i];
        }
        for (int i = nums.length - 1, right = 1; i >= 0; i--) {
            output[i] *= right;
            right *= nums[i];
//            System.out.println(right);
        }
        return output;
    }

    }





