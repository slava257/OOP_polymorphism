package driver;

import autoRacing.Competing;
import autoRacing.Transport;

//Задание 4
//Создайте класс «Водитель», который будет иметь следующие параметры:
//
//«ФИО» водителя,
//«Наличие водительских прав»,
//«Стаж».
//Также все водители имеют:
//
//метод «начать движение»,
//метод «остановиться»,
//метод «заправить авто».
//Водители будут отличаться друг от друга по типу водительских прав (соответственно, это три разных класса):
//
//для легковых авто нужна категория В;
//для грузовых нужна категория С;
//для автобусов — D.
//Водитель с определенным типом водительских прав может управлять только одним авто в выбранной категории. Управлять авто других категорий в наших соревнованиях он не может. В классах авто в качестве дженериков указать класс водителя с определенной водительской категорией.
//
//Напишите приложение, которое выводит в консоль информацию в формате:
//
//"водитель А управляет автомобилем Б и будет участвовать в заезде".
//
//На платформу в качестве выполненного задания пришлите ссылку на pull-request вашего проекта в GitHub.
public class Driver < T extends Transport & Competing> {
    private String lastNameFirstNamePatronymic;
    private String driverLicense;
    private int experience;

    public Driver(String lastNameFirstNamePatronymic, String driverLicense, int experience) {
        this.lastNameFirstNamePatronymic = lastNameFirstNamePatronymic;
        this.driverLicense = driverLicense;
        this.experience = experience;
    }


    public void movementsToStart() {
        System.out.println("начать движение");
    }

    public void movementsFinish() {
        System.out.println("закончить движение");

    }

    public void refuel() {
        System.out.println("Заправить авто");

    }

    public String getLastNameFirstNamePatronymic() {
        return lastNameFirstNamePatronymic;
    }

    public void setLastNameFirstNamePatronymic(String lastNameFirstNamePatronymic) {
        if (lastNameFirstNamePatronymic == null || lastNameFirstNamePatronymic.isEmpty() || lastNameFirstNamePatronymic.isBlank()) {
            this.lastNameFirstNamePatronymic = "default";
        } else {
            this.lastNameFirstNamePatronymic = lastNameFirstNamePatronymic;
        }
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience <= 0) {
            this.experience = 1;
        } else {
            this.experience = experience;
        }
    }

    @Override
    public String toString() {
        return
                "lastNameFirstNamePatronymic='" + lastNameFirstNamePatronymic + '\'' +
                ", driverLicense='" + driverLicense + '\'' +
                ", experience=" + experience +
                '}';
    }

    public void toDriver(T transport) {
        System.out.println("Водитель " + getLastNameFirstNamePatronymic() + " упровляет автомабилем " +transport.getBrand()+ " и будет участвовать в заезде. ");

    }

}