public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {-18-5,-4,0,2,5,6,9,54,96,101}; //sorted ascending array considered
        int target = -23;
        //int target = 54;
        System.out.println(BinarySearch(arr, target));

        System.out.println("Element found at index " + BinarySearch(arr, target));

    }
// return the index if element found
    //return -1 if element does not exist
    static  int BinarySearch(int[] ARR, int TARGET){
        int start = 0;
        int end = ARR.length - 1;

        while( start <= end){
//find the middle element
           // int MID = (start + end)/2; // might be possible that (start + end) exceeds the range of int in java
            int MID = start + (end-start)/2;  //so we write it in a different manner

            if (TARGET < ARR[MID]) {
                //search on left side
                end = MID - 1;
            }
            else if (TARGET > ARR[MID]) {
                //search on right side
                start = MID + 1;
            }
           else { //i.e when TARGET == MID;
                //TARGET found
                return MID;
            }


            }

//outside of while, if it doesn't find the element iw will return -1
        return -1;

        }


    }

