package pl.itechgroup.bank.account;

import java.util.Date;

public class TransferService {

    public static Transfer transfer(Person sender, Person receiver, float ammout) {
        if (checkAccountBalance(sender, ammout)) {
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
