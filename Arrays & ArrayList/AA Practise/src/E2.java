import java.util.Arrays;
//https://leetcode.com/problems/concatenation-of-array/submissions/
public class E2 {
    public static void main(String[] args) {

        int[] arr ={1, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(arr)));

    }

    public static int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int N = 2*n;
        int d = N - n;

        int[] ans = new int[N];


        for(int i = 0 ; i < n; i++){

            ans[i] = nums[i];
            ans[i + d] = nums[i];
        }

        return ans;
    }

}
