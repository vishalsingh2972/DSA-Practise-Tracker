package staticExample;

public class Human {
    int age;
    String name;

    static long population;

    public Human(int age, String name){
        this.age = age;
        this.name = name;
        //System.out.println(Human.population);
        Human.population = Human.population + 1;

    }


}

