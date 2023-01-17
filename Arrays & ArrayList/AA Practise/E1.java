import java.util.Arrays;
//https://leetcode.com/problems/build-array-from-permutation/
public class E1 {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }

    public static int[] buildArray(int[] nums) {
//calculating a + nb
        int n = nums.length;
        for(int i = 0; i<nums.length; i++){
            nums[i] = nums[i] + n*(nums[nums[i]]%n); //https://leetcode.com/problems/build-array-from-permutation/discuss/1419134/O(1)-space-complexity-approach-with-Full-Explaination.
        }
        System.out.println(Arrays.toString(nums));

//calculate b = nums[nums[i]] = nums[i]/n
        for(int i = 0; i<nums.length; i++){
            nums[i] = nums[i]/n; //will give new array element values
//            nums[i] = nums[i] % n ; //will give old array element values
        }

        return nums;
    }

}

