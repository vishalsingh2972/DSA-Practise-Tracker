package Interfaces;

public class Car implements Engine, Brake, Media {
//    public class Car implements Brake, Engine { //in this first it will take Brake methods then Engine ke methods (hide all override and check redline right click)
    @Override
    public void brake() {
        System.out.println("I brake like a normal Car");
    }

    @Override
    public void start() { //Both Engine and Brake have start(), so which one will the car.java class start() method override, it actually does not care/it does not matter which one it is overriding as it is providing its own body after overriding
        System.out.println("I start engine like a normal Car"); //it is providing its own body, so it does not care which one it is overriding; it is just overriding we know that
    }

    @Override
    public void stop() {
        System.out.println("I stop engine like a normal Car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a normal Car");
    }


}



