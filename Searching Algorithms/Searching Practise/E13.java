import java.util.ArrayList;
import java.util.Arrays;
//https://leetcode.com/problems/intersection-of-two-arrays-ii/
public class E13 {
    public static void main(String[] args) {

//        int[] nums1 = {1,2,2,1};
//        int[] nums2 = {2,2};

        int[] nums1 = {3,1,2}; //arr[mid] = -1 step example debug
        int[] nums2 = {1,1};

//        int[] nums1 = {4,9,5};
//        int[] nums2 = {9,4,9,8,4};

//        int[] nums1 = {1,1,2,3}; //arr[mid] = -1 step example debug
//        int[] nums2 = {2,2};


        System.out.println(Arrays.toString(intersection(nums1,nums2)));

    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        int[] smaller = nums1.length <= nums2.length ? nums1 : nums2;
        int[] larger = nums1.length > nums2.length ? nums1 : nums2;

        Arrays.sort(larger); //just sorting larger would suffice as we are doing binary search only on the larger array

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<smaller.length; i++) {

            if (binarySearch(larger, smaller[i])) {
                list.add(smaller[i]);
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

            Arrays.sort(arr);

            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                arr[mid] = -1; //changing particular larger array value where we have already found one element so that we don't consider that value again in the next iteration
                               //for example larger = {1,2,3} and smaller = {1,1}, when we do BS in larger using smaller[0], we have found 1 in larger at index 0 of larger , so we need not consider this particular element in the next iteration as we have already found it so in the larger array where we are doing BS we make the found element as -1, so when we do next iteration i.e when we do BS in larger using smaller[1] we will search for only unique values and neglect those which we have already got (we have indirectly neglected those as we have changed their values to -1 so in the iteration they will indirectly not be considered)
                               //in larger = {1,2,3} and smaller = {1,1} if we don't put this step i.e arr[mid] = -1, then we will get repeated values....i.e we will get output [1,1] which is wrong as we need output [1], hence we are putting arr[mid] = -1 here
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

