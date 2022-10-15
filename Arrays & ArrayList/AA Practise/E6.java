import java.util.ArrayList;
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class E6 {
    //Brief
    class Solution {
        public ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int n = candies.length;
            ArrayList<Boolean> resultAL = new ArrayList<>();
            int max = 0;//Intially let us assume

            // first we find max value among all (before adding extracandies)
            for (int i = 0; i < n; i++) {
                max = Math.max(candies[i], max);
            }


            //next we compare max value with candies[i]+extraCandies value
            for (int i = 0; i < n; i++) {
                //more simpler way to add true and false
                resultAL.add((candies[i] + extraCandies) >= max);
            }


            return resultAL;
        }
    }
}

    //Detailed approach
//    class Solution {
//        public ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//            int n= candies.length;
//            ArrayList<Boolean> resultAL = new ArrayList<>();
//            int max = 0;//Initially let us assume
//
//            // first we find max value among all (before adding extracandies)
//            for(int i=0;i<n;i++){
//                max=Math.max(candies[i],max);
//            }
//
//
//            //next we compare max value with candies[i]+extraCandies value
//            for(int i=0;i<n;i++){
//                if((candies[i]+extraCandies) >= max){
//                    resultAL.add(true);
//                }
//                else{
//                    resultAL.add(false);
//                }
//            }
//
//            return resultAL;
//        }
//    }

