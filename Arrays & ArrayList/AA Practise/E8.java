import java.util.Arrays;
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class E8 {
    public static void main(String[] args) {
        int[] nums ={1,2,3};
        int[] ans = smallerNumbersThanCurrent(nums);
         System.out.println(Arrays.toString(ans));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] ans = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            int count = 0; //everytime i for loop runs count begins from 0 value i.e for each number count begins from 0
            for(int j=0; j<nums.length; j++){

                if (i==j ){
                    continue;
                }

                if (nums[i]>nums[j]){
                    count++;
                }

            }
            ans[i]=count;
        }
        return ans;
    }
}

//Alternative small solution (compact form of smallerNumbersThanCurrent Method)

//    static int[] smallerNumbersThanCurrent(int[] nums) {

//        int[] ans = new int[nums.length];
//
//        for (int i=0; i<nums.length; i++){
//            for (int j=0; j<nums.length; j++){
//
//                if (i==j ){
//                    continue;
//                }
//
//                if (nums[i]>nums[j]){
//                    ans[i]++;
//                }
//            }
//        }
//        return ans;
//    }
//}