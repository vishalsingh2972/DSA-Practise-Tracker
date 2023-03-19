//https://leetcode.com/problems/koko-eating-bananas/
public class M10 {
    public static void main(String[] args) {

        long[] piles = {3,6,7,11};
        long h = 8; //number of hours for which guard is gone

        long[] piles2 = {30,11,23,4,20};
        long h2 = 5;

        long[] piles3 = {30,11,23,4,20};
        long h3 = 6;

        int[] piles4 = {312884470};
        int h4 = 312884469;

        long[] piles5 = {805306368,805306368,805306368};
        long h5 = 1000000000;

//        System.out.println(minEatingSpeed(piles,h));
//        System.out.println(minEatingSpeed(piles2,h2));
//        System.out.println(minEatingSpeed(piles3,h3));

//        System.out.println(minEatingSpeed(piles4,h4));

        System.out.println(minEatingSpeed(piles5,h5));

    }

//Method 2
    public static long minEatingSpeed(long[] piles, long h) {
        long n = piles.length;
        long max = 0;
        long ans = 0;

        for(int i = 0; i < n ;i++){
            max = Math.max(max,piles[i]);
//            if(piles[i] > max){
//                max = piles[i];
//            }
        }

        long start = 1;
        long end = max; //maximum element of the piles array //as when we take K = highest element, it takes x hrs to eat all bananas in all piles, now even if we take anything greater than this i.e K = highest element+1,highest element+2,highest element+3.....till infinity etc, her all these K values taken after K = highest element condition will give same answer as we got for K = highest element i.e. all these conditions will take x hrs to eat all bananas in all piles, so all these are useless values for us and can be skipped from consideration as we need to find the min. value of K, so our K value will lie in the boundary of K=1 and K=highest element, so these will be our limits where we will be performing Binary Search
        //for example in [3,6,7,11], K=3 takes 10 hrs, K=4 takes 8 hrs, K=7 takes 5hrs, K=11 takes 4 hrs,K=12 takes 4 hrs,K=13 takes 4 hrs,K=14 takes 4 hrs,K=15 takes 4 hrs,K=16 takes 4 hrs.....and so on...observe here K=11,12,13,14,15,16...and so on all give same number of hrs value i.e hrs, and we need the min. K value so K=11 might be a potential answer but K=12,13,14,15,16 give same value and there exists K=11 which is smallest of all and gives same number of hrs, so we can neglect K=12,13,14,15,16....and so on and set our end limit to K=11 i.e setting end limit to K=maximum element in the Array and now continue doing Binary Search in these given bounds i.e for start = 1 and end = maximum element in the array = 11(in this case)

        while (start <= end) {

            long mid = start + (end-start)/2;

            if(timeTaken(piles,mid) <= h){ //maximum limit for sum of all piles[i] would be a max value of piles[i] * piles.length = 10^9 * 10^4 = 10^13.....whereas max limit of value that long datatype can store is 9,223,372,036,854,775,807 which is far >>>>>>>> than 10^13, so long will easily store the values and solve the problem comfortably even till the limits given in the question, so using long is better than int (limit of int is only 2147483648 <<<<< 10^13 so int may not be able to store higher values, even if you put higher values in int it will overflow and go in negative zone and give negative number output and as we know in this case sum of hours cannot be a "negative" entity, hence using long is far better than using int)
                ans = mid; //potential answer i.e. the potential k value
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }

        }

        return ans;
    }

    public static long timeTaken(long[] piles,long mid){
        long hours = 0;
        long n = piles.length;

        for(int i = 0; i < n; i++){

            if(piles[i] <= mid){
                hours++;
            }
            else { // (piles[i] > mid)

                if (piles[i] % mid == 0) {
                    hours = hours + piles[i] / mid;
                }
                else{
                    hours = hours + piles[i] / mid + 1;
                }
            }

        }
//        System.out.println(hours);
        return hours;
    }

}

//Method 1
//    public static int minEatingSpeed(int[] piles, int h) {
//        int n = piles.length;
//         int max = 0;
//         int ans = 0;
//
//        for(int i = 0; i < n ;i++){
//            max = Math.max(max,piles[i]);
////            if(piles[i] > max){
////                max = piles[i];
////            }
//        }
//
//        int start = 1;
//        int end = max; //maximum element of the piles array //as when we take K = highest element, it takes x hrs to eat all bananas in all piles, now even if we take anything greater than this i.e K = highest element+1,highest element+2,highest element+3.....till infinity etc, her all these K values taken after K = highest element condition will give same answer as we got for K = highest element i.e. all these conditions will take x hrs to eat all bananas in all piles, so all these are useless values for us and can be skipped from consideration as we need to find the min. value of K, so our K value will lie in the boundary of K=1 and K=highest element, so these will be our limits where we will be performing Binary Search
//                       //for example in [3,6,7,11], K=3 takes 10 hrs, K=4 takes 8 hrs, K=7 takes 5hrs, K=11 takes 4 hrs,K=12 takes 4 hrs,K=13 takes 4 hrs,K=14 takes 4 hrs,K=15 takes 4 hrs,K=16 takes 4 hrs.....and so on...observe here K=11,12,13,14,15,16...and so on all give same number of hrs value i.e hrs, and we need the min. K value so K=11 might be a potential answer but K=12,13,14,15,16 give same value and there exists K=11 which is smallest of all and gives same number of hrs, so we can neglect K=12,13,14,15,16....and so on and set our end limit to K=11 i.e setting end limit to K=maximum element in the Array and now continue doing Binary Search in these given bounds i.e for start = 1 and end = maximum element in the array = 11(in this case)
//
//        while (start <= end) {
//
//            int mid = start + (end-start)/2;
//
//            if(timeTaken(piles,mid) <= h && timeTaken(piles,mid) > 0){ //putting && timeTaken(piles,mid) > 0 as when we add hours, in cases like piles5 for k = 1 hours value will cross maximum limit of int and go into negative range, so to avoid that and consider only positive value for hours we are putting this condition timeTaken(piles,mid) > 0, or better you can store all in long instead of int like we did in Method 2, as long can store more larger values without them going into negative
//                ans = mid; //potential answer i.e. the potential k value
//                end = mid - 1;
//            }
//
//            else {
//                start = mid + 1;
//            }
//
//        }
//
//        return ans;
//    }
//
//    public static int timeTaken(int[] piles,int mid){
//        int hours = 0;
//        int n = piles.length;
//
//        for(int i = 0; i < n; i++){
//
//           if(piles[i] <= mid ){
//               hours++;
//           }
//           else { // (piles[i] > mid)
//
//               if (piles[i] % mid == 0) { //multiples of mid, numbers which are divisible by mid and do not leave a remainder, remainder = 0
//                   hours = hours + piles[i] / mid;
//               }
//               else{ //(piles[i] % mid != 0) //non multiples of mid, numbers which are not divisible by mid and leave a remainder, remainder != 0
//               hours = hours + piles[i] / mid + 1;
//           }
//           }
//
//        }
////        System.out.println(hours);
//        return hours;
//    }

