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

//when we have the last statement in the function call - this is called tail recursion // this is the last function call
        print(n + 1); // recursive call // if you are calling a function again and again, you can treat it as a separate function call in the stack // i.e here the same function is being called again and again but every function call is being allotted a different set of memory allocation in the stack // basically here as many times as we call the same function it will take memory separately each time (explained more in {3} below)
    } //will first reach here once return; is hit

}

// a function that calls itself is Recursion / Recursion means a function that calls itself //here print(n + 1) line is the recursive call in the print() function.
// Base Condition in Recursion: It is a condition where our Recursion will stop making new calls - this is a simple if condition, if (n == 5) condition is the base case here which will stop the recursive call  i.e. it will prevent the print(n + 1) line from being executed for this n value and go to the next line of print(n + 1) line
// {3} Each function call is a separate function call and will occupy a separate memory in the stack, so basically if you are calling a function again and again you can treat it as a separate call in the stack memory like we did in this example where even though print(5), print(4), print(3), print(2) are all being called recursively from inside of print(1) one after the other but still all these 4 - print(5), print(4), print(3), print(2) will still occupy separate memory in the stack apart from the memory occupied by print(1) function // so here evn though the same function print(int n) is being called again and again but still every function call will occupy a separate memory in the stack memory i.e as many times as you are calling that function each time it will take memory separately
// No Base Condition ---> Function calls will keep happening, stack will keep getting filled again and again and we know that every function call will take up some memory in the stack, so if there is no base condition this will keep going keep going on and on....and at one point of time it will reach a stage where memory of computer will exceed the limit and this will give StackOverflowError

// Why Recursion? - It helps us in solving bigger/complex problems in a simpler way.
// You can convert recursion solution into an iteration (iteration means not using any function calls, and just making use of loops) and vice versa. //So the idea is first solve the complex problem using Recursion then convert it into an iteration in order to get a more optimized answer, because directly solving the complex problem using iteration is difficult and that is why we need Recursion.

///
//When using Recursion to print numbers from 1 to 10 -  space complexity = space complexity of N = O(N) as each function call will occupy separate space in the stack memory // Hence space complexity is not constant when using Recursion because of the function calls/Recursive calls.
//When we use iteration or when we run a for loop to print numbers from 1 to 10 -  space complexity = constant space complexity = O(1)  as irrespective of which number is being printed the whole for loop will occupy whole for loop will occupy only 1 part of the stack memory

// Recursion helps us in breaking down bigger problems into smaller problems

// Visualizing Recursion: by using Recursion Tree (also known as a recursive tree)
// How to check whether a problem can be solved using Recursion - see if the problem can be broken down into smaller problems, and when we write Recursion in the form of a formula like Big Problem =  SmallProblem1 + SmallProblem2 it is called as Recurrence Relation, so any Recursive solution you can convert into the form of a formula and that is known as Recurrence Relation, for example in case of Fibo numbers F(N) = F(N-1) + F(N-2) is the Recurrence Relation, basically when you write the Recursion in the form of a formula it is known as Recurrence Relation or any Recursive solution you can convert it into a formula and that formula is known as Recurrence Relation.
// also in the above example Fibo numbers F(N) = F(N-1) + F(N-2), in this RHS can further be broken down as F(N-1) = F(N-2) + F(N-3) & F(N-2) = F(N-3) + F(N-4) and so on......this will continue till we reach the known values i.e F(0) = 0 and F(1) = 1, this is known as the Base Condition or Base Condition is represented by the answers we already know/have so in this case base condition is values F(0) = 0 and F(1) = 1, so now we understood how to figure out base condition when we are using Recursion.


