//https://leetcode.com/problems/minimum-time-to-repair-cars/
public class lcM2594 {
    public static void main(String[] args) {

        int[] ranks = {4, 2, 3, 1};
        int cars = 10;

//        int[] ranks = {5,1,8};
//        int cars = 6;

        System.out.println(repairCars(ranks, cars));
    }

    //Method 1 //Concise way
    public static long repairCars(int[] ranks, int cars) {

        long start = 1;
        long end = (long) Math.pow(10,14); //max limit of time taken to repair by each rank = max(rank) * max(cars allotted)^2 = 10^2 * (10^6) ^2 = 10^14
        long ans = 0;

        int n = ranks.length; //writing this beforehand to make i<n loop run faster

//        System.out.println("end " + end);
        while (start <= end) {

            long mid = start + (end - start) / 2; //mid is time in minutes
            long sum = 0; //sum of all cars repaired by all in total


            for (int i = 0; i < n; i++) {
                sum = sum + (long) Math.sqrt(mid / ranks[i]); // time taken (mid) = rank (ranks[i]) * n^2 (cars allotted)^2...so then n = squareroot(time taken/rank)) = squareroot(mid/rank[i))
            }

            if (sum >= cars) {
                ans = mid; //potential answer
                end = mid - 1;

            } else { //sum < cars
                start = mid + 1;
            }

        }

        return ans;
    }
}


         //Method 1 //Long Way
//    public static long repairCars(int[] ranks, int cars) {
//
//        long start = 1;
//        long end = (long) Math.pow(10,14);
//        long ans = 0;
//
//        while(start <= end){
//
//            long mid = start + (end-start)/2;
//
//            if (carsRepaired(ranks, mid) >= cars){
//                end = mid - 1;
//
//            }
//
//            else{ //carsRepaired < cars
//                start = mid + 1;
//            }
//
//        }
//
//        return start;
//    }
//
//
//    public static long carsRepaired(int[] ranks, long mid){
//        long sum = 0;
//
//        for(int i = 0; i<ranks.length; i++){
//            sum = sum + (long)Math.sqrt(mid/ranks[i]);
//        }
//
//        return sum;
//    }


      //Method 2 //Long way (iska short way nahi hain ye ek hi hain :P)
//      public static long repairCars(int[] ranks, int cars) {
//
//          long start = 1;
//          long end = (long) Math.pow(10,14);
//          long ans = 0;
//
//          while(start <= end){
//
//              long mid = start + (end-start)/2;
//
//              if (carsRepaired(ranks, mid, cars)){
//                  ans = mid;//potential answer
//                  end = mid - 1;
//
//              }
//              else{ //carsRepaired < cars
//                  start = mid + 1;
//              }
//
//          }
//
//          return ans;
//      }
//
//
//    public static boolean carsRepaired(int[] ranks, long mid, int cars){
//        long sum = 0;
//
//        for(int i = 0; i<ranks.length; i++){
//            sum += (long)Math.sqrt(mid/ranks[i]);
//        }
//
//        if(sum >= cars) {
//            return true;
//        }
//        return false;
//
//    }