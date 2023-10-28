import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args) {
//        fun();
        multiple(2, 3, "Kunal", "Rahul", "dvytsbhusc","all strings only now");
        //demo(4,6,8,6);
        demo("Vishal", "Singh", "JAVA");
        //demo();
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) //Variable length Arguments should always come in the end of all arguments
    {

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
