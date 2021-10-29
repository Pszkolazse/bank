package pl.itechgroup.bank.account;

import pl.itechgroup.bank.exceptions.AccountNotFoundExeption;

import java.util.Date;
public class TransferService {

    public static Transfer transfer(Person sender, Person receiver, float amount) throws AccountNotFoundExeption {
        if (sender.getAccount()==null || receiver.getAccount()==null) throw new AccountNotFoundExeption();
        if (checkAccountBalance(sender, amount)) {
            sender.getAccount().money -= amount;
            receiver.getAccount().money += amount;
        }
        return new Transfer(sender, receiver, amount, new Date());
    }

    private static boolean checkAccountBalance(Person sender, float amount) {
        return (sender.getAccount().money >= amount);
    }
}
