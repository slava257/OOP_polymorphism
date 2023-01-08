package autoRacing;

import driver.Driver;

public class PassengerCars  extends Transport implements Competing {
    public PassengerCars(String brand, String model, float engineCapacity, Driver driver, String competing) {
        super(brand, model, engineCapacity, driver);
    }

    public PassengerCars(String brand, String model, float engineCapacity) {
        super(brand, model, engineCapacity);
    }

}


