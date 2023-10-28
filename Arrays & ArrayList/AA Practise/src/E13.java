//https://leetcode.com/problems/flipping-an-image/
public class E13 {
    class Solution {
        public int[][] flipAndInvertImage(int[][] image) {
            int[][] flip = new int[image.length][image[0].length];
            int start = 0;
            int end = image.length - 1;

            //flipping
            while (start < end) {
                for (int i = 0; i < image.length; i++) {

                    flip[i][start] = image[i][start];
                    image[i][start] = image[i][end];
                    image[i][end] = flip[i][start];

                }

                start++;
                end--;
            }

            //inverting
            for (int i = 0; i < image.length; i++) {
                for (int j = 0; j < image[i].length; j++) {
                    if (image[i][j] == 0) {
                        image[i][j] = 1;
                    } else {
                        image[i][j] = 0;
                    }
                }
            }
            return image;
        }
    }
}

