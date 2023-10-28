//https://curiouschild.github.io/leetcode/2019/06/21/divide-chocolate.html (Leetcode Premium Question)
public class H8 {
    public static void main(String[] args) {

        int[] sweetness = {1,2,3,4,5,6,7,8,9};
        int k = 5; //k is number of total people excluding me, or the number of cuts I need to make for dividing excluding me for e.g. Suppose I have a cake and I want to divide it with W and Pooja, so then I will be making K cuts (here 2 cuts) in order to divide it with my K friends (here 2 friends) [remember for 3 tukde we require only 2 cuts :P ]

        int[] sweetness2 = {5,6,7,8,9,1,2,3,4};
        int k2 = 8;

        int[] sweetness3 = {1,2,2,1,2,2,1,2,2};
        int k3 = 2;

        int[] sweetness4 = {1,2,2,1,2,2,1,2,2};
        int k4 = 1;

        System.out.println(splitChocolate(sweetness, k));

//        System.out.println(splitChocolate(sweetness2, k2));
//
//        System.out.println(splitChocolate(sweetness3, k3));
//
//        System.out.println(splitChocolate(sweetness4, k4));

    }

    public static int splitChocolate(int[] nums, int m) { //given as "public static int maximizeSweetness(int[] nums, int m) {" in question
        m++; //m++ = number of friends or number of pieces "including me"

        int start = 100000;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.min(start, nums[i]); // in the end of the loop this will contain the min. item/element of the array //when divided in n pieces case
            end += nums[i]; // in the end this will contain sum of all elements of array //when divided into 1 piece case
        }

        // Binary Search
        while(start < end){

            int mid = start + (end - start)/2;

            int sum = 0;// for adding elements comparing to sum, making cuts and dividing pieces accordingly
            int cuts = 0; //initially we are starting with 0 cuts (i.e. till now nobody got any chocolate piece, no cutting has started yet so cuts = 0 initially) and as loop progresses, cuts will be made which will lead to making of pieces of chocolate, these pieces will then be divided among all
            for (int i = 0; i<nums.length; i++) {
                if (sum + nums[i] > mid) {
                    // you cannot add this in this subarray, make new cut i.e. new piece(or subarray) formed
                    cuts++;
                    // Also, from new piece onwards we will again start calculating sum, so no need of previous sum value that we calculated so now set sum = 0 and continue the journey
                    sum = 0;//doubt
                } else {
                    sum += nums[i];
                }
            }

            if (cuts >= m) {
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
