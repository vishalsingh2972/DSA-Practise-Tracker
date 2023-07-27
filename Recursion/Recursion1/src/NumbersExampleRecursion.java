public class NumbersExampleRecursion {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first 5 numbers: 1 2 3 4 5

        print(1);
    }

    static void print(int n){ //print() function

        if(n == 5){
            System.out.println(n);
            return; // return statement here will return to the caller of the function that it is present in (i.e. here return; is present in/inside print() function), which is the print(1) line.
        }

        System.out.println(n);
        print(n+1);
    }

}

// a function that calls itself is Recursion