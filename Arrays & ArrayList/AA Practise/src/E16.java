//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class E16 {
    class Solution {
        public int findNumbers(int[] nums) {
            // System.out.println(findNumbers(nums));
            int count = 0;
            for (int num : nums) {  //spelled as for every number(num) in numbers(nums)

                if (even(num)) {
                    count++;
                }

            }
            return count;
        }

        // function to check whether a number contains even digits or not
        boolean even(int num) {
            int numberofDigits = digits(num);
        /*
        if(numberofDigits % 2 ==0){
            return true;
        }
             return false;
         */
            return numberofDigits % 2 == 0;
        }

        // count number of digits in a number
        int digits(int num) {
            int count = 0;

            while (num > 0) {
                count++;
                num = num / 10; //num /= 10
            }

            return count;


        }

    }
}