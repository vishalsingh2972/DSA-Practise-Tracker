//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        //int target = 165; ArrayOutOfBoundException tackled in line 26 :)
        //int target = -10;
        System.out.println("Element present at Index : " + ans(arr, target));
    }

    static  int ans(int[] arr, int target){
         // first find the range in which number will lie
        //firstly we will start will a box of size 2 i.e
        int start = 0;
        int end = 1;

        //condition for the target to lie in the range
        while (target > arr[end]){
            //int temp = end + 1;
            int oldend = end;
            //box value is doubled
            // end = previous end + (size of box)*2
            end = end +(end - start + 1 )*2; //calculating newend
            start = oldend + 1;

// For tackling ArrayOutOfBoundException //
            if(end < arr.length-1){
                end = end;
            }else{
                end = arr.length-1;}
//                                     //
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] ARR, int TARGET, int start, int end) {
// after we have found the range now, in that range we apply BS and search the element

        while (start <= end) {
//find the middle element
            // int MID = (start + end)/2; // might be possible that (start + end) exceeds the range of int in java
            int MID = start + (end - start) / 2;  //so we write it in a different manner

            if (TARGET < ARR[MID]) {
                //search on left side
                end = MID - 1;
            } else if (TARGET > ARR[MID]) {
                //search on right side
                start = MID + 1;
            } else { //i.e when TARGET == ARR[MID];
                //TARGET found
                return MID;
            }

        }

//outside of while, if it doesn't find the element iw will return -1
        return -1;
    }
}

