public class Shadowing {
    static int x = 90; // this will be shadowed at line 8
    //here in static int x = 90 , "x" is known as the class variable i.e here class variable x value is 90
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x; // the class variable at line 4 is shadowed by this
//        System.out.println(x); // scope will begin when value is initialised i.e scope here begins not at line 8 but from line 10
        x = 40; //here x = 40 is the local variable
        //x = x+1;
        System.out.println(x); // 40
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}