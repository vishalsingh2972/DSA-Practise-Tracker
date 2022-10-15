//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
public class E22 {
    //Brief
    class Solution {
        public int[] sumZero(int n) {

            int[] arr = new int[n];

            for (int i = 0; i < arr.length / 2; i++) {

                arr[i] = i + 1;
                arr[arr.length - i - 1] = -arr[i];
            }
            //arr[arr.length/2] compiler will directly assign it 0 value as it is not given or calculated
            return arr;
        }
    }
}

    //Detailed approach
//    class Solution {
//        public int[] sumZero(int n) {
//
//            int[] arr = new int[n];
//
//            if(n % 2 == 0){
//                for(int i = 0; i<arr.length;i++){
//
//                    arr[i] = i + 1;
//                    arr[arr.length-i-1] = -arr[i];
//                }
//
//                return arr;
//            }
//            else {
//
//                for(int i = 0; i<arr.length;i++){
//
//                    arr[i] = i + 1;
//                    arr[arr.length-i-1] = -arr[i];
//                }
//                arr[(n/2)] = 0;
//
//            }
//
//            return arr;
//
//        }
//    }





