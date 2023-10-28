
// Richest Customer Wealth (https://leetcode.com/problems/richest-customer-wealth/)

public class MaxWealth {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts) {
        // person = rol
        // account = col
        int max = 0;
        for (int[] ints : accounts)  //spelled as for each ints present in accounts
        {
            // when you start a new row, take a new sum for that row
            int banksum = 0;
            for (int anInt : ints)  //spelled as for each anInt present in ints
            {
                banksum += anInt;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (banksum > max) {
                max = banksum;
            }
        }
        return max;
    }
}


        //Expanded for loop
//        public int maximumWealth(int[][] accounts) {
//            int max = 0;
//            for (int person =0; person < accounts.length; person++ )
//            {
//                int banksum=0;
//                for (int bank =0; bank < accounts[person].length; bank++)
//                {
//
//                    banksum = banksum + accounts[person][bank];
//
//                }
//
//                if (banksum > max){
//
//                    max = banksum;
//                }
//
//            }
//            return max;
// }
//        }


