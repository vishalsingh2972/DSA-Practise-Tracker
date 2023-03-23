import java.util.Arrays;
//https://leetcode.com/problems/median-of-two-sorted-arrays/
public class H1 {
    public static void main(String[] args) {

//        int[] nums1 = {1,2,3,4,5};
//        int[] nums2 = {1,2,3,4,5,6,7,8};

//        int[] nums1 = {1,2,3,5,5};
//        int[] nums2 = {1,2,3,4,5,6,7,8};

//        int[] nums1 = {1,2,3,4};
//        int[] nums2 = {1,2,3,4,5,6,7,8};

        int[] nums1 = {1, 3};
        int[] nums2 = {2};  //getting wrong output for this , need to check once
 
//        int[] nums1 = {1,2};
//        int[] nums2 = {3,4};

//        System.out.println(findMedianSortedArrays1(nums1,nums2)); // Brute Force

        System.out.println(findMedianSortedArrays2(nums1, nums2)); // Optimized using Binary Search

    }

    // Optimized using Binary Search
    public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {

        int[] A = nums1, B = nums2;

        //If nums1 and nums2 sizes are different, make A as smaller array and B as larger array
        if(nums2.length < nums1.length){ //we skip this step in case when nums1.length == nums2.length
            A = nums2;
            B = nums1;
        }

        //This also can be done but it is failing some test cases, so I avoided
//        //Setting A as smaller array of the two nums1 and nums2
//        int[] A = nums1.length < nums2.length ? nums1 : nums2;
//        //Setting B as larger array of the two nums1 and nums2
//        int[] B = nums1.length > nums2.length ? nums1 : nums2;

        int total = A.length + B.length; //total number of elements in combined array
        int half = total / 2;

        //doing Binary Search on the smaller array i.e array int[] A
        int start = 0;
        int end = A.length - 1;
        double ans = 0.0;

        while (start <= end) {
            int i = start + (end-start)/2; //i is index of mid in A array

            int j = half - i - 2; //pointer for B //index of end point of number of elements in B

            int Aleft = i >= 0 ? A[i] : Integer.MIN_VALUE; //rightmost/largest element in A in the left partition
            int Aright = i + 1 < A.length ? A[i + 1] : Integer.MAX_VALUE; //leftmost/smallest element in A in the right partition

            int Bleft = j >= 0 ? B[j] : Integer.MIN_VALUE; //rightmost/largest element in B in the left partition
            int Bright = j + 1 < B.length ? B[j + 1] : Integer.MAX_VALUE; //leftmost/smallest element in B in the right partition


            if (Aleft <= Bright && Bleft <= Aright) { //if this condition satisfies our partitions are correctly cut

                //when total = odd
                if (total % 2 != 0) {
                    ans = Math.min(Aright, Bright);
                    break;
                }

                //when total = even
                else { //total%2 == 0 case
                    ans = (Math.max(Bleft, Aleft) + Math.min(Bright, Aright)) / 2.0;
                    break;
                }
            } else if (Aleft > Bright) {
                end = i - 1;
            } else { // Bleft > Aright case
                start = i + 1;
            }

        }
        return ans;
        // return -1; //no need of return as while(true) will run infinitely and will somehow each some or the other return statement inside while
    }


// Brute Force
    public static double findMedianSortedArrays1(int[] nums1, int[] nums2) {
        if(nums1.length==0 && nums2.length==1  ) return nums2[0];
        if(nums1.length==1 && nums2.length==0  ) return nums1[0];
        int len1=nums1.length;
        int len2=nums2.length;
        int [] arr=new int[len1+len2];
        int j=0;
        for(int i=0;i<len1;i++){
            arr[j]=nums1[i];
            j++;
        }
        for(int i=0;i<len2 && j<len1+len2 ;i++){
            arr[j]=nums2[i];
            j++;
        }

        Arrays.sort(arr);

        int mid=(arr.length)/2 ;
        if(arr.length % 2 != 0) return arr[mid]; //when arr.length is odd

        else return (Double.valueOf(arr[mid]+arr[mid-1])/Double.valueOf(2)); //when arr.length is even

    }

}




