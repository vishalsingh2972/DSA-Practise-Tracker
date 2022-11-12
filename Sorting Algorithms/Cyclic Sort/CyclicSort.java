import java.util.Arrays;

public class CyclicSort {
      public static void main(String[] args) {
        int[] ARR = {3, 5, 2, 1, 4};
        //System.out.println(Arrays.toString(ARR));
        sort(ARR);
        System.out.println(Arrays.toString(ARR));
        }
      static void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
           int correctIndex = arr[i] - 1; //when elements in range [1,N]; in case elements are in range [O,N] then int correctIndex = arr[i]
        //if element not present at correct index swap
            if(arr[i] != arr[correctIndex]){
        swap(arr, i, correctIndex);
              }
            else{
        i++;
              }
           }
        }

static void swap(int[] arr, int i, int correctIndex){
        int temp =  arr[i];
        arr[i] =  arr[correctIndex];
        arr[correctIndex] = temp;
        }
 }


// ALTERNATE WAY (getting modified array as return from sort function)

//public class CyclicSort {
//    public static void main(String[] args) {
//        int[] ARR = {3, 5, 2, 1, 4};
//        int[] ans = sort(ARR);
//        System.out.println(Arrays.toString(ans));
//    }
//
//    static int[] sort(int[] arr){
//        int i = 0;
//        while(i < arr.length){
//            int correctIndex = arr[i] - 1;
//            //if element not present at correct index swap
//            if(arr[i] != arr[correctIndex]){
//                swap(arr, i, correctIndex);
//            }
//            else{
//                i++;
//            }
//
//        }
//      return arr;
//    }
//
//    static void swap(int[] arr, int i, int correctIndex){
//        int temp =  arr[i];
//        arr[i] =  arr[correctIndex];
//        arr[correctIndex] = temp;
//    }
//
//}



