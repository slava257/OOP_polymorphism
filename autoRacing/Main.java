package autoRacing;

import driver.Driver;
import driver.DriverB;
import driver.DriverC;
import driver.DriverD;

public class Main {

    public static void main(String[] args) throws UnsuitableDriverLicenseException {
        PassengerCars audiA8 = new PassengerCars("Audi","A8 L TDI quattro", 3.0f);
        PassengerCars BMWZ8 = new PassengerCars("BMW","Z8",3.0f);
        PassengerCars kiaSportage =new PassengerCars("Kia","Sportage 4-го поколения",2.4f);
        PassengerCars hyundaiAvante = new PassengerCars("Hyundai","Avante",1.6f, PassengerCars.BodyType.SEDAN.SEDAN.SEDAN);

        Bus mercedes = new Bus("Mercedes","Sprinter",2.0f);
        Bus volkswagen = new Bus("Volkswagen","Crafter",2.4f, Bus.Capacity.AVARAGE);
        Bus renault = new Bus("Renault","Trafic",2.8f);


        Trucks mercedesBenz = new Trucks("Mercedes-Benz","Atego",9.0f);
        Trucks iveco = new Trucks("IVECO","Daily",9.6f, Trucks.LoadCapacity.N3);
        Trucks kamaz = new Trucks("KAMAZ","4326-9",10.8f);
        Trucks volvo = new Trucks("Volvo","FMX 8x4",10.2f);
        printInfoBus(iveco);
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
        iveco.printType();
        passDiagnostics(mercedesBenz,iveco,mercedes);
        changeYourDriverLicense(schumacher,shibalov);
    }
    private static void printInfoBus(Trucks trucks){
        System.out.println(trucks);
    }
    //Задание 1
    //Вернемся к нашему приложению автогонок.
    //
    //Добавьте в класс Transport метод «Пройти диагностику».
    //Переопределите данный метод для классов «Легковые автомобили» и «Грузовые автомобили» —
    // объекты данных типов могут проходить диагностику. Объекты класса «Автобусы» диагностику проходитьне могут.
    //Необходимо создать собственное исключение, которое будет выбрасываться в случае если у водителя
    // не указан тип водительских прав или категория прав неверна. Вместе с исключением должно появляться
    // сообщение “Необходимо указать тип прав!”.
    //Реализуйте обработку исключения с помощью одной из конструкций - try catch или try with resources.

    public static void passDiagnostics(Transport... transports) {
        for (Transport transport : transports) {
            try {
                transport.passDiagnostics();
            }catch(UnsupportedOperationException e){
                System.out.println("ошибка");
                System.out.println(e.getMessage());
            }
        }
    }

    public static void changeYourDriverLicense(Driver... drivers) {
        for (Driver driver : drivers) {
            try {
                driver.changeYourDriverLicense();
            } catch (UnsuitableDriverLicenseException e) {
                System.out.println("Ошибка");
                System.out.println(e.getMessage());
            }
        }
        }
    }