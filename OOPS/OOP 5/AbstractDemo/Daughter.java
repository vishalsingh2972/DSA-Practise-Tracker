package AbstractDemo;

public class Daughter extends Parent{
    public Daughter(int age) { //child class constructor
        super(200);
       // this.age = age;
    }

    @Override
    void career() {
        System.out.println("I am going to be an Actress");
    }

    @Override
    void partner() {
        System.out.println("I love Krishna");
    }
}
