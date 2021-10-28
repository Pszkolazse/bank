package pl.itechgroup.bank;

import pl.itechgroup.bank.account.*;

public class Main {
    public static void main(String[] args) {
        Person person = new User("Piotr", "B","9231751113",17,170,"pfjnnnn", "pficnad");
        System.out.println(person.getInfo(false));
        System.out.println("------------");
        System.out.println(person.getAccount());
    }
}