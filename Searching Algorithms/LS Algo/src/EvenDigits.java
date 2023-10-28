
// Find Numbers with Even Number of Digits (https://leetcode.com/problems/find-numbers-with-even-number-of-digits/)

public class EvenDigits {
    public static void main(String[] args) {

        int[] nums = {12,345,2,6,7896};
        //System.out.println(findNumbers(nums));

        System.out.println(digits2(-694587));

        //System.out.println(digits(0));
        //System.out.println(digits(2365415));
        //System.out.println(digits(-2365415));
        //System.out.println(even(234));

    }

    static int findNumbers(int[] nums){
      int count = 0;
      for(int num : nums) {  //spelled as for every number(num) in numbers(nums)

          if (even(num)){
              count++;
          }

      }
          return count;
      }

    // function to check whether a number contains even digits or not
     static  boolean even(int num) {
        int numberofDigits = digits(num);
        /*
        if(numberofDigits % 2 ==0){
            return true;
        }
             return false;
         */
         return numberofDigits % 2 == 0;
     }

    static int digits2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1; //internal working covered in number systems topic
    }


    // count number of digits in a number
    static int digits(int num) {
        int count = 0;

//        if (num < 0) {
//            num = num * -1;
//        }

//        if (num == 0) {
//            return 1; //0 contains 1 digit
//        }

        while (num > 0){
            count++;
            num = num / 10; //num /= 10
        }

        return count;


    }

}