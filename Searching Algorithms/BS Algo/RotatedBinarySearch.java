
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};

    }

    
        public static int search(int[] nums, int target) {
            int pivot = findPivot(nums);
            // if you did not find a pivot, it means the array is not rotated
            if (pivot == -1) {
                // just do normal binary search
                return binarySearch(nums, target, 0 , nums.length - 1);
            }

            //if pivot is found, we have 2 sorted arrays on each side of pivot
            // if (nums[pivot] == target) {
            //     return pivot;
            // }

            if (target >= nums[0]) {
                return binarySearch(nums, target, 0, pivot ); //pivot also included so target = pivot condition not required
                //return binarySearch(nums, target, 0, pivot - 1 ); //pivot not included so extra target =  pivot condition is required
            }

            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }

    
        public static int findPivot(int[] arr) {
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                // 4 cases over here
                if ( mid < end && arr[mid] > arr[mid + 1]) {
                    return mid;
                }
                if (mid > start && arr[mid] < arr[mid - 1]) {
                    return mid-1;
                }
                if (arr[mid] <= arr[start]) {
                    end = mid - 1;
                }
                if (arr[mid] > arr[start]){
                    start = mid + 1;
                }
            }

            return -1;

        }


        public static int binarySearch(int[] ARR, int TARGET, int start, int end){
            while( start <= end){
                
                int MID = start + (end-start)/2;
                if (TARGET < ARR[MID]) {

                    end = MID - 1;
                }
                else if (TARGET > ARR[MID]) {

                    start = MID + 1;
                }
                else {
                    return MID;
                }

            }

            return -1;

        }

    }

