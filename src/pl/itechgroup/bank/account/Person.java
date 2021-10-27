package pl.itechgroup.bank.account;

import pl.itechgroup.bank.IInformation;

public class Person implements IInformation {
    String imie, nazwisko, pesel;
    int wiek, wzrost;
    Account account;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Person(String imie, String nazwisko, String pesel, int wiek, int wzrost) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.wiek = wiek;
        this.wzrost = wzrost;
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public String getInfo()
    {
        return ("imie: "+this.imie+"  nazwisko: "+this.nazwisko+"  pesel: "+this.pesel+"  wiek: "+this.wiek+"  wzrost: "+this.wzrost);
    }
}
