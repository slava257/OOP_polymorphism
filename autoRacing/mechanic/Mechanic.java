package autoRacing.mechanic;

import autoRacing.Transport;
import driver.Driver;
//Задание 1
//Продолжим работать с нашим приложением для автогонок.
//
//Создайте список всех автомобилей, которые участвуют в автогонке. По нашей логике, в гонках участвуют объекты всех классов: «Легковые автомобили», «Грузовые автомобили» и «Автобусы».
//Каждый автомобиль проходит техобслуживание, поэтому у него есть команда механиков. Создайте в классе Transport список механиков.
//Создайте новый класс механик с параметрами:
//
//имя и фамилия;
//компания, в которой он работает;
//Методы:
//
//«провести техобслуживание»,
//«починить машину».
//Один механик может работать с несколькими машинами.
//
//3. Напишите программу, с помощью которой можно узнать, как зовут водителя авто, какие механики у нее есть.
public class Mechanic<T extends Transport > {
    private String lastNameFirstName;
    private String company;
    private Transport transport;
    private Driver driver;
    public Mechanic(String lastNameFirstName, String company) {
        this.lastNameFirstName = lastNameFirstName;
        this.company = company;
    }

    public String getLastNameFirstName() {
        return lastNameFirstName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setLastNameFirstName(String lastNameFirstName) {
        this.lastNameFirstName = lastNameFirstName;
    }

    public void performMaintenance(T transport, int distance) {
        if (distance % 300 == 0) {
            System.out.println("у автомобиля "+transport.getBrand()+ " требуется провести техобслуживание");
        } else if (distance % 900 == 0) {
            System.out.println("автомобиля "+transport.getBrand()+" требуется починить машину");
        }
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "lastNameFirstName='" + lastNameFirstName + '\'' +
                ", company='" + company + '\'' +

                '}';
    }


    public void info(Driver driver) {
        System.out.println("Водитель "+driver.getLastNameFirstNamePatronymic()+ " которого обслуживает миханик " +getLastNameFirstName());
    }

}
