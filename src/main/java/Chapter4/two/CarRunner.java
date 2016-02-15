package Chapter4.two;

import java.util.ArrayList;

/**
 * Created by ivnytska on 2/2/2016.
 */
public class CarRunner {

    public static void main(String[] args) {
        Car car = makeNewCar();
        System.out.println(car.toString());
        car.getEngine().turnOff();
        car.refuel(3);
        car.getEngine().turnOn();
        car.move();

        car.createAllWheels();
        car.checkForRightRadius();
        car.checkForBrokenWheel();

    }

    private static Car makeNewCar() {
        Car car = new Car();
        car.setBrand("Toyota");
        car.setRestFuel(0);
        Engine engine = new Engine(5, "oil", true);
        car.setEngine(engine);

        car.setWheel1(new Wheel(28, true));
        car.setWheel2(new Wheel(28, true));
        car.setWheel3(new Wheel(28, false));
        car.setWheel4(new Wheel(28, true));

        return car;
    }
}
