import java.util.Arrays;

public class H1 {
    public static void main(String[] args) {

//        int[] nums1 = {1,2};
//        int[] nums2 = {3,4};

//        int[] nums1 = {1,2,3,4,5};
//        int[] nums2 = {1,2,3,4,5,6,7,8};

//        int[] nums1 = {1,2,3,5,5};
//        int[] nums2 = {1,2,3,4,5,6,7,8};

        int[] nums1 = {1,2,3,4};
        int[] nums2 = {1,2,3,4,5,6,7,8};

//        System.out.println(findMedianSortedArrays1(nums1,nums2)); // Brute Force

        System.out.println(findMedianSortedArrays2(nums1,nums2)); // Optimized using Binary Search

    }

// Optimized using Binary Search
    public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        //Setting A as smaller array of the two nums1 and nums2
        int[] A = nums1.length < nums2.length ? nums1 : nums2;
        //Setting B as larger array of the two nums1 and nums2
        int[] B = nums1.length > nums2.length ? nums1 : nums2;

        int total = nums1.length + nums2.length; //total number of elements in combined array
        int half = total/2;


        //doing Binary Search on the smaller array i.e array int[] A
        int start = 0;
        int end = A.length-1;

        while(start <= end) {
            int i = start + (end - start) / 2; //i is index of mid in A array

            int j = half - i - 2; //pointer for B //index of end point of number of elements in B

            int Aleft = A[i] < 0 ? Integer.MIN_VALUE : A[i]; //rightmost/largest element in A in the left partition
            int Aright = A[i + 1] > A.length ? Integer.MAX_VALUE : A[i + 1]; //leftmost/smallest element in A in the right partition

            int Bleft = B[j] < 0 ? Integer.MIN_VALUE : B[j]; //rightmost/largest element in B in the left partition
            int Bright = B[j + 1] > B.length ? Integer.MAX_VALUE : B[j + 1]; //leftmost/smallest element in B in the right partition


            if (Aleft <= Bright && Bleft <= Aright) { //if this condition satisfies our partitions are correctly cut

                //when total = odd
                if(total%2 != 0){
                   double ans = Integer.min(Aright, Bright);
                    return ans;
                }

                //when total = even
                else { //total%2 == 0 case
                    double ans = (Integer.max(Bleft, Aleft) + Integer.min(Bright, Aright)) / 2.0;
                    return ans;
                }
            }

            else if(Aleft > Bright){
                end = i - 1;
            }

            else { // Bleft > Aright case
                start = i + 1;
            }

        }
        return -1; //will never reach this step just putting for formality
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

