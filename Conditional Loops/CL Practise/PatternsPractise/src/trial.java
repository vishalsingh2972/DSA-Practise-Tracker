public class trial{
    public static void main(String[] args) {
        pattern31w(4);
//        pattern31c(4);
    }
 //correct code
    static void pattern31c(int n) {
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

//kunal code
static void pattern31w(int n) {
    int originalN = n;
    n = 2 * n;
    for (int row = 0; row <= n; row++) {
        for (int col = 0; col <= n; col++) {
            int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
            System.out.print(atEveryIndex + " ");
        }
        System.out.println();
    }
}





}
