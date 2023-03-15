import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//https://leetcode.com/problems/count-of-smaller-numbers-after-self/submissions/
public class H7 {
    public static void main(String[] args) {

        int[] nums = {5, 2, 6, 1};
//        int[] nums = {-1};
//        int[] nums = {-1,-1};

        System.out.println(countSmaller(nums));

    }

    public static List<Integer> countSmaller(int[] nums) {

        int n = nums.length;

        List<Integer> ans = new ArrayList<>();
        List<Integer> clone = new ArrayList<>();

        for(int i = 0; i < n ; i++){
            clone.add(nums[i]);
        }
        // for(int num: nums) clone.add(num); //or can also do this directly

        Collections.sort(clone); //Like we use Arrays.sort() for arrays, for sorting ArrayList we use Collections.sort()

        for(int i = 0; i < n; i++){
            int pos = binarySearch(clone,nums[i]);
            ans.add(pos);
            clone.remove(pos);
        }

        return ans;

    }

    public static int binarySearch(List<Integer> clone, int target){
        int start = 0;
        int end = clone.size();

        while(start < end){
            int m =  start + (end-start)/2;
            if(clone.get(m)<target){
                start = m+1;
            }
            else{
                end = m;
            }
        }

        return start;
    }

}