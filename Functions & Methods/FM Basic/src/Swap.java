public class Swap {
    public static void main(String[] args) {
        int a = 40;
        int b = 50;
        swap(a, b);
        System.out.println("a value is "+a);
        System.out.println("b value is "+b);
    }
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        //we are using primitive datatypes so only value is passed here,
        // hence making any changes here will not cause any change in the original values (present in main function above)
        b = temp;
        // this change will only be valid in this function scope only.
        System.out.println("a value is (inside swap) "+a);
        System.out.println("b value is (inside swap) "+b);
    }
}

//Normal code for Swap
/*
public class Swap {
    public static void main(String[] args) {
        int a = 40;
        int b = 50;
        //Swap Numbers
        int temp =  a;
        a = b;
        b = temp;
        System.out.println("a new value is "+ a);
        System.out.println("b new value is "+b);
    }
}
*/

//Non-Primitive Example passing
//    String name = "Kunal Kushwaha";
//    changeName(name);
//        System.out.println(name);
//                }
//
//static void changeName(String naam) {
//        naam = "Rahul Rana"; // creating a new object
// here change made in naam did not reflect in name as here we are not changing the existing object "Kunal Kushwaha", we are creating a new object "Rahul Rana"
//        }
