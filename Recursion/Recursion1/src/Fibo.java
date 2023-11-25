//Print nth Fibonacci number using Recursion
public class Fibo {
    public static void main(String[] args) {
        int ans = fibo(4);
        System.out.println(ans);
    }

    static int fibo(int n) {

        //Base Condition
        if(n < 2){ //fibo(0) = 0; and fibo(1) = 1; case
            return n;
        }
//this is NOT tail recursion
        return fibo(n-1) + fibo(n-2);
    }

    }
