import java.util.ArrayList;
import java.util.Arrays;
//https://leetcode.com/problems/intersection-of-two-arrays/
public class E12 {
    public static void main(String[] args) {

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

//        int[] nums1 = {4,9,5};
//        int[] nums2 = {9,4,9,8,4};

        System.out.println(Arrays.toString(intersection(nums1,nums2)));

    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] smaller = nums1.length <= nums2.length ? nums1 : nums2;
        int[] larger = nums1.length > nums2.length ? nums1 : nums2;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<smaller.length; i++) {

            if (binarySearch(larger, smaller[i])) { //smaller log(larger) < larger log(smaller).....for eg 3log7 < 7log3, so for more optimised do binary search on larger array
                if (!list.contains(smaller[i])) { //as per question we want all unique numbers in the resultant arrayList, so no duplicate values allowed
                    list.add(smaller[i]);
                }
            }
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;

    }

    public static boolean binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        while(start <= end){

            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return true;
            }

            else if (arr[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }

        }

        return false;

    }
}
