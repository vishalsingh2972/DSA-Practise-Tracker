import java.util.Arrays;
//https://leetcode.com/problems/rotate-array/
public class M8 {
    public static void main(String[] args) {

//        int[] nums = {1,2,3,4,5,6,7};
//        int k = 3; //k < nums.length case

//        int[] nums = {-1,-100,3,99};
//        int k = 2; //k < nums.length case

        int[] nums = {-1};
        int k = 2; //k > nums.length case

//        int[] nums = {1,2,3};
//        int k = 3; //k = nums.length case

       System.out.println(Arrays.toString(nums)); //before rotation
       rotate(nums,k);
       System.out.println(Arrays.toString(nums)); //after rotation
    }

    public static void rotate(int[] nums, int k) {

        k %= nums.length; //check note
                          // k%nums.length works for all cases (k>nums.length or k=nums.length or k<nums.length)

        reverse(nums, 0, nums.length-1);  // reverse the whole array
        reverse(nums, 0, k-1);  // reverse the first part
        reverse(nums, k, nums.length-1);  // reverse the second part
    }

    public static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left++;
            right--;
        }
    }

}


 /*

 NOTE:
for example ,if we are given with the value of array size i.e (n) as7 and value of k is 8 that means we need to rotate 8 times so in that case we simply do k=k%n ,k=8%7=1;
that means only one rotation will take place as size number of rotation is greater than size if they were equal no need of rotation bcz it apparently will give the same array
ind 0 1 2 3 4 5 6
arr[]=1 2 3 4 5 6 7 n=7 ,k=7
1st r= 7 1 2 3 4 5 6
2nd r= 6 7 1 2 3 4 5
3rd r= 5 6 7 1 2 3 4
4th r= 4 5 6 7 1 2 3
5th r= 3 4 5 6 7 1 2
6th r= 2 3 4 5 6 7 1
7th r= 1 2 3 4 5 6 7 (same array will come)
8th r = 7 1 2 3 4 5 6 (this will same as 1st rotation therefore,we do 8%7=1 i.e 1 rotation is required)

Basically in case where k > nums.length....no need to do rotation multiple times as just doing rotation k%nums.length will give the same order of elements that we get after doing all k rotations
(for example try for nums.length = 3 and k = 7 and see you will get same order after 7%3 = 1 rotation that we get after 7 rotations, so no need to do all 7 rotations just doing k%nums.length would suffice also k%n solves the arrayindex out of bound error that we get when k > nums.length

So in case when k>nums.length we have to use k = k%nums.length
but in cases where k<nums.length here also we can use or ignore and just use k as in case where k<nums.length k%n will give a value of k only...so why not directly use k instead duh! But if we only put k other test cases will fail where k>nums.length so its better to put k%nums.length which passes all test cases both when k>nums.length and also when k<nums.length

*/