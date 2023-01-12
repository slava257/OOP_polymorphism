package autoRacing;

import driver.Driver;
//Для грузовых автомобилей добавьте перечисления по типу грузоподъемности:
//N1 (с полной массой до 3,5 тонн);
//N2 (с полной массой свыше 3,5 до 12 тонн);
//N3 (с полной массой свыше 12 тонн);
public class Trucks extends Transport implements Competing {
    private LoadCapacity loadCapacity;

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public enum LoadCapacity {
        N1(null, 3.5f),
        N2(3.5f, 12f),
        N3(12f, null);
        private Float upperBound;
        private Float lowerBound;


        LoadCapacity(Float upperBound, Float lowerBound) {
            this.upperBound = upperBound;
            this.lowerBound = lowerBound;


        }

        public String toString() {
            if (upperBound == null) {
                return "до " + lowerBound + " тонн";
            } else if (lowerBound == null) {
                return "от " + upperBound + " тонн";
            } else {
                return "LoadCapacity{" +
                        "upperBound=" + upperBound +
                        ", lowerBound=" + lowerBound +
                        '}';
            }
        }
    }

    public Trucks(String brand, String model, float engineCapacity, LoadCapacity loadCapacity) {
        super(brand, model, engineCapacity);
        this.loadCapacity = loadCapacity;
    }

    public Trucks(String brand, String model, float engineCapacity) {
        super(brand, model, engineCapacity);


    }

    public Trucks(String brand, String model, float engineCapacity, Driver driver) {
        super(brand, model, engineCapacity, driver);
    }

    public void printType() {
        if (null == loadCapacity) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getLoadCapacity());
        }
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineCapacity=" + getEngineCapacity() +
                ", driver=" + getDriver() +
                "Trucks{" +
                "loadCapacity=" + loadCapacity +
                ", competing='" + competing + '\'' +
                '}';
    }
}
