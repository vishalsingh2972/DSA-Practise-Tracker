
// https://leetcode.com/problems/find-the-duplicate-number/
// Amazon & Microsoft Question

// class FindDuplicate3 {
//    public static void main(String[] args) {
//        int[] arr = {1, 3, 4, 2, 2};
//        //int[] arr = {3, 1, 3, 4, 2};
//        //int[] arr = {1, 3, 4, 2}; //no duplicates present case will return -1
//        System.out.println(singleDuplicateNumber(arr));
//    }
//
//    public static int singleDuplicateNumber(int[] nums) {
////FIRST, we do cyclic sort
//        int i = 0;
//        while (i < nums.length) {
//            int correctIndex = nums[i] - 1; //as here given elements in range [1,N];
//            //if element not present at correct index swap
//            if (nums[i] != nums[correctIndex]) {
//                swap(nums, i, correctIndex);
//            } else {
//                i++;
//            }
//        }
////now after array is sorted,so all numbers will go to their correct index positions [where correctIndex = value - 1], except the repeated number
////SECOND, now we will check correctIndex = value - 1 for each position one by one, and for the repeated element this value will be false,so we will return that number
//        for(int index = 0; index < nums.length; index++){
//            if (nums[index] != index + 1){ //as here when [1,N] range, indexValue = nums[i] - 1 ==> nums[i] = indexValue + 1;
//                return nums[index];
//            }
//        }
//        return -1;
//    }
//
//    static void swap(int[] arr, int first, int second) {
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//}

//OPTIMIZED Approach
class FindDuplicate3 {
    public static void main(String[] args) {
         //int[] arr = {1, 3, 4, 2, 2};
        //int[] arr = {3, 1, 3, 4, 2};
        int[] arr = {1, 3, 4, 2}; //no duplicates present case will return -1
        System.out.println(findDuplicate(arr));
    }
        public static int findDuplicate(int[] arr) {
            int i = 0;
            while (i < arr.length) {
                if (arr[i] != i + 1) {
                    int correctIndex = arr[i] - 1;
                    if (arr[i] != arr[correctIndex]) {
                        swap(arr, i , correctIndex);
                    } else {
                        return arr[i];
                    }
                }
                else {
                    i++;
                } 
            }
            
            return -1; //will reach this after exiting while loop
        }

        static void swap(int[] arr, int first, int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }
