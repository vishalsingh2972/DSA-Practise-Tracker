//https://leetcode.com/problems/arranging-coins/
public class E6 {
    public static void main(String[] args) {

//        System.out.println(arrangeCoins(5));
//        System.out.println(arrangeCoins(8));

        System.out.println(arrangeCoins(1804289383));

    }

    public static int arrangeCoins(int n) {

        long start = 1;
        long end = n;
        long ans = 0;

        while(start <= end){

            long mid = start + (end-start)/2;
//            System.out.println(mid);
            long sum = mid*(mid+1)/2; //if limit of n = limit of int as given in the question = 2^31 - 1, then value of sum(approx calculation not exact) = n/2 * (n/2 + 1) /2 = n + (n^2 - 6n)/4 , now this value n + (n^2 - 6n)/4 in most of the cases will exceed n i.e the limit of int , so it is better to take all long to accommodate all the values without any integer overflow (An integer overflow can cause the value to wrap and become negative, which violates the program's assumption and may lead to unexpected behavior)
                                      //like for n = 1804289383, mid = 902144692, and sum = 406932523102959778 >>>>>>>>>>>>>>>>> limit of int (= 2^31 - 1 = 2147483647), hence we need to use long in order to store such higher values like sum

//            System.out.println(sum);
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
