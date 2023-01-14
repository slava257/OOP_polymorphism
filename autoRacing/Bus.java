package autoRacing;

public class Bus extends Transport implements Competing {
//А для автобусов добавьте классификацию с помощью перечислений по типу вместимости:
//
//особо малая (до 10 мест);
//малая (до 25);
//средняя (40–50);
//большая (60–80);
//особо большая (100–120 мест).

    public Bus(String brand, String model, float engineCapacity, Capacity capacity) {
        super(brand, model, engineCapacity);
        this.capacity = capacity;
    }

    public Bus(String brand, String model, float engineCapacity) {
        super(brand, model, engineCapacity);

    }

    private Capacity capacity;

    public enum Capacity {
        ESPECIALLY_SMALL(null, 10), SMALL(null, 25), AVARAGE(40, 50), BIG(60, 80), ESPECIALLY_BIG(100, 120);

        private Integer upperBound;
        private Integer lowerBound;

        Capacity(Integer upperBound, Integer lowerBound) {
            this.upperBound = upperBound;
            this.lowerBound = lowerBound;
        }

        Capacity(Integer lowerBound) {
            this.lowerBound = lowerBound;
            upperBound = null;
        }

        @Override
        public String toString() {
            if (upperBound == null) {
                return "вместимость до " + lowerBound +" мест";
            } else {
                return "Capacity{" +
                        "upperBound=" + upperBound +
                        ", lowerBound=" + lowerBound +
                        '}';
            }
        }

    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Bus.Capacity capacity) {
        this.capacity = capacity;

    }

    public void printType() {
        if (null == capacity) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getCapacity());
        }
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineCapacity=" + getEngineCapacity() +
                ", driver=" + getDriver() +
                "Bus{" +
                "capacity=" + capacity +
                ", competing='" + competing + '\'' +
                '}';
    }

    @Override
    public void passDiagnostics() {
        throw new UnsupportedOperationException(getBrand()+" не может проходить диагностику");
    }
}
