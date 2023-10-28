package access2;
//child class of Parent Class A in other package (cc of pc, where cc present in another package can access protected present in pc)
import access.A;
public class SubClass extends A {
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(451, "Kunal Kushwaha");
        int n = obj.num; //cc of A so can access protected num in pc A
        //System.out.println(n);

        //Trying to access protected num in different package via pc, hence error
//        A obj = new SubClass(451, "Kunal Kushwaha");
//        System.out.println(obj.num); //error, as num is protected, so when in a different package it can only be accessed when we are accessing it with a cc, here we are trying to access it with a pc hence error

        //Trying to access protected num in different package via cc, hence no error
//        SubClass obj = new SubClass(451, "Kunal Kushwaha");
//        System.out.println(obj.num); //here num is protected and we are trying to access it in another package via the cc, hence no error

        //Trying to access public name in different package , can be accessed through both (via cc and pc), no error in both cases
//        A obj = new SubClass(451, "Kunal Kushwaha"); //accessing public name via pc---> no error
//        //SubClass obj = new SubClass(451, "Kunal Kushwaha"); //accessing public name via cc---> no error
//        System.out.println(obj.name);// will be accessible only when name is declared public
    }
}



//cc of cc SubClass
class SubSubClass extends SubClass {
    public SubSubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubClass obj = new SubSubClass(452, "CHOTA KUNNU"); //only cc of A can access it here, as num is protected. Hence SubClass can access num here
        int n = obj.num; //cc of cc of A, so can access protected num in pc A
        //System.out.println(n);
    }
}



//Another cc of pc A
class SubClass2 extends A {
    public SubClass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass2 obj = new SubClass2(453, "DUSRA KUNNU");
        int n = obj.num; //Another cc of pc present in another package, so similar to cc [SubClass extends A], even this can access protected
        //System.out.println(n);
    }
}