package pl.itechgroup.bank;

import pl.itechgroup.bank.account.*;
import pl.itechgroup.bank.currency.*;

public class Main {
    public static void main(String[] args) {
        Currency zlote = new Currency("złote","zł",2.5, 3.99);
        Currency dolar = new Currency("dolar","$", 1.5, 1.00);
        Currency bitCoin = new Currency("bitcoin","B", 1, 0.000016336132257326755);
        Currency koronaCZ = new Currency("korona czeska","Kć", 0, 22.18);

        Currency.exchangeCurrency(bitCoin, zlote);
        System.out.println(dolar);
        System.out.println(zlote);
        System.out.println(bitCoin);
        System.out.println(koronaCZ);
    }
}