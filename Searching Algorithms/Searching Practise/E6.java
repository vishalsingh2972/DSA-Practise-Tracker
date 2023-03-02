//https://leetcode.com/problems/arranging-coins/
public class E6 {
    public static void main(String[] args) {

        System.out.println(arrangeCoins(5));
        System.out.println(arrangeCoins(8));

    }


    public static int arrangeCoins(int n) {

        long start = 1;
        long end = n;
        long ans = 0;

        while(start <= end){

            long mid = start + (end-start)/2;
            long sum = mid*(mid+1)/2;

            if(sum > n) {
                end = mid - 1;
            }

            else if (sum <= n) {
                start = mid + 1;
                ans = mid;

            }

        }

        return (int)ans;

    }

}
