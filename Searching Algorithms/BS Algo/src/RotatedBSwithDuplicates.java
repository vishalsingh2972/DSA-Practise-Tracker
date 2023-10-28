public class RotatedBSwithDuplicates
{
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 7, -1, 0, 1, 2};
        int target = 7;
        System.out.println(search(arr, target));

    }

    public static int search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);
        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0 , nums.length - 1);
        }

        //if pivot is found, we have 2 sorted arrays on each side of pivot
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot ); //pivot also included so target = pivot condition not required
            //return binarySearch(nums, target, 0, pivot - 1 ); //pivot not included so extra target =  pivot condition is required
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    public static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
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

