//https://leetcode.com/problems/single-element-in-a-sorted-array/
public class M2 {
    public static void main(String[] args) {

//        int[] arr = {1,1,2,3,3,4,4,8,8};
//        int[] arr = {3, 3, 7, 7, 10, 11, 11};
//        int[] arr = {1, 1, 2};
        int[] arr = {1, 2, 2, 3, 3};

//*IMP* Note: In a sorted array having a pairs of integers(1,1, 2,2, 3,3 ....etc), in each pair the 1st element of every pair always lies on even index and the 2nd element of every pair always lies on odd index

        System.out.println(singleNonDuplicate(arr));

    }

    public static int singleNonDuplicate(int[] nums) {

        int n = nums.length;
        int start = 0;
        int end = n-1;  //nums.length-1;

        while(start < end){

            int mid = start + (end-start)/2;

            if( mid % 2 == 0 && mid + 1 < n  && nums[mid] == nums[mid + 1] ||
                    mid % 2 == 1 && mid - 1 >= 0 && nums[mid] == nums[mid - 1] ) {
//EXPLANATION      //if(mid index even and 1st element of pair present at mid index || mid index odd and 2nd element of pair present at mid index)
                //search on RIGHT side //also note mid+1 < n and mid-1 >=0 conditions to avoid ArrayIndexOutOfBound Error

                start = mid + 1;
            }


            else { //if( mid % 2 == 0 && mid - 1 >= 0 && nums[mid] == nums[mid - 1]  ||  mid % 2 == 1 && mid + 1 < n  && nums[mid] == nums[mid + 1] ) condition
//EXPLANATION      //if(mid index even and 2nd element of pair present at mid index || mid index odd and 1st element of pair present at mid index)
                //search on LEFT side //also note mid+1 < n and mid-1 >=0 conditions to avoid ArrayIndexOutOfBound Error

                end = mid - 1;
            }


            if(mid+1<n && mid-1>=0 && nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                //same here also like above note mid+1 < n and mid-1 >=0 conditions to avoid ArrayIndexOutOfBound Error
//EXPLANATION        //if we found nums[mid] is neither equal to nums[mid-1] i.e its before index element nor equal to nums[mid+1] i.e its after index element, also given that array is sorted so nums[mid] does not have any other pair element elsewhere as well ,so nums[mid] is the number without pair element so that should be our answer
                return nums[mid];
            }

        }
        return nums[start];
    }
}
