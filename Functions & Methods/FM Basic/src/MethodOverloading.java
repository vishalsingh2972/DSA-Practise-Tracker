public class MethodOverloading {
    public static void main(String[] args) {
        //  fun(67); //method/function overloading happens at compile time, at compile time it is going to decide which function to run i.e function overloading at compile time decides which function to run.
        // fun("Vishal Singh");


        int ans = sum(3, 4, 43);
        System.out.println(ans);
    }

    static int sum(int a, int b) {
        return a + b;
    }


    static int sum(int a, int b, int c) {
        return a + b + c;
    }

//        static void fun(int a) {
//            System.out.println("first one");
//            System.out.println(a);
//        }
//
//        static void fun(String name) {
//            System.out.println("second one");
//            System.out.println(name);
//        }
}
