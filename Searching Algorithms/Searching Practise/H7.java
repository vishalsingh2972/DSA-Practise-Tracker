import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/count-of-smaller-numbers-after-self/
public class H7 {
    public static void main(String[] args) {

        int[] nums = {5, 2, 6, 1};
//        int[] nums = {-1};
//        int[] nums = {-1,-1};
//        int[] nums = {26,78,27,100,33,67,90,23,66,5,38,7,35,23,52,22,83,51,98,69,81,32,78,28,94,13,2,97,3,76,99,51,9,21,84,66,65,36,100,41};

        System.out.println(countSmaller(nums));

    }

    public static List<Integer> countSmaller(int[] nums) {
        int n = nums.length;

        List<Integer> ans = new ArrayList<>(); //output arraylist
        List<Integer> clone = new ArrayList<>(); //arraylist in which we will be performing binary search on

        for(int i = 0; i < n ; i++){
            clone.add(nums[i]);
        }
        // for(int num: nums) clone.add(num); //or can also do this directly

        Collections.sort(clone); //Like we use Arrays.sort() for arrays, for sorting ArrayList we use Collections.sort()
//        System.out.println(clone);

        for(int i = 0; i < n; i++){
            int count = binarySearch(clone,nums[i]);
            ans.add(count);
            clone.remove(count);
//            System.out.println(clone);
        }

        return ans;
    }

    public static int binarySearch(List<Integer> clone, int target){
        int start = 0;
        int end = clone.size() - 1;
        int mid = 0;

        while(start <= end){

            mid =  start + (end-start)/2;

            if(clone.get(mid) < target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }

        }

        if(clone.get(start) == target) {
            return start;
        }

        return -1;
    }
    
}


