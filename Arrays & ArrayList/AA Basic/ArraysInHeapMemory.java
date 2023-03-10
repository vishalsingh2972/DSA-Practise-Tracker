import java.util.Arrays;

public class ArraysInHeapMemory {
    public static void main(String[] args) {
        int[] nums1 = {9,3,5,1,7,4};
        int[] b = nums1; //b also pointing to same array as nums1 in heap memory
        int[] temp = nums1.clone(); //clone having same values but stored at a different location in the heap memory , hence temp although has same values as nums1, BUT temp pointing to a different array/object or basically pointing to a different location in heap memory than compared to nums1 location in heap memory

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(temp));

        nums1[0] =500;
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(b)); //b is pointing to same array as nums1 in heap, so changes in nums1 will also cause changes in b //basically nums1 and b present at same location in heap
        System.out.println(Arrays.toString(temp)); //temp is pointing to a clone array of nums1, i.e clone array having same values but stored at a different location in the heap memory //basically num1 and temp although have same values/elements BUT are 2 different objects/arrays present at 2 different locations in the heap

    }
}
