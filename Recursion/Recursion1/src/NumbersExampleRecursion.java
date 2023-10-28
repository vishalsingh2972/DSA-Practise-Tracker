public class NumbersExampleRecursion {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first 5 numbers: 1 2 3 4 5

        print(1);
    }

    static void print(int n) { //print() function

        if (n == 5) { // Base Condition in Recursion
            System.out.println(n);
            return; // return statement here will return to the caller of the function that it is present in (i.e. here return; will first return to print(n+1); where n=4 and from there it will return to the print() function which is the print(1) line)
        }

        System.out.println(n); // body of the function // The body of a function is the part of the function that is executed when the function is called.

        print(n + 1); // recursive call // if you are calling a function again and again, you can treat it as a separate function call in the stack // i.e here the same function is being called again and again but every function call is being allotted a different set of memory allocation in the stack // basically here as many times as we call the same function it will take memory separately each time
    }

}

// a function that calls itself is Recursion
// Base Condition in Recursion: It is a condition where our Recursion will stop making new calls - this is a simple if condition
// No Base Condition ---> Function calls will keep happening, stack will keep getting filled again and again and we know that every function call will take up some memory in the stack, so if there is no base condition this will keep going keep going....and at one point of time it will reach a stage where memory of computer will exceed the limit and this will give StackOverflowError

//BITTY TRY 123