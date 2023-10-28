import java.util.Arrays;

public class M11 {

    public static void main(String[] args) {

//        int[] nums1 = {1,10,4,4,2,7};
//        int[] nums2 = {9,3,5,1,7,4};

        int[] nums1 = {1,7,6};
        int[] nums2 = {2,3,6};

        //System.out.println(BRUTEminAbsoluteSumDiff(nums1,nums2)); //Brute Force using Binary Search and Floor and Ceiling concepts

        System.out.println(minAbsoluteSumDiff(nums1,nums2));

    }

    //Optimised Approach
    public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int n = nums1.length;//putting i < n is more optimised rather than putting i < nums.length so using n everywhere from here on
        int redMax = 0, sum = 0;

        int[] sortedNums1 = nums1.clone();
        Arrays.sort(sortedNums1); //in which we will be doing Binary Search

        for (int i = 0; i < n; i++) {
            int x = Math.abs(nums1[i] - nums2[i]);
            int y = binarySearch(sortedNums1, nums2[i]);
            sum = sum % 1000000007 + x;
//            sum = sum + x;
            redMax = Math.max(x - y, redMax);
        }

        System.out.println(Arrays.toString(sortedNums1));
        //System.out.println((sum - redMax)); //this also will give same answer but as asked in question we put modulo (check note below)
        return (sum + 1000000007 - redMax) % 1000000007; //In simple short words we are providing modulo or 1000000007 or 10^9 + 7, so that our answer does not exceed a particular limit, like in case of higher input values the answer value may exceed the limit so in order to avoid that exceeding of limit we are using modulo in the answer
                                                         //Basically to avoid integer overflow we are using modulo

        //return (sum  - redMax) ;
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        if (target >= arr[end]) {
            return target - arr[end];
        }
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return 0;
            else if (arr[mid] < target) {
                start = mid;
            } else { //arr[mid] > target case
                end = mid;
            }
            if (start + 1 == end) {
                return Math.min(Math.abs(target - arr[start]), Math.abs(target - arr[end]));
            }
        }
        return Math.abs(target - arr[start]);
    }



   //Here onwards extra Brute Force Approach Trial
    public static int BRUTEminAbsoluteSumDiff(int[] nums1, int[] nums2) {

        int diff = -1;
        int position = 0;
        int target = 0;
        int n = nums1.length;

        if(Arrays.equals(nums1,nums2)){
            return 0;
        }

        for(int i = 0; i < n; i++) {

            if(nums1[i] == nums2[i]){
                continue;
            }

            if (Math.abs(nums1[i] - nums2[i]) > diff) {
                diff = Math.abs(nums1[i] - nums2[i]);
                position = i;
                target = nums2[i];
            }

        }

        int[] sortedNums1 = nums1.clone();
        Arrays.sort(sortedNums1);
        nums1[position] = target + (Math.abs(arrayFloor(sortedNums1,target)-target) < Math.abs(arrayCeiling(sortedNums1,target)-target) ? Math.abs(arrayFloor(sortedNums1,target)-target) : Math.abs(arrayCeiling(sortedNums1,target)-target));
  //or can also be written as  //nums1[position] = target + Math.min(Math.abs(arrayFloor(sortedNums1,target)-target),Math.abs(arrayCeiling(sortedNums1,target)-target));

        System.out.println(Math.abs(arrayFloor(sortedNums1,target) - target));
        System.out.println(Math.abs(arrayCeiling(sortedNums1,target) - target));
        System.out.println(target);
        System.out.println(nums1[position]);
        System.out.println(Arrays.toString(sortedNums1));
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

        int newsum2 = 0;

        for(int i = 0; i < n; i++){
            newsum2 = newsum2 + Math.abs(nums1[i]-nums2[i]);
        }

        return newsum2;

    }

    // Greatest element less than or equal to val
    public static int arrayFloor(int[] arr, int val) {
        int low = 0;
        int high = arr.length - 1;
        int max = Integer.MIN_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= val) {
                max = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return max;
    }

    // Smallest element greater than or equal to val
    public static int arrayCeiling(int[] arr, int val) {
        int low = 0;
        int high = arr.length-1;
        int min = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= val) {
                min = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return min;
    }

    
}

//Note:
//But in certain problems, for instance when calculating the number of permutations of a size n array, even this large range may prove insufficient. We know that the number of permutations of a size n array is n!. Even for a small value of n, the answer can be very large. Eg, for n=21, the answer is 21! which is about 5 x 10^19 and too large for a long long int variable to store. This makes calculating values of large factorials difficult.
//So, instead of asking the exact value of the answer, the problem setters ask the answer modulo some number M; so that the answer still remain in the range that can be stored easily in a variable.
// For more detailed explanation check : https://www.hackerearth.com/practice/notes/abhinav92003/why-output-the-answer-modulo-109-7/ ; https://qr.ae/prVupB ; https://stackoverflow.com/questions/9169167/need-help-in-mod-1000000007-questions/65274263#65274263 ; https://www.geeksforgeeks.org/modulo-1097-1000000007/ ; https://techdose.co.in/modulo-1000000007/