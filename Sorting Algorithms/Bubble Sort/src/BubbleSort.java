import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //int[] arr = {5, 3, 4, 1, 2};
        int[] arr = {1, 2, 3, 4, 5};
        //int[] arr = {-1, 7, -38, 0, 89};
        //int[] arr = {};
        //int[] arr = {1};
        //int[] arr = {3, 1, 5, 4, 2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int[] arr) {
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if (!swapped) { //if swapped values not changing, i.e it remains false so then !false = true
                // can also be written as if(swapped == false)
                break;
            }
        }
        System.out.println("BITTU"); //break exit check karne ke liye
    }
}