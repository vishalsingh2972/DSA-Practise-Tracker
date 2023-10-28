import java.util.Arrays;

public class InsertionSort {

        public static void main(String[] args) {
            int[] arr = {5, 3, 4, 1, 2};
            //int[] arr = {};
            //int[] arr = {0, -23, 4, 1, 2};
            insertion(arr);
            System.out.println(Arrays.toString(arr));
        }

        static void insertion(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i+1; j > 0; j--) {
                    if (arr[j] < arr[j-1]) {
                        swap(arr, j, j-1);
                    } else {
                        break;//will exit j loop (no need to check back values as they are already sorted wala concept) and now go to i and start from next i value
                    }
                }
            }
        }

        static void swap(int[] arr, int first, int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }

    }