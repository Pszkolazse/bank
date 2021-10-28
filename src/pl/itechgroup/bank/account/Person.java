package pl.itechgroup.bank.account;

import pl.itechgroup.bank.IInformation;

import java.util.concurrent.atomic.AtomicInteger;

public class Person implements IInformation {
    String imie, nazwisko, pesel;
    int wiek, wzrost;
    Account account;

    protected static final Account DEFAULT_ACCAUNT;
    protected static AtomicInteger ID_GENERATOR = new AtomicInteger(1);
    
    static {
        DEFAULT_ACCAUNT = new Account("", "","",0,0);
    }

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
        this.account = DEFAULT_ACCAUNT;
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public String getInfo()
    {
        return ("imie: "+this.imie+"  nazwisko: "+this.nazwisko+"  pesel: "+this.pesel+"  wiek: "+this.wiek+"  wzrost: "+this.wzrost);
    }

    public String getInfo(boolean cleanNames) {
        return (cleanNames) ? (""+this.imie+" "+this.nazwisko+" "+this.pesel+" "+this.wiek+" "+this.wzrost) :
                getInfo();
    }
}
