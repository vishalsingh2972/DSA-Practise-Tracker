package Interfaces;
//creating separate classes for each interface (like here class PowerEngine only implements interface Engine)
public class PowerEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Power engine start");
    }

    @Override
    public void stop() {
        System.out.println("Power engine stop");
    }

    @Override
    public void acc() {
        System.out.println("Power engine accelerate");
    }
}
