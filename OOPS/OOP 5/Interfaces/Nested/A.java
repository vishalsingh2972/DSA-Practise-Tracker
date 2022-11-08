package Interfaces.Nested;

public class A {
    //Nested Interface : An interface can be declared a member of a class or another interface. Such an interface is called a member interface or a nested interface.
    public interface NestedInterface { // A nested interface can be declared as public, private, or protected. This differs from a top-level interface, which must either be declared as public or use the default access level.
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface { //A.NestedInterface means inside A there is a NestedInterface
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
