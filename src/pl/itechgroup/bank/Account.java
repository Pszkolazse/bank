package pl.itechgroup.bank;

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

    public StringBuilder getInfo() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("login: %s  password: %s  email: %s  id: %s  money on account: %s",this.login, this.passwod,
                this.email, this.id, this.money));
         return result;
    }

}
