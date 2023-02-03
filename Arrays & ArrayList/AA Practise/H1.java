import java.util.ArrayList;
import java.util.Arrays;
//https://leetcode.com/problems/max-value-of-equation/
public class H1 {
    public static void main(String[] args) {

//        int points[][] = new int[][]{{1, 3}, {2, 0}, {5, 10}, {6, -10}};
//        int k = 1;

        int points[][] = new int[][] { { -19, -12 }, { -13, -18 }, { -12, 18 }, { -11, -8 }, { -8, 2 }, { -7, 12 },
                { -5, 16 }, { -3, 9 }, { 1, -7 }, { 5, -4 }, { 6, -20 }, { 10, 4 }, { 16, 4 }, { 19, -9 }, { 20, 19 } };
        int k = 6;

//         int points[][] = new int[][] { { 0,0 }, { 1, -1 },};
//         int k = 1;

        System.out.println(findMaxValueOfEquation(points, k));
//        System.out.println(points[1][0]);
//        System.out.println(points[1][1]);
    }

    public static int findMaxValueOfEquation(int[][] points, int k) { //Brute Force (Time Limit Exceeded)
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < points.length - 1; i++) {
                for (int j = i + 1; j < points.length; j++) {
                    
                    if (Math.abs(points[i][0] - points[j][0]) > k) { //|x1 - x2| > k cases
                        continue;
                    }
                    if (Math.abs(points[i][0] - points[j][0]) <= k) { //|x1 - x2| <= k cases
                        int equationValue = Math.abs(points[i][0] - points[j][0]) + points[i][1] + points[j][1]; // |x1 - x2| + y1 + y2
                        max = Math.max(equationValue, max); // find max from all |x1 - x2| + y1 + y2 values
                    }
                }
            }
            return max; //return that max value
        }
    }




