//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
public class M16 { //Used Binary Search
    public static void main(String[] args) {

//        int[] weights = {1,2,3,4,5,6,7,8,9,10};
//        int days = 5;

        int[] weights = {3, 5, 4, 6, 2};
        int days = 3;

        System.out.println(shipWithinDays(weights, days));
    }

    public static int shipWithinDays(int[] weights, int days) {
        int totalSum = 0;
        int max = 0;
        int ans = 0;

        for (int i = 0; i < weights.length; i++) {
            totalSum = totalSum + weights[i];

            if (weights[i] > max) {
                max = weights[i];
            }
        }

        int start = max; //LOWER LIMIT - MAX ELEMENT IN ARRAY
        int end = totalSum; //UPPER LIMIT - SUM OF ALL ELEMENTS

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (daysCount(mid, weights, days)) {
                ans = mid; //potential answer found, will repeat until we reach final answer
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }

        }
        return ans;

    }

    //function to count number of days
    public static boolean daysCount(int mid, int[] arr, int D) {
        int sum = 0;
        int daysCount = 0;

        for (int i = 0; i < arr.length; i++) {

            if (sum + arr[i] <= mid) {
                sum = sum + arr[i];
            } else {
                sum = arr[i]; //reset sum and
                daysCount++; //increase number of days
            }
        }
        daysCount++;

        if (daysCount <= D) {
            return true;
        }

        return false;

    }

}

