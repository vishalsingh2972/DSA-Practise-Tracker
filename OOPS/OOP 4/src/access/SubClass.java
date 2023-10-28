package access;

import ObjectClass.ObjectDemo;

//child class of Parent Class A in same package
public class SubClass extends A {
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(45, "Kunal Kushwaha");
        int n = obj.num; //when num is protected type
//        System.out.println(n);


        //InstanceOf Operator
//        System.out.println(obj instanceof A); //True as obj belongs to/ is an instance of SubClass which is a cc of A, hence indirectly obj is also an instance of pc A
//        System.out.println(obj instanceof SubClass);
        System.out.println(obj instanceof Object); //True as every object is an instance of Object Class
    }
}