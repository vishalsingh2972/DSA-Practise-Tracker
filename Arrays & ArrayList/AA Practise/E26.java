//https://leetcode.com/problems/plus-one/
public class E26 {
    //Brief
    class Solution {
        public int[] plusOne(int[] digits) {

            for (int i = digits.length - 1; i >= 0; i--) {

                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }
                digits[i] = 0;
            }

            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            return ans;
        }
    }
}

    //Detailed approach
//    class Solution {
//        public int[] plusOne(int[] digits) {
//
//            int n = digits.length;
//
//            for(int i = digits.length-1; i>=0; i--){
//
//                if(digits[i] == 9) {
//                    digits[i] = 0;
//                }
//                else{ //i.e when digits!=9
//                    digits[i]++;
//                    break;
//
//                }
//            }
//
//            if(digits[0] == 0)// in cases where initially digits = 9, 99 ,999 etc
//            {
//                int[] ans = new int[digits.length + 1];
//                ans[0] = 1;
//                return ans;
//            }
//
//            return digits;
//       }
//    }


