package Chapter4.two;

import java.util.ArrayList;

/**
 * Created by ivnytska on 2/2/2016.
 */
public class Car {
    private String brand;
    private Engine engine;
    private int fuel;
    private ArrayList<Wheel> wheels = new ArrayList<Wheel>();
    private Wheel wheel1;
    private Wheel wheel2;
    private Wheel wheel3;
    private Wheel wheel4;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRestFuel(int restFuel) {
        this.fuel = restFuel;
    }

    public void setWheel1(Wheel wheel1) {
        this.wheel1 = wheel1;
    }

    public void setWheel2(Wheel wheel2) {
        this.wheel2 = wheel2;
    }

    public void setWheel3(Wheel wheel3) {
        this.wheel3 = wheel3;
    }

    public void setWheel4(Wheel wheel4) {
        this.wheel4 = wheel4;
    }

    public void refuel(int liters) {
        if (liters <= 0) {
            throw new IllegalArgumentException();
        }
        if (engine.isTurnedOn()) {
            System.out.println("- You engine is turned on. Before refuel you need to turn it off!");
            return;
        }
        if (engine.isTurnedOn() == false) {
            System.out.println("+ You engine is turned off. You car is ready to refuel!");
            fuel += liters;
            System.out.print(String.format("+ The car is filled up to " + liters + " litres,"));
            System.out.println(String.format(" there's " + fuel + " litres in the car totally"));
        }

        if (liters > engine.getVolume()) {
            int res = getEngine().getVolume() - fuel;
            System.out.println("- Max volume of your engine is " + engine.getVolume() + " liters! And you can refuel " + res + " to get full engine!");
            return;
        }

    }

    public void createAllWheels() {
        wheels.add(wheel1);
        wheels.add(wheel2);
        wheels.add(wheel3);
        wheels.add(wheel4);
    }

    public boolean checkForBrokenWheel() {
        boolean a = false;
        for (int i = 0; i < wheels.size(); i++) {
            if (wheels.get(i).getCondition() == false) {
                System.out.println("You've got a broken wheel, you need to change it!");
                a = true;
            } else a = false;
        }
        return a;
    }

    public boolean checkForRightRadius() {
        boolean b = false;
        for (int i = 0; i < wheels.size(); i++) {
            if (wheels.get(i).getRadius() != 28) {
                System.out.println("You've got wrong wheel № " + (int) (i + 1) + "! You need wheel with \"28 radius instead of " + wheels.get(i).getRadius() + " radius!");
                b = true;
            }
            else b = false;
        }
        return b;
    }

    public void move() {
        if (engine.isTurnedOn() == false) {
            System.out.println("- You engine is turned off. To run you need to turn it on!");
        } else {
            if (checkForBrokenWheel() == true) {
                System.out.println("Your car can not run because of the broken wheel!");
                return;
            }
            if (checkForRightRadius() == true) {
                System.out.println("Your car can not run because of wrong wheel radius!");
                return;
            }
            if (fuel == 1)
                System.out.println("+- The car is running, but there are less than 1 liters left! You should refuel!");
            if (fuel > 1 && fuel <= 5)
                System.out.println("+ Your car is full and it is running!");
            if (fuel == 0) {
                System.out.println("- The car can't run. There are no fuel left! You need to refuel!");
                return;
            }


        }
    }
//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("Car{");
//        sb.append("brand='").append(brand).append('\'');
//        sb.append(", fuel=").append(fuel);
//        sb.append(", engine=").append(engine);
//        sb.append('}');
//        return sb.toString();
//    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

//    public ArrayList<Wheel> getWheel() {
//        return wheels;
//    }
//
//    public void setWheel(ArrayList<Wheel> wheels) {
//        this.wheels = wheels;
//    }
}
