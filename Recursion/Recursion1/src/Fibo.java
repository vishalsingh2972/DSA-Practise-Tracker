//Print nth Fibonacci number using Recursion
public class Fibo {
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }

    static int fibo(int n) {

        //Base Condition
        if(n < 2){ //fibo(0) = 0; and fibo(1) = 1; case
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }

    }
