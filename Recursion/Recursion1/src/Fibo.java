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

//✨🌟 VVIP ✨🌟
//How to understand and approach a problem - steps :
// 1) Identify if you can break down the problem into smaller problems.
// 2) Write the recurrence relation if needed.
// 3) Draw the recursive tree.
// 4) About the tree: (points to follow when learning about the tree)
        // See the flow of functions, how they are getting in stack
        // Identify and focus on left tree calls and right tree calls
        // Draw the tree and pointers again and again using pen and paper
        // Use a debugger to see how the flow is working
// 5) See how the values and what type of values (int, string, etc.) are returned at each step, see where the function call will come out. In the end you will come out of the main function

//✨🌟🧨 VVVVIP 🧨✨🌟 (variables in recursion)


