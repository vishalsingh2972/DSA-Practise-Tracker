package Interfaces;

public interface Engine {

    static final int PRICE = 78000; // here "static final" is already grey/blurred out as java is like hey you didn't had to write/mention static and final, internally it is automatically taking it as final and static by default----so modifiers Static and Final are redundant here/extra/not required

    void start();
    void stop();
    void acc();
}
