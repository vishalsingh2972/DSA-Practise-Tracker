//https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
public class E16 {
    public static void main(String[] args) {

//        int[] nums = {3,5};
//        int[] nums ={5};

//        int[] nums ={0,1,2,0,1};
        int[] nums ={0,0,2,0,2};

        System.out.println(specialArray(nums));

    }

    public static int specialArray(int[] nums) {

        int max = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }

        int start = 0;
        int end = max; //when we put end = max instead of putting end = nums.length the size of binarySearch Array reduces
                       //for example for {0,0,2,0,2}, if we put end = nums.length, the search size would we array of size 0 to 5 (6 elements ,in these elements some elements will be redundant like in this case elements 3, 4, 5 will give count 0 so waste of taking them instead better to eliminate them beforehand i.e. before even starting binary search), so instead if we use end = max, the search size will be 0 to 2 (3 elements only) //so we are also reducing the number of comparisons even before starting binary search from log6 to log3 in this case as we are reducing array size from 6 elements to 3 elements before even starting binary search

        while(start <= end) {

            int mid = start + (end-start)/2;
            int count = 0;

            for(int i = 0; i<nums.length; i++){
                if(mid <= nums[i]){
                    count++;
                }
            }

            if(count < mid){
                end = mid - 1;
            }

            else if (count > mid){
                start = mid + 1;
            }

            else{ //when count == mid
                return mid; //or return count;
            }

        }

        return -1; //not found case, when we reach no numbers fit the criteria level

    }

}
