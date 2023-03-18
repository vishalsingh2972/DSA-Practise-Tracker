//https://leetcode.com/problems/koko-eating-bananas/
public class M10 {
    public static void main(String[] args) {

        int[] piles = {3,6,7,11};
        int h = 8; //number of hours for which guard is gone

        int[] piles2 = {30,11,23,4,20};
        int h2 = 5;

        int[] piles3 = {30,11,23,4,20};
        int h3 = 6;

        System.out.println(minEatingSpeed(piles,h));
        System.out.println(minEatingSpeed(piles2,h2));
        System.out.println(minEatingSpeed(piles3,h3));

    }

    public static int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
         int max = 0;
         int ans = 0;

        for(int i = 0; i < n ;i++){
            max = Math.max(max,piles[i]);
//            if(piles[i] > max){
//                max = piles[i];
//            }
        }

        int start = 1;
        int end = max; //maximum element of the piles array //as when we take K = highest element, it takes x hrs to eat all bananas in all piles, now even if we take anything greater than this i.e K = highest element+1,highest element+2,highest element+3.....till infinity etc, her all these K values taken after K = highest element condition will give same answer as we got for K = highest element i.e. all these conditions will take x hrs to eat all bananas in all piles, so all these are useless values for us and can be skipped from consideration as we need to find the min. value of K, so our K value will lie in the boundary of K=1 and K=highest element, so these will be our limits where we will be performing Binary Search
                       //for example in [3,6,7,11], K=3 takes 10 hrs, K=4 takes 8 hrs, K=7 takes 5hrs, K=11 takes 4 hrs,K=12 takes 4 hrs,K=13 takes 4 hrs,K=14 takes 4 hrs,K=15 takes 4 hrs,K=16 takes 4 hrs.....and so on...observe here K=11,12,13,14,15,16...and so on all give same number of hrs value i.e hrs, and we need the min. K value so K=11 might be a potential answer but K=12,13,14,15,16 give same value and there exists K=11 which is smallest of all and gives same number of hrs, so we can neglect K=12,13,14,15,16....and so on and set our end limit to K=11 i.e setting end limit to K=maximum element in the Array and now continue doing Binary Search in these given bounds i.e for start = 1 and end = maximum element in the array = 11(in this case)

        while (start <= end){

            int mid = start + (end-start)/2;

            if(timeTaken(piles,mid) <= h){
                ans = mid; //potential answer i.ee the potential k value
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }

        }

        return ans;
    }

    public static int timeTaken(int[] piles,int mid){
        int hours = 0;
        int n = piles.length;

        for(int i = 0; i < n; i++){

           if(piles[i] <= mid ){
               hours++;
           }
           else if (piles[i] > mid) {

               if (piles[i] % mid == 0) {
                   hours = hours + piles[i] / mid;
               }
               //else{
               hours = hours + piles[i] / mid + 1;
//           }
           }

        }
//        System.out.println(hours);
        return hours;
    }

}
