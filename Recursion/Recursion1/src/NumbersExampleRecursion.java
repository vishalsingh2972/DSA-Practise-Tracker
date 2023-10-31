public class NumbersExampleRecursion {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first 5 numbers: 1 2 3 4 5

        print(1);
    } //will next reach here when return; is hit

    static void print(int n) { //print() function

        if (n == 5) { // Base Condition in Recursion
            System.out.println(n);
            return; // return statement here will return to the caller of the function that it is present in (i.e. here return; will first return to print(n+1); where n=4 and from there it will return to the print() function which was called in the main function which is the print(1) line)
        }

        System.out.println(n); // body of the function // The body of a function is the part of the function that is executed when the function is called.

        print(n + 1); // recursive call // if you are calling a function again and again, you can treat it as a separate function call in the stack // i.e here the same function is being called again and again but every function call is being allotted a different set of memory allocation in the stack // basically here as many times as we call the same function it will take memory separately each time (explained more in 4) below)
    } //will first reach here once return; is hit

}

// a function that calls itself is Recursion / Recursion means a function that calls itself //here print(n + 1) line is the recursive call in the print() function.
// Base Condition in Recursion: It is a condition where our Recursion will stop making new calls - this is a simple if condition, if (n == 5) condition is the base case here which will stop the recursive call  i.e. it will prevent the print(n + 1) line from being executed for this n value and go to the next line of print(n + 1) line
// No Base Condition ---> Function calls will keep happening, stack will keep getting filled again and again and we know that every function call will take up some memory in the stack, so if there is no base condition this will keep going keep going....and at one point of time it will reach a stage where memory of computer will exceed the limit and this will give StackOverflowError
// 4) Each function call is a separate function call and will occupy a separate memory in the stack, so basically if you are calling a function again and again you can treat it as a separate call in the stack memory like we did in this example where even though print(5), print(4), print(3), print(2) are all being called recursively from inside of print(1) one after the other but still all these 4 - print(5), print(4), print(3), print(2) will still occupy separate memory in the stack apart from the memory occupied by print(1) function // so here evn though the same function print(int n) is being called again and again but still every function call will occupy a separate memory in the stack memory
