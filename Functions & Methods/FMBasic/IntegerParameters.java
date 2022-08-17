package FMBasic;

public class IntegerParameters {
    public static void main(String[] args) {


        int ans = sum3(70, 50);//1 ; //5
        System.out.println(ans);//6
    }
    // pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b) {//2
        int sum = a + b;//3
        return sum;//4
    }
}
