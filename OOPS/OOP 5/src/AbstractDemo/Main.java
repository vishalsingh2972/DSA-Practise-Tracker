package AbstractDemo;

public class Main {
    public static void main(String[] args) {

        Son son = new Son(50); //creating object of child class and calling child class constructor
//        son.career();
//        son.partner();
        System.out.println(son.age);

        System.out.println();

        Daughter daughter =  new Daughter(40); //creating object of child class and calling child class constructor
//        daughter.career();
//        daughter.partner();
        System.out.println(daughter.age);

        Parent.hello(); //calling static via parent name (the class name) , usual convention

        son.normal();

        //Though we cannot an object of an abstract parent class, we can use it as a reference variable ( ~ Although abstract classes cannot be used to instantiate objects, they can be used to create object references, because Java’s approach to run-time polymorphism is implemented through the use of superclass references(what it can access depends on left side part and which one it is accessing/will access will depend on right side part---Dynamic polymorphism concept OOP 3-Polymorphism-Main.java)
        Parent daughter2 =  new Daughter(15);
        System.out.println(daughter2.age);
    }
}




