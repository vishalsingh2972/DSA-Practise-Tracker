import java.util.Arrays;
//Search in a Sorted Matrix (here done by using Binary Search)
public class SortedMatrix2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(arr,6)));
//        int target = 6;
//        System.out.println(Arrays.toString(search(arr,target)));
    }

    //here we are searching in the particular row, from start column index to end column index provided
    public static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        //cStart is colum start index and cEnd is column end index
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target){
//                int[][] ans = matrix[row][mid];
//                return ans;
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target){
                 cStart = mid + 1;
            }else //i.e if if (matrix[row][mid] > target)
            {
                 cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; //worst case scenario, only one row matrix hua to;
        //But be cautious, matrix maybe empty (0 rows and 0 columns), so uske liye niche ek check dalna padega

        if (rows == 1) {
            return binarySearch(matrix,0,0,cols-1,target);
        }

        int rStart = 0; //row start
        int rEnd = rows - 1; //row end
        int cMid = cols/2; //mid column
        //run the loop till 2 rows are remaining
        while (rStart < (rEnd - 1)) { //while this condition is true it will have more than 2 rows
            //it will have 2 rows only when rStart = rEnd - 1 like 0,1 & 1,2 & 2,3;
            int mid = rStart + (rEnd - rStart) / 2;

            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else //i.e if matrix[mid][cMid] > target
            {
                rEnd = mid;
            }

        }

        //now we have 2 rows matrix left
//now first check whether the target is present in the middle column

        //first row middle column element check
        if(matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        //second row middle column element check
        if(matrix[rStart+1][cMid] == target) { //can write either rEnd or rStart+1
            return new int[]{rStart+1, cMid};
        }

//otherwise
        // search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix,rStart,0,cMid-1,target);
        }
        // search in 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols-1]) {
            return binarySearch(matrix,rStart,cMid+1,cols-1,target);
        }
        // search in 3rd half
        if (target <= matrix[rStart+1][cMid - 1]) {
            return binarySearch(matrix,rStart+1,0,cMid-1,target);
        }
        // search in 4th half
        else { //i.e if (target >= matrix[rStart+1][cMid + 1] && target <= matrix[rStart+1][cols-1])
            return binarySearch(matrix,rStart+1,cMid+1,cols-1,target);
        }
    }
}

