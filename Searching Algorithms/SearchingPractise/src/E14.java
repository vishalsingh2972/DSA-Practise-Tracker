import java.util.Arrays;
//https://leetcode.com/problems/fair-candy-swap/
public class E14 {
    public static void main(String[] args) {

//        int[] aliceSizes = {1,2,5};
//        int[] bobSizes = {2,4};

        int[] aliceSizes = {1,1};
        int[] bobSizes = {2,2};

        System.out.println(Arrays.toString(fairCandySwap(aliceSizes,bobSizes)));

    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int SA = 0; //initial sum of all candies of alice
        int SB = 0; //initial sum of all candies of bob
        int diff = 0;

        for (int i = 0; i < aliceSizes.length; i++) {
            SA += aliceSizes[i];
        }

        for (int j = 0; j < bobSizes.length; j++) {
            SB += bobSizes[j];
        }

            diff = (SA-SB)/2; //passing all cases whether SA>SB or SA<SB

        //System.out.println(diff);

        Arrays.sort(aliceSizes);
        for (int i = 0; i < bobSizes.length; i++) {
            int ans = BinarySearch(aliceSizes, bobSizes[i] + diff);
            if (ans != -1) {
                return new int[]{ans, bobSizes[i]};
            }
        }
        return new int[]{-1,-1};
    }

    public static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return arr[mid];
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{ //if(arr[mid] < target)
                start = mid + 1;
            }

        }

        return -1;

    }


}
