public class Main {
    public static void main(String[] args) {

        String a = "Kunal";
        String b = a; //b pointing to same object as a
        System.out.println(b);
        a = "Kushwaha"; //now a started pointing to new object
        System.out.println(b); //b still pointing to previous a object
        System.out.println(a); // and a pointing to new a object


    }
}