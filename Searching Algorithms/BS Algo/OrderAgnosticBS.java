public class OrderAgnosticBS //when we don't know beforehand whether array is in ascending or descending order
{
    public static void main(String[] args) {
       //int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89}; //ascending
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3}; //descending
        int target = 22;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end]; //will return true if array is sorted in ascending order (end > start)

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
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