// Ceiling : smallest element in the array greater than or equal to target
public class Ceiling {
    public static void main(String[] args) {
    int[] arr = {2, 3, 5, 9, 14, 16, 18};
    //int[] arr = {18, 16, 14, 9, 5, 3, 2};
    int target = 15;
    int ans = ceiling(arr, target);
    System.out.println(ans);
}

        // return the index of smallest number >= target
        static int ceiling(int[] arr, int target) {

            // but what if the target is greater than the greatest number in the array (i.e at index arr.length - 1)
            if (target > arr[arr.length - 1]) {
                return -1;
            }
            int start = 0;
            int end = arr.length - 1;

            while(start <= end) {
                // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
                int mid = start + (end - start) / 2; //so we use like this instead

                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    // target found
                    return mid;
                }
            }
            return start; //here at last start = 5 > end =4; //i.e here the next big number when no answer was found will be start index element

 //also for Ceiling, in case of ascending sorted we are returning start but for Ceiling, in case of descending sorted we will return end (try it out line 5)
            //return end; //in case element not present in array and the given array is descending sorted
    }

}