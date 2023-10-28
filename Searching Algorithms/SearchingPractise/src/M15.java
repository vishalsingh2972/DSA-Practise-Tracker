//https://leetcode.com/problems/find-the-duplicate-number/
public class M15 {
    public static void main(String[] args) {

        int[] nums1 = {1,3,4,2,2};
        int[] nums2 = {3,1,3,4,2};

        System.out.println(findDuplicate(nums1));

        System.out.println(findDuplicate(nums2));
    }
    public static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correctIndex = arr[i] - 1;
                if (arr[i] != arr[correctIndex]) {
                    swap(arr, i , correctIndex);
                } else {
                    return arr[i];
                }
            }
            else {
                i++;
            }
        }

        return -1; //will reach this after exiting while loop
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
