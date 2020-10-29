package be.pxl.ja.oefening_6_2;

public class Car {
    private Engine engine;
    private String fuel;

    public Car(String fuel) {
        engine = new Engine();
        this.fuel = fuel;
    }

    public void start() {
        //engine.start();
        engine.start(fuel);
    }

    public static class Engine {
        public void start(String fuel) {
            System.out.println("Engine started, fuel: " + fuel);
        }
    }
}
