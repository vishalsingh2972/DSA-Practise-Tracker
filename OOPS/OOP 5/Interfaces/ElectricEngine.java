package Interfaces;
//creating separate classes for each interface (like here class ElectricEngine only implements interface Engine)
public class ElectricEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Electric engine start");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stop");
    }

    @Override
    public void acc() {
        System.out.println("Electric engine accelerate");
    }
}
