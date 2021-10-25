package pl.itechgroup.bank;

public class Person {
    String imie, nazwisko, pesel;
    int wiek, wzrost;

    public Person(String imie, String nazwisko, String pesel, int wiek, int wzrost) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.wiek = wiek;
        this.wzrost = wzrost;
    }

    public void getInfo()
    {
        System.out.println("imie: "+this.imie+"  nazwisko: "+this.nazwisko+"  pesel: "+this.pesel+"  wiek: "+wiek+"  wzrost: "+wzrost);
    }
}
