package pl.itechgroup.bank;

import java.text.Normalizer;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Account {
    String login, passwod, email;
    int id;
    float money;

    public Account(String login, String passwod, String email, int id, float money) {
        this.login = login;
        this.passwod = passwod;
        this.email = email;
        this.id = id;
        this.money = money;
    }

    public String getInfo() {
        Locale locale = new Locale("pl", "PL");
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        return(String.format("login: %s  password: %s  email: %s  id: %s  money on account: %s",this.login, this.passwod,
                this.email, this.id, nf.format(this.money)));
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
