public class ReturningString {
    public static void main(String[] args) {//1
        String message =   greet();//2 ; //6
        System.out.println(message);//7
    }

    static String greet(){//3

        String greeting = "Kaise Ho ?";//4

        return greeting;//5
    }

}
