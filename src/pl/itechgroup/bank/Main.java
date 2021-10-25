package pl.itechgroup.bank;


import java.awt.*;
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

    }

    private static class Data
    {
        int dzien, miesiac, rok;
    }

    enum Seasons {WINTER, SPRING, SUMMER, FALL}

}
