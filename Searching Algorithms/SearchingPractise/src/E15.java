import java.util.Arrays;

public class E15 {
    public static void main(String[] args) {

//        int[] arr = {10,2,5,3};
        int[] arr ={-2,0,10,-19,4,6,-8};

        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {

        for(int i = 0; i<arr.length; i++){

            if(binarySearch(arr,2*arr[i])){
                return true;
            }

        }

        return false;
    }


    public static boolean binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        while(start <= end){

            int mid = start + (end-start)/2;


            if(arr[mid] == target){
                return true;
            }

            if(arr[mid] > target){
                end = mid - 1;
            }

            if(arr[mid] < target){
                start = mid + 1;
            }

        }

        return false;
    }





















}
