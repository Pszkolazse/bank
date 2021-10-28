package pl.itechgroup.bank.account;

import pl.itechgroup.bank.IInformation;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class User extends Person implements IInformation {
    protected String login, password;
    protected int id;

    public User(String imie, String nazwisko, String pesel, int wiek, int wzrost, String login, String haslo, int id) {
        super(imie, nazwisko, pesel, wiek, wzrost);
        this.login = login;
        this.password = haslo;
        this.id = id;
    }
    public User(String imie, String nazwisko, String pesel, int wiek, int wzrost, String login, String haslo) {
        super(imie, nazwisko, pesel, wiek, wzrost);
        this.login = login;
        this.password = haslo;
        this.id = GenerateRandom(0, 6000);
    }

    int GenerateRandom(int min, int max)
    {
        return ThreadLocalRandom.current().nextInt(min, max);
    }


    @Override
    public String getInfo() {
        return ("User {imie:"+this.imie+" nazwisko:"+this.nazwisko+
                " pesel:"+this.pesel+" wiek:"+this.wiek+
                " wzrost:"+this.wzrost+" login:"+this.login+
                " haslo:"+this.password+" id:"+this.id+"};");
    }
    @Override
    public String getInfo(boolean cleanNames) {
        return (cleanNames) ? (""+this.imie+" "+this.nazwisko+" "+this.pesel+" "+this.wiek+" "+this.wzrost+" "+this.login+" "+this.password+" "+this.id) :
                getInfo();
    }


    @Override
    public Account getAccount() {
        return new Account(this.login, this.password, "", this.id, 0f);
    }


}