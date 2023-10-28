package Interfaces;

public class NiceCar {
    private Engine engine;
//    private Engine engine = new PowerEngine(); //can put like this also directly in case you hide the below constructors/not provide constructors
    private Media player = new CDPlayer();

    public NiceCar() { //constructor
      //  engine = new ElectricEngine();
       engine = new PowerEngine();
    }

    public NiceCar(Engine engine) { //constructor
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
      //  player.stop();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }

}
