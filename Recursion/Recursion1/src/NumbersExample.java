public class NumbersExample {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first 5 numbers: 1 2 3 4 5

        print1(1);
    }

    static void print1(int n){
        System.out.println(n);
        print2(2);
    }

    static void print2(int n){
        System.out.println(n);
        print3(3);
    }

    static void print3(int n){
        System.out.println(n);
        print4(4);
    }

    static void print4(int n){
        System.out.println(n);
        print5( 5);
    }

    //function body here changes
    static void print5(int n){
        System.out.println(n);
    }

}

// - function calling another function
// - all functions have 1 thing in common - the body and the definition of the functions is same

//VVI
// all the function calls that happen in a programming language they go into the stack memory |_| , here the fact that the function calls go into the stack memory means that the execution of a program is a last-in-first-out (LIFO) process. This means that the last function to be called is the first function to return.
// - while the function is not finished executing it will remain in/inside the stack memory.
// in java the first function that is called is the main function so the main function is the one that will go first into the stack memory and the last function that will come out of the stack memory, and when a function is staying inside the stack it basically means that the function call is currently going on for that function.
// - when a function finishes executing, it is removed from the stack and the flow of the program is restored to the place where that function was called

// primitives are also stored in the stack memory along with the functions

