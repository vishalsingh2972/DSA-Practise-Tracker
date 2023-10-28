public class SearchIn1DArray {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int Target = 19;
        boolean ans = linearSearch3(nums, Target);
        //int ans = linearSearch2(nums, Target);
        //int ans = linearSearch(nums, Target);
        System.out.println(ans);

    }

    // search the target and return true or false
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            System.out.println("Empty Array");
            return false;
        }

        // run a for loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        System.out.println("Nahi hai"); // if false is returned to get clarity on which false is returned we are adding print statements
        return false;
    }
}



//2 // search the target and return the element
// if instead of index we want to find and print the element itself we can type return element; or return arr[index];

// search the target and return the element
//    static int linearSearch2(int[] arr, int target) {
//        if (arr.length == 0) {
//            System.out.println("Empty Array");
//            return -1;
//        }
//
//        // run a for loop //here as we are directly printing an element without use of its index we have used enhanced for loop
//        for (int element : arr) {
//            if (element == target) {
//                return element;
//            }
//        }
//        // this line will execute if none of the return statements above have executed
//        // hence the target not found
//       //return -1; ////suppose we have -1 as an array element, then which -1 is being printed is difficult to understand,also as -1 can never be an index, but it can be the element of the array,so we replace it with Integer.MAX_VALUE constant
//        return Integer.MAX_VALUE; //MAX_VALUE represents the maximum positive integer value that can be represented in 32 bits ( i.e., 2147483647 )
//                                  //This means that no number of type Integer that is greater than 2147483647 can exist in Java
//    }
//}



//1 // search in the array: return the index if item found
// otherwise if item not found return -1

//    static int linearSearch(int[] arr, int target) {
//        if (arr.length == 0) {
//         System.out.println("Empty Array");
//            return -2;
//        }
//
//        // run a for loop
//        for (int index = 0; index < arr.length; index++) {
//            // check for element at every index if it is = target
//            int element = arr[index];
//            if (element == target) {
//                return index;
//            }
//        }
//        // this line will execute if none of the return statements above have executed
//        // hence the target not found
//        return -1;
//    }
//
//}












