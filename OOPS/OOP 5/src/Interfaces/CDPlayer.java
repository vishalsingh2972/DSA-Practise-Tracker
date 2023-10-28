package Interfaces;
//creating separate classes for each interface (like here class CDPlayer only implements interface Media)
public class CDPlayer implements Media{

    @Override
    public void start() {
        System.out.println("Music start");
    }

    @Override
    public void stop() {
        System.out.println("Music stop");
    }
}
