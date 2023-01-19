package autoRacing;

import autoRacing.mechanic.Mechanic;
import driver.Driver;
import driver.DriverB;
import driver.DriverC;
import driver.DriverD;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
//Задание 1
//Напишем приложение для автогонок. За основу структуры классов и данных возьмите предыдущую реализацию с классом Transport и наследниками, дополнив его новыми вводными.
//
//Все параметры и методы, которые не указаны в текущем задании, закомментируйте или удалите.
//
//В наших автогонках могут участвовать следующие виды авто, для каждого из которых нужно создать отдельный класс:
//
//легковые автомобили,
//грузовые автомобили,
//автобусы.
//Все авто всех трех групп имеют параметры:
//
//«Марка»,
//«Модель»,
//«Объем двигателя».
//Также все авто имеют:
//
//метод «начать движение»,
//метод «закончить движение».
public abstract class Transport<T extends Driver> implements Competing {
    private String brand;
    private String model;
    private float engineCapacity;
    private Driver driver;
    private List<Mechanic<Transport>> mechanics = new ArrayList<>();
    Mechanic<PassengerCars> slava = new Mechanic<>("Slava Ivanov", "OTS");
    Mechanic<Trucks> oleg = new Mechanic<>("Oleg Semenov", "Bi-Bi");
    Mechanic<Bus> sasha = new Mechanic<>("Saha Fedorov", "EA");


    public Transport(String brand, String model, float engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;

    }

    public Transport(String brand, String model, float engineCapacity, Driver driver) {
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.driver = driver;

    }


    public void movementsToStart() {
        System.out.println("начать движение " + getBrand());
    }

    public void movementsFinish() {
        System.out.println("закончить движение " + getBrand());

    }

    String competing = "уходи на пит стоп";

    @Override
    public String competingPitStop(int lap) {
        if (lap % 3 == 0) {
        }
        return competing;
    }

    @Override
    public void CompetingBestLapTime(int lap) {
        float[] lapTime = new float[lap];
        for (int i = 0; i < lapTime.length; i++) {
            lapTime[i] = (float) (10 + (Math.random() * (11 - 10)));
            System.out.print("Время каждого круга " + lapTime[i] + " минут ");
        }
        System.out.println();
        float bestLapTime = lapTime[0];
        for (int i = 0; i < lapTime.length; i++) {
            if (bestLapTime > lapTime[i]) {
                bestLapTime = lapTime[i];
            }
        }

        System.out.println("лучший круг " + bestLapTime);
    }

    @Override
    public void CompetingMaximumSpeed(int lap) {
        int[] Speed = new int[lap];
        for (int i = 0; i < Speed.length; i++) {
            Speed[i] = (int) (180 + (Math.random() * (210 - 200)));
            System.out.print(" скорость кругов " + Speed[i] + " км ");
        }
        System.out.println();
        int MaximumSpeed = Speed[0];
        for (int i = 0; i < Speed.length; i++) {
            if (MaximumSpeed < Speed[i]) {
                MaximumSpeed = Speed[i];
            }
        }
        System.out.println(" лучшая скорость круга " + MaximumSpeed);
    }

    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
    }

    public List<Mechanic<Transport>> getMechanics() {
        return mechanics;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        if (engineCapacity <= 0) {
            this.engineCapacity = 1.5f;
        } else {
            this.engineCapacity = engineCapacity;
        }
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Float.compare(transport.engineCapacity, engineCapacity) == 0 && brand.equals(transport.brand) && model.equals(transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineCapacity);
    }

    //Задание 2
//В каждый класс транспортного средства необходимо добавить поле, которое содержит его тип,
// а также геттер и сеттер для этого поля, причем в разных классах транспортных средств будут разные типы.
//В абстрактный класс Transport нужно добавить абстрактный метод printType,
// который выводит в консоль значение типа транспортного средства,
// или если тип транспортного средства не указан,
// то строку вида "Данных по транспортному средству недостаточно".
    public abstract void printType();


    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", driver=" + driver +
                ", competing='" + competing + '\'' +" механик "+mechanics+
                '}';
    }

    public void passDiagnostics() {
        System.out.println(getBrand() + " Нужно проити диагностику");
    }



}