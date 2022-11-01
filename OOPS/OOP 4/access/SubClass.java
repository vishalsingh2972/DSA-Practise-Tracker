package access;
//child class of Parent Class A in same package
public class SubClass extends A {
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(45, "Kunal Kushwaha");
        int n = obj.num; //when num is protected type
        System.out.println(n);
    }
}