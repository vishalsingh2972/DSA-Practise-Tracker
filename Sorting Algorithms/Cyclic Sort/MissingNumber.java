
// https://leetcode.com/problems/missing-number/
// Amazon Question
class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }

        // case 2
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}


//SIMPLE LOGIC (without using sorting and all)

//public class MissingNumber {
//    public static void main(String[] args) {
//        int[] ARR = {0 , 1 , 3};
//        int ans = missingNumber(ARR);
//        System.out.println(ans);
//    }
//
//    public static int missingNumber(int[] nums) {
//
//        int n = nums.length;
//       //Sum of all N numbers
//        int allsum = n * (n + 1)/2;
//
//        //Now subtract all numbers from the sum the remaining value is the missing number
//        for (int i = 0; i < n ; i++) {
//            allsum = allsum - nums[i];
//
//        }
//
//        return allsum;
//    }
//
//}

