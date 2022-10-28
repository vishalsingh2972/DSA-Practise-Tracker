package staticExample;

public class Main {
    public static void main(String[] args) {

        Human kunal = new Human(22, "kunal");
        //System.out.println(kunal.population);
        Human Rahul = new Human(23, "rahul");
        //Human Anaez = new Human(24, "anaez");

        System.out.println(Human.population);//right convention (accessing static variable via class name)
        System.out.println(kunal.population);//right convention (accessing static variable via reference variable / object name)
        System.out.println(Rahul.population);//right convention (accessing static variable via reference variable / object name)

    }
}

