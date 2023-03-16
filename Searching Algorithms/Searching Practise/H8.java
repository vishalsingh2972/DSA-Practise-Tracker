//https://curiouschild.github.io/leetcode/2019/06/21/divide-chocolate.html (Leetcode Premium Question)
public class H8 {
    public static void main(String[] args) {

        int[] sweetness = {1,2,3,4,5,6,7,8,9};
        int k = 5; //k is number of friends excluding me, so total number of people who will share the cake or total number of pieces that we will be doing of sweetness array  = k + 1
        //for dividing into k + 1, the number of cuts that we will be doing is k, for e.g. when we need to divide 1 cake among 3 people, number of cuts we will be making is 2 (2 cuts main 3 tukde ho jaate uske no need of another cut :P )
        int noOfPieces = k + 1;

        int[] sweetness2 = {5,6,7,8,9,1,2,3,4};
        int k2 = 8;
        int noOfPieces2 = k2 + 1;

        int[] sweetness3 = {1,2,2,1,2,2,1,2,2};
        int k3 = 2;
        int noOfPieces3 = k3 + 1;

//        int[] sweetness4 = {1,2,2,1,2,2,1,2,2};
//        int k4 = 1;
//        int noOfPieces4 = k4 + 1;

        System.out.println(splitChocolate(sweetness, noOfPieces));

        System.out.println(splitChocolate(sweetness2, noOfPieces2));

        System.out.println(splitChocolate(sweetness3, noOfPieces3));
//        System.out.println(splitChocolate(sweetness4,noOfPieces4));

    }

    public static int splitChocolate(int[] nums, int m) { //given as "public static int maximizeSweetness(int[] nums, int m) {" in question
        int start = 100000;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.min(start, nums[i]); // in the end of the loop this will contain the min. item/element of the array //when divided in n pieces case
            end += nums[i]; // in the end this will contain sum of all elements of array //when divided into 1 piece case
        }

        // Binary Search
        while(start < end){

            int mid = start + (end - start)/2;

            int sum = 0;// for adding elements comparing to sum and dividing pieces accordingly
            int pieces = 0; //initially we are starting with 0 piece (i.e. till now nobody got any chocolate piece, no cutting has started yet so pieces = 0 initially) and as loop progresses division of pieces will take place
            for (int i = 0; i<nums.length; i++) {
                if (sum + nums[i] > mid) {
                    // you cannot add this in this subarray, make new one
                    // say you add this num in new subarray, then sum = num
                    sum = nums[i];
                    pieces++;
                } else {
                    sum += nums[i];
                }
            }

            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
//        System.out.println(start);
//        System.out.println(end);
        return start;
    }

}
