package AbstractDemo;

public class Son extends Parent{
//    public class Son extends Parent, Parent2 { //Multiple Inheritances is not supported in Abstract Classes (Not Possible)
    public Son(int age) { //child class constructor
        super(100); //we cannot create objects of PC(as it is abstract class), so we cannot call constructor of PC directly, but we can call PC constructor indirectly via the CC constructor using super keyword in the CC constructor (like used here)
//        System.out.println(age);
        this.age = age;
    }

    @Override //overriding a normal method present in the abstract class(= here parent class)
    void normal() {
        super.normal();
        System.out.println("this is a normal constructor but in the child class");
    }

    @Override
    void career() {
        System.out.println("I am trying to be a Doctor ");
    }

    @Override
    void partner() {
        System.out.println("I love Radha");
    }
}
