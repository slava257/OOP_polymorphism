package autoRacing.mechanic;

import autoRacing.Bus;
import autoRacing.PassengerCars;
import autoRacing.Transport;
import autoRacing.Trucks;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Задание 2
//Добавьте новый класс «Станция техобслуживания», в которой реализована очередь из авто. Кроме этого, в классе есть методы «добавить авто в очередь» и «провести техосмотр авто».
//
//Напомним, что автобусы не нуждаются в техобслуживании перед заездом, поэтому они в очередь не встают.
//
//Каждый новый объект становится в конец очереди на техобслуживание. Как только машина проходит техобслуживание, она должна из очереди удаляться.
public  class ServiceStation <T extends Transport>{
     static Queue<Transport> transportsQ= new LinkedList<>();

    PassengerCars audiA8 = new PassengerCars("Audi", "A8 L TDI quattro", 3.0f);
    PassengerCars BMWZ8 = new PassengerCars("BMW", "Z8", 3.0f);
    PassengerCars kiaSportage = new PassengerCars("Kia", "Sportage 4-го поколения", 2.4f);
    PassengerCars hyundaiAvante = new PassengerCars("Hyundai", "Avante", 1.6f, PassengerCars.BodyType.SEDAN.SEDAN.SEDAN);

    Trucks mercedesBenz = new Trucks("Mercedes-Benz", "Atego", 9.0f);
    Trucks iveco = new Trucks("IVECO", "Daily", 9.6f, Trucks.LoadCapacity.N3);
    Trucks kamaz = new Trucks("KAMAZ", "4326-9", 10.8f);
    Trucks volvo = new Trucks("Volvo", "FMX 8x4", 10.2f);



    public static void ofc(Transport transport) {
        transportsQ.add( transport);
        System.out.println(transportsQ);


    }

    public static void conductATechnicalInspection(Transport transport) {

           transportsQ.remove(transport);
            transportsQ.peek();
            System.out.println(transportsQ);
            System.out.println("провести техосмотр авто " + transport.getBrand());
        }

    @Override
    public String toString() {
        return "ServiceStation{" +
                "audiA8=" + audiA8 +
                ", BMWZ8=" + BMWZ8 +
                ", kiaSportage=" + kiaSportage +
                ", hyundaiAvante=" + hyundaiAvante +
                ", mercedesBenz=" + mercedesBenz +
                ", iveco=" + iveco +
                ", kamaz=" + kamaz +
                ", volvo=" + volvo +
                '}';
    }
}
