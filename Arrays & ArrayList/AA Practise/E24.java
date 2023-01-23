//https://leetcode.com/problems/maximum-subarray/
public class E24 { //Kadane's Algorithm concept
    public static void main(String[] args) {

//        int[] arr1 = {5, 4, -1, 7, 8};
        int[] arr2 = {-5, -1, -2}; //all elements negative case

//        System.out.println(maxSubArray(arr1));
        System.out.println(maxSubArray(arr2));

    }

    public static int maxSubArray(int[] nums) {

        int currentSum = 0;
//        int maxSum = 0; //will not work when all array elements are negative, so discard
        int maxSum = nums[0]; //will work for ALL CASES...all negative, all positive, some negative some positive...anything will work for all
//        int maxSum = Integer.MIN_VALUE; //even this works for ALL CASES


        for(int i = 0; i < nums.length; i++){

            currentSum += nums[i];

            if(currentSum > maxSum){
                maxSum = currentSum;
            }

            if(currentSum < 0){
                currentSum = 0;
            }

        }

        return maxSum;

    }

}

//Note: Given Subarray so it has to be contiguous (https://www.scaler.com/topics/difference-between-subarray-subset-and-subsequence/)
