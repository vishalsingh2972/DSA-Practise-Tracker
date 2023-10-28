import java.util.Arrays;
// https://leetcode.com/problems/first-missing-positive/
// Microsoft & Amazon Question (LC hard as we are not given 1,N here in question, but we are using cyclic sort so problem solving skills required here to get the initial intuition)
class H2 {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 0};
//          int[] arr = {3, 4, -1, 1};
//        int[] arr = {7, 8, 9, 11, 12};
        int[] arr ={7, 1, 2, 3};
//        int[] arr ={1, 2, 3, 4};
//        int[] arr = {1};
        System.out.println( firstMissingPositive(arr));
    }
    public static int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));

        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }

        // case 2
        return arr.length + 1; //when all numbers are there like in case of [1, 2, 3, 4]; then this line will reach so next missing positive number here will be 5 i.e. arr.length+1
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
