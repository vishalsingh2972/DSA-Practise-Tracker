package Polymorphism;

public class Shapes {
    void area() {
        System.out.println("I am in Shapes");
    }

//Early Binding & Late Binding (check notes for detailed exp. )
//    Normally, Java resolves calls to methods dynamically, at run time. This is called late binding. However, since final
//    methods cannot be overridden, a call to one can be resolved at compile time. This is called early binding.
// final void area(){
//    System.out.println("I am in Shapes");
//  }

}
