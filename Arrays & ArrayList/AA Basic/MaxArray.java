public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 9, 18};
        //System.out.println(max(arr));
        System.out.println(maxRange(arr, 4, 3));
    }

//    static int max(int[] arr){
//     if (arr.length == 0) {
//        return -1; //if the array is empty return -1
//      int max = arr[0];
//      for (int i =0; i < arr.length;i++){
//          if (arr[i] > max){
//              max = arr[i];
//          }
//      }
//       return max;
//    }
//}

//Maximum value in a particular range

    static int maxRange(int[] arr, int start, int end){
        if (start > end) {
            return -1;
        }

        if (arr == null) {
            return -1;
        }

        int max = arr[start];
        for (int i =start; i <=end;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
