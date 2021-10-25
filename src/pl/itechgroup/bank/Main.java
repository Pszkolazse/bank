package pl.itechgroup.bank;

import pl.itechgroup.bank.vehicles.Car;



import static pl.itechgroup.bank.vehicles.Truck.honk;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        byte a;
        short b;
        int c;
        long d;
        Date data = new Date(2021,10,25);
        Integer zmienna =  new Integer(21);
        Seasons seasons;
        seasons = Seasons.SPRING;
        System.out.println(seasons);
        Data data1 = new Data();
        data1.dzien = 22;
        Car samochod = new Car(5.5, "edf58s5", "123549");
        samochod.drive();
        honk();
        pl.itechgroup.bank.gps.Car car1 = new pl.itechgroup.bank.gps.Car();

    }

    private static class Data
    {
        int dzien, miesiac, rok;
    }

    enum Seasons {WINTER, SPRING, SUMMER, FALL}


}
