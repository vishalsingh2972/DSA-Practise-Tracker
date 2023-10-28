
//https://leetcode.com/problems/find-in-mountain-array/
public class SearchInMountain {
    public static void main(String[] args) {

        int[] arr ={1,3,5,6,9,15,3,1,0};
        int target = 3;
        System.out.println(search(arr, target));
    }
// //

    public static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr); //first return the peak value
        int firstTry = orderAgnosticBS(arr, target, 0, peak); //after peak value is returned start searching in the ascending order part

        if (firstTry != -1) {
            return firstTry;
        }
        // ascending part returned -1 so element not present in first half so now try to search in second half
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    //Another way to write above if statement (present from line 16 to line 21)
//    if (firstTry == -1) {
    // ascending part returned -1 so element not present in first half so now try to search in second half
//            return orderAgnosticBS(arr, target, peak+1, arr.length - 1);
//        }
//        else{
    // i.e if firstTry does not return -1, i.e when element found in firstTry (or the ascending part), then return the index value of the number
//            return firstTry;
//        }
//    }


// //
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            }
            else //or can be written as if (arr[mid] < arr[mid+1])
            {

                start = mid + 1;
            }
        }
        return start; //can also write return end; //as in the end both start and end will be pointing to same value/element
    }

// //

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end]; //will return true if array is sorted in ascending order (end > start)

        while(start <= end) {
            // find the middle element
            //int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) //common if for both descending and ascending
            {
                return mid;
            }

            if (isAsc) //ascending logic
            {
                if (target < arr[mid]) //search on left side
                {
                    end = mid - 1;
                } else  //i.e target > mid, hence search on right side
                {
                    start = mid + 1;
                }
            }
            else // descending logic (if isAsc is false it will follow this)
            {
                if (target > arr[mid]) //search on left side
                {
                    end = mid - 1;
                } else //i.e target < mid, hence search on right side
                {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}


