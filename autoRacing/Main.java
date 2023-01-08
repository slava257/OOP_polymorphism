package autoRacing;

import driver.Driver;
import driver.DriverB;
import driver.DriverC;
import driver.DriverD;

public class Main {

    public static void main(String[] args) {
        PassengerCars audiA8 = new PassengerCars("Audi","A8 L TDI quattro", 3.0f);
        PassengerCars BMWZ8 = new PassengerCars("BMW","Z8",3.0f);
        PassengerCars kiaSportage =new PassengerCars("Kia","Sportage 4-го поколения",2.4f);
        PassengerCars hyundaiAvante = new PassengerCars("Hyundai","Avante",1.6f);

        Bus mercedes = new Bus("Mercedes","Sprinter",2.0f);
        Bus volkswagen = new Bus("Volkswagen","Crafter",2.4f);
        Bus renault = new Bus("Renault","Trafic",2.8f);


        Trucks mercedesBenz = new Trucks("Mercedes-Benz","Atego",9.0f);
        Trucks iveco = new Trucks("IVECO","Daily",9.6f);
        Trucks kamaz = new Trucks("KAMAZ","4326-9",10.8f);
        Trucks volvo = new Trucks("Volvo","FMX 8x4",10.2f);
        printInfoBus(kamaz);
        volvo.competingPitStop(4);
        volvo.CompetingBestLapTime(4);
        printInfoBus(volvo);
        audiA8.CompetingMaximumSpeed(3);

        DriverB schumacher = new DriverB("Michael Schumacher","B",15);
        DriverC shibalov = new DriverC("Anton Shibalov","C",19);
        DriverD karginov = new DriverD("Andrey Karginov","D",25);

        Driver<PassengerCars> michael =new Driver<>("Michael Schumacher","B",15);
        michael.toDriver(BMWZ8);
        Driver<Trucks> anton = new Driver<>("Anton Shibalov", "C", 19);
        anton.toDriver(iveco);
        Driver<Bus> andrey = new Driver<>("Andrey Karginov", "D", 25);
        andrey.toDriver(mercedes);
    }
    private static void printInfoBus(Trucks trucks){
        System.out.println(trucks);
    }

    }
