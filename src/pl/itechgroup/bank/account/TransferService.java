package pl.itechgroup.bank.account;

import pl.itechgroup.bank.exceptions.AccountNotFoundExeption;

import java.util.Date;
public class TransferService {

    public static Transfer transfer(Person sender, Person receiver, float ammout) throws AccountNotFoundExeption {
        if (checkAccountBalance(sender, ammout)) {
            if (sender.getAccount()==null || receiver.getAccount()==null) throw new AccountNotFoundExeption();
            sender.getAccount().money -= ammout;
            receiver.getAccount().money += ammout;
            return new Transfer(sender, receiver, ammout, new Date());
        }
        return null;
    }

    private static boolean checkAccountBalance(Person sender, float ammout) {
        if(sender.getAccount().money >= ammout) {
            return true;
        }
        return false;
    }
}
