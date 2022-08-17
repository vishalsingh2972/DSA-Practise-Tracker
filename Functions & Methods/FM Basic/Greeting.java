public class Greeting {
    public static void main(String[] args) {
        greeting(); //1
        System.out.println("Recieved");//3
    }
    static void greeting(){
        System.out.println("Hello");//2
    }
}