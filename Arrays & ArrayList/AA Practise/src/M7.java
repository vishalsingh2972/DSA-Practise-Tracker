//https://leetcode.com/problems/jump-game/
//https://youtu.be/VkwFhvfa36Q
public class M7 {
    public static void main(String[] args) {

//        int[] nums = {}; //redundant as given nums.length>=1
//        int[] nums = {2};
//        int[] nums = {0};

//        int[] nums = {2,3};
//        int[] nums = {0,3};
//        int[] nums = {2,3,1,1,4};
//        int[] nums = {3,2,1,0,4};
        int[] nums = {2, 5, 1, 0, 2, 0, 0};

        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {

        int lastKnownPosition = nums.length-1;

        for(int i = nums.length-2; i>=0; i--){
            if(i + nums[i] >= lastKnownPosition){
                lastKnownPosition = i;
            }
        }
        return lastKnownPosition == 0;
        //if it has reached starting 0 index return true otherwise false
        //this condition also directly works when nums.length = 1 => lastKnownPosition = 0;
    }

}
