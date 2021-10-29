package pl.itechgroup.bank.exceptions;

import pl.itechgroup.bank.account.Person;

public class AccountNotFoundExeption extends Exception{
public Person person;

    public AccountNotFoundExeption(Person person) {
        this.person = person;
    }
}
