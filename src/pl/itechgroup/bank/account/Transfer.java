package pl.itechgroup.bank.account;

import pl.itechgroup.bank.IInformation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Transfer{

    Person sender, reciver;
    float amount;
    Date date;

    public Transfer(Person sender, Person reciver, float amount, Date date) {
        this.sender = sender;
        this.reciver = reciver;
        this.amount = amount;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "sender=" + sender +
                "   account="+ sender.account+"\n"+
                "reciver=" + reciver +
                "   account="+reciver.account+"\n"+
                "amount=" + amount +
                "  date=" + date +
                '}';
    }
}
