package pl.itechgroup.bank;

import pl.itechgroup.bank.account.Account;
import pl.itechgroup.bank.account.Person;
import pl.itechgroup.bank.account.Transfer;
import pl.itechgroup.bank.account.TransferService;
import pl.itechgroup.bank.exceptions.AccountNotFoundExeption;

public class Main {
    public static void main(String[] args) {

        Person p1 =  new Person("Piotr","B","23485963",19, 176);
        p1.setAccount(new Account("Person blog", "66f5sdf58s", "plogb@pocz.com", 55541, 55.6f));
        Person p2 = new Person("Mateusz", "K", "56659224", 22, 177);
        //p2.setAccount(new Account("mammaK", "+5edf.#$%", "matkom@gmail.com", 54166, 115.9f));

        Transfer transfer;
        while (true)
        {
            try {
                transfer = TransferService.transfer(p1, p2, 32.4f);
                break;
            } catch (AccountNotFoundExeption e) {
                p1.setAccount(new Account("","","",0,0f));
                p2.setAccount(new Account("","","",0,0f));
            }
        }

        System.out.println(transfer);
    }
}