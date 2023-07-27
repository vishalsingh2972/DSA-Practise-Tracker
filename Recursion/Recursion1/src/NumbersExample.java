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

    static void print5(int n){
        System.out.println(n);
    }

}

// - function calling another function
// - all functions have 1 thing in common - the body and the definition of the functions is same

//VVI
// all the function calls that happen in a programming language they go into the stack memory |_|
// - while the function is not finished executing it will remain in the stack memory
// in java the first function that is called is the main function so the main function is the one that will go first into the stack and the last function hat will come out of the stack, and when a function is staying inside the stack it basically means that function call is currently going on
// - when a function finishes executing, it is removed from the stack and the flow of the program is restored to the place where that function was called

