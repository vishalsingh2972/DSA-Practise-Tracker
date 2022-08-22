import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18, 56}; //two pointer method (pointers: start and end)
//        swap(arr, 0, 4);
        reverse(arr); //works for both array having odd number of elements as well as for array having even number of elements
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            // swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}