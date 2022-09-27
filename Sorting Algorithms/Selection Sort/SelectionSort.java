import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] ARR = {5, 3, 4, 1, 2};
        System.out.println(Arrays.toString(ARR));
        selection(ARR);
        System.out.println(Arrays.toString(ARR)); //array is non-primitive, so changes made via ref. variable arr will also be visible in original ARR ( or basically changes made in arr will also cause changes in original ARR)
    }
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
//Swapping number present at last index position with the maximum number, basically sending maximum number to last index position
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
//Finding index position where maximum element is present
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start; //max here is the index value/position of the maximum number
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}


//ANOTHER WAY (without using swap as a separate function)

//public class SelectionSort {
//    public static void main(String[] args) {
//        int[] ARR = {5, 3, 4, 1, 2};
//        System.out.println(Arrays.toString(ARR));
//        selection(ARR);
//        System.out.println(Arrays.toString(ARR));
//    }
//
//    static void selection(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            // find the max item in the remaining array and swap with correct index
//            int last = arr.length - i - 1;
//            int maxIndex = getMaxIndex(arr, 0, last);
//
//            int temp = arr[maxIndex];
//            arr[maxIndex] = arr[last];
//            arr[last] = temp;
//        }
//    }
//
////Finding index position where maximum element is present
//    static int getMaxIndex(int[] arr, int start, int end) {
//        int max = start; //max here is the index value/position of the maximum number
//        for (int i = start; i <= end; i++) {
//            if (arr[max] < arr[i]) {
//                max = i;
//            }
//        }
//        return max;
//    }
//}
