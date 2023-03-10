import java.util.Arrays;
//BRUTE FORCE
public class M11 {
    public static void main(String[] args) {

        int[] nums1 = {1,10,4,4,2,7};
        int[] nums2 = {9,3,5,1,7,4};

//        int[] nums1 = {1,7,5};
//        int[] nums2 = {2,3,5};



        System.out.println("BEFORE");
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

        int newnum = 0;
        int diff = -1;
        int position = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < nums1.length; i++) {
            if (Math.abs(nums1[i] - nums2[i]) > diff) {
                diff = Math.abs(nums1[i] - nums2[i]);
                position = i;
                sum = nums2[i];
            }
        }

        System.out.println("Maximum difference value is " + diff + " at index number " + position);

        for(int i = 0; i< nums1.length; i++){
            if (Math.abs(nums1[i]-sum) < diff){
                diff = Math.abs(nums1[i]-sum);
                newnum = nums1[i];
                nums1[position] = newnum;
            }
        }

        System.out.println("AFTER");
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));


        int newsum2 = 0;

        for(int i = 0; i < nums1.length; i++){
            newsum2 = newsum2 + Math.abs(nums1[i]-nums2[i]);

        }

        System.out.println(newsum2);

    }
}
