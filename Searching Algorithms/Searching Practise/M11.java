//public class M11 {
//    public static void main(String[] args) {
//
//        int[] nums1 = {1,10,4,4,2,7};
//        int[] nums2 = {9,3,5,1,7,4};
//
//
//        System.out.println(minAbsoluteSumDiff(nums1,nums2));
//
//    }
//
//
//    public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
//        int newnum = 0;
//        int diff = 0;
//        int position = 0;
//        int sum = 0;
//        int min = Integer.MAX_VALUE;
//
//        for(int i = 0; i < nums1.length; i++){
//            if(Math.abs(nums1[i]-nums2[i]) > diff){
//                diff = Math.abs(nums1[i]-nums2[i]);
//                position = i;
//                sum = diff + nums1[i];
//            }
//        }
//
//        for(int i = 0; i< nums1.length; i++){
//            if (Math.abs(nums1[i]-sum) < diff){
//                diff = Math.abs(nums1[i]-sum);
//                newnum = nums1[i];
//                nums1[position] = newnum;
//            }
//        }
//
//
//
//
//
//    }
//
//
//
//
//
//
//
//
//
//}
//
