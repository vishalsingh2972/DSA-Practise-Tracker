//https://leetcode.com/problems/guess-number-higher-or-lower/
public class E2 {
//    /**
//     * Forward declaration of guess API.
//     * @param  num   your guess
//     * @return 	     -1 if num is higher than the picked number
//     *			      1 if num is lower than the picked number
//     *               otherwise return 0
//     * int guess(int num);
//     */
//    public class Solution extends GuessGame {
//        public int guessNumber(int num) {
//            int start = 1;
//            int end = num;
//
//            while(start<=end){
//
//                int mid = start + (end-start)/2;
//
//                if(guess(mid) == 0){
//                    return mid;
//                }
//
//                else if (guess(mid) == 1){ //guess(mid) == 1
//                    start = mid + 1;
//                }
//
//                else{ //guess(mid) == -1
//                    end = mid - 1 ;
//                }
//
//
//            }
//
//
//            return -100; //not found case
//
//        }
//    }
}
