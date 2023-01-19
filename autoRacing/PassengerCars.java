package autoRacing;

import autoRacing.mechanic.Mechanic;
import driver.Driver;

import java.util.List;

//Задание 1
//В ранее реализованную модель для автомобильных гонок добавьте для каждой категории перечисления.
// Для каждого перечисления нужно определить аргументы и метод toString для вывода данных аргументов.
//Для класса «Легковых автомобилей» тип кузова:
//«Седан»,
//«Хетчбек»,
//«Купе»,
//«Универсал»,
//«Внедорожник»,
//«Кроссовер»,
//«Пикап»,
//«Фургон»,
//«Минивэн».
public class PassengerCars  extends Transport implements Competing {
    private BodyType bodyType;

    public PassengerCars(String brand, String model, float engineCapacity, BodyType bodyType) {
        super(brand, model, engineCapacity);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public enum BodyType {
        SEDAN("Седаен"), HATCHBACK("Хетчбек"), COUPE("Купе"), STATION_WAGON("Универсал"), SUV("Внедорожник"), CROSSOVER("Кроссовер"), PICKUP_TRUCK("Пикап"), VAN("Фургон"), MINIVAN("Минивэн");
        private String bodyName;

        BodyType(String bodyName) {
            this.bodyName = bodyName;
        }

        public String getBodyName() {
            return bodyName;
        }

        @Override
        public String toString() {
            return "BodyType{" +
                    "bodyName='" + bodyName + '\'' +
                    '}';
        }
    }

    public PassengerCars(String brand, String model, float engineCapacity, Driver driver, String competing) {
        super(brand, model, engineCapacity, driver);
    }

    public PassengerCars(String brand, String model, float engineCapacity) {
        super(brand, model, engineCapacity);

    }

    public void printType() {
        if (null != bodyType) {
            System.out.println(getBodyType());
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineCapacity=" + getEngineCapacity() +
                ", driver=" + getDriver() +
                ", competing='" + competing + '\'' +
                "PassengerCars{" +
                "bodyType=" + bodyType +
                ", competing='" + competing + '\'' +
                '}';
    }

    @Override
    public void passDiagnostics() {
        super.passDiagnostics();
    }


}


