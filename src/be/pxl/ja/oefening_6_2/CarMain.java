package be.pxl.ja.oefening_6_2;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("Diesel");
        car.start();

        //Car.Engine engine = car.new Engine();
        //engine.start();

        Car.Engine engine = new Car.Engine();
        engine.start("Benzine");
    }
}
