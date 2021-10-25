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

    public void getInfo() {
        System.out.println("login: " + this.login+"  password: "+this.passwod+"  email: "+this.email+"  id: "+this.id+"  money on account: "+money);
    }

}
