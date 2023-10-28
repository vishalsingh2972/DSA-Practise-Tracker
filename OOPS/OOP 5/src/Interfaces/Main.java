package Interfaces;

public class Main {
    public static void main(String[] args) {

//        Engine car = new Engine() //not possible as we cannot create objects of abstract class, interfaces are by default public and abstract; so here Engine.java, Brake.java, Media.java are by default public and abstract

//        Car car = new Car();
//        Engine car = new Car(); // same output as  Car car = new Car(); Dynamic Method Dispatch concept (as we saw in OOP 3 ---> Runtime/Dynamic Polymorphism topic) i.e. right side part will determine which will be called/executed at runtime
                                                                                                         // it is the type of the object being referred to (not the type of the reference variable) that determines which version of an overridden method will be executed.
//        car.acc(); // at runtime java will look at right side part (here new Car()) and determine which method will be called
//        car.start();
//        car.stop();
        //Media carMedia = new Car();
        //carMedia.stop();

        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine(); //without creating a new object we are able to change just the part of the Engine(without causing any effecting or change in Brake and Music, like in above carMedia.stop() stopping the CD player was stopping the entire car)
        car.start();





    }
}
