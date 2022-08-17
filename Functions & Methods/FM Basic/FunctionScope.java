

public class FunctionScope {
    public static void main(String[] args) {
        int a  = 10;
        int b  = 20;

        System.out.println(a); //able to access
        //System.out.println(num); //"num"  cannot be accessed inside main function/method as it belongs to random function/method
        // System.out.println(marks); //"marks"  argument does not belong to this function/method, it belongs to random or scope of marks is in random only
    }

    static  void random(int marks) {
        int num = 67;

        System.out.println(num); //able to access
        //1   //System.out.println(a);  //"a" cannot be accessed inside random function/method as it belongs to main function/method
        //2 Even true for arguments as well
        System.out.println(marks); //able to access

    }


}