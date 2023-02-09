
public class Patterns {
    public static void main(String[] args) {
//        int n = 5;
//        pattern2(n);

//        pattern2(5);
//        pattern1(5);
//        pattern3(5);
//        pattern4(5);
//        pattern5(5);
//        pattern28(5);
//        pattern30(5);
//        pattern17(4);

        pattern31(4);

    }

    public static void pattern31(int n) {
        int originalN = n;
        n = (2 * n) - 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row - 1, col - 1), Math.min((n - col), (n - row)));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }


    public static void pattern17(int n) {
        for (int row = 1; row < 2*n; row++) {
            int c = row > n ? 2*n - row : row;

            for (int s = 1; s <= n - c; s++) { //for space (left side as right side does not matter by default you will get space as you go to new line)
                System.out.print("  ");
            }
            for (int col = c; col >= 1; col--) { //for elements from left till 1 (including 1)
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) { //for elements from 1 (excluding 1) till right
                System.out.print(col + " ");
            }
            System.out.println(" ");
        }
    }

    public static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            for (int s = 1; s <= n - row; s++) { //for space (left side as right side does not matter by default you will get space as you go to new line)
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) { //for elements from left till 1
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) { //for elements from 1 till right
                System.out.print(col + " ");
            }
            System.out.println(" ");
        }
    }

    public static void pattern28(int n) {
        for(int row = 1; row<2*n; row++){
            int totalColinRow = row > n ? 2*n-row : row; //if row > n follow totalColinRow = 2*n-row or else totalColinRow = row

            int noOfSpaces = row > n ? row - n : n - row; //for row>n,noOfSpaces = row - n and for row<=n,noOfSpaces = n - row

            for (int s = 1; s<=noOfSpaces; s++){
                System.out.print(" ");
            }

//             int noOfSpaces = n - totalColinRow; //Kunnu ka approach
//            for (int s = 1; s<=noOfSpaces; s++){
//                System.out.print(" ");
//            }

            for (int col = 1; col<=totalColinRow; col++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void pattern5(int n) {
        for(int row = 1; row<2*n; row++){
//compact way
            int totalColinRow = row > n ? 2*n-row : row; //if row > n follow totalColinRow = 2*n-row or else totalColinRow = row
            //int totalColinRow = row < n ? row : 2*n-row; //ye bhi kar sakte use

            for (int col = 1; col<=totalColinRow; col++){
                System.out.print("* ");
            }
//long way using two separate methods
//            if(row <= n){
//                for (int col = 1; col<=row; col++){
//                    System.out.print("* ");
//                }
//            }
//
//            if(row > n){
//                for (int col = 1; col<=2*n-row; col++){
//                    System.out.print("* ");
//                }
//            }

            System.out.println();
        }
    }

    public static void pattern4(int n) {

        for (int row = 1; row <= n; row++) {
            int count = 1;
            for (int col = 1; col <= row; col++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){

        for(int row = 1; row<=n; row++){
            //now for every row, run the col
            for (int col = 1; col<=row; col++){
                System.out.print("* ");
            }
            //when one row is printed, we need to add a newline.......1st row printed...new line.....2nd row printed...newline.......3rd row printed...newline and so on..........
            System.out.println();
        }
    }

    public static void pattern1(int n){

//        for(int row = 1; row<=n; row++){
//            System.out.println("* * * * *");
//        }

        for(int row = 1; row<=n; row++){
            //now for every row, run the col
            for (int col = 1; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){

        for(int row = 0; row<=n; row++){

            for (int col = 1; col<=n-row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

//        for(int row = 1; row<=n; row++){
//
//            for (int col = 1; col<=n-row+1; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }

}
