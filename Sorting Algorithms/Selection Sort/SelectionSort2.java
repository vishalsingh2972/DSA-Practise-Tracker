import java.util.Arrays; //Method2
//Here I am selecting the minimum element and putting it at the start/beginning index position and so on (sorting done from left to right)
public class SelectionSort2 {
    public static void main(String[] args) {
        int[] ARR = {5, 3, 4, 1, 2};
        System.out.println(Arrays.toString(ARR));
        selection(ARR);
        System.out.println(Arrays.toString(ARR));
    }
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the min item in the remaining array and swap with correct index
            int start = i;
            int minIndex = getMinIndex(arr, arr.length-1, start);
            swap(arr, start, minIndex);
        }
    }
//Swapping number present at first index position with the minimum number, basically sending minimum number to first index position
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
//Finding index position where minimum element is present
    static int getMinIndex(int[] arr, int last, int start) {
        int min = last; //min here is the index value/position of the minimum number
        for (int i = last; i >= start; i--) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        return min;
    }
}


//ANOTHER WAY (without using swap as a separate function)

//public class SelectionSort2 {
//    public static void main(String[] args) {
//        int[] ARR = {5, 3, 4, 1, 2};
//        System.out.println(Arrays.toString(ARR));
//        selection(ARR);
//        System.out.println(Arrays.toString(ARR));
//    }
//
//    static void selection(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            // find the min item in the remaining array and swap with correct index
//            int start = i;
//            int minIndex = getMinIndex(arr, arr.length-1, start);
//
//            int temp = arr[minIndex];
//            arr[minIndex] = arr[start];
//            arr[start] = temp;
//        }
//    }
//
////Finding index position where minimum element is present
//    static int getMinIndex(int[] arr, int last, int start) {
//        int min = last; //min here is the index value/position of the minimum number
//        for (int i = last; i >= start; i--) {
//            if (arr[min] > arr[i]) {
//                min = i;
//            }
//        }
//        return min;
//    }
//}
