import java.util.Arrays;

public class E11 {
    public static void main(String[] args) {

        int[][] matrix = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
//        System.out.println(Arrays.toString(matrix[1]));

        System.out.println(countNegatives(matrix));

    }

    public static int countNegatives(int[][] matrix) {

        int ans = 0;

        for (int i = 0; i < matrix.length; i++) {
            ans = ans + binarysearch(matrix[i]);
        }

        return ans;
    }
    public static int binarysearch(int[] arr){
            int start = 0;
            int end = arr.length - 1;
            int count = 0;

            while(start <= end){

                int mid = start + (end-start)/2;

                if(arr[mid] >= 0){
                    start = mid + 1;
                }

                if(arr[mid] < 0 && start==end) {
                    count++;
                   break;
                }

                if(arr[mid] < 0) {
                    for(int i = mid; i<arr.length;i++){
                        count = count + 1;
                    }
                    end = mid - 1;
                }

            }

        System.out.println("count in row is " + count);
        return count;
    }

}
