package pl.itechgroup.bank;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Jordan", "Person", "00000000", 45, 169);
        Account account = new Account("kombjp","1111", "jordanyppppppp@poczta.onet.pl",5751, 10);
        Transwer transwer = new Transwer(account.money, "PKO Bank", 5.5f);

        person.getInfo();
        account.getInfo();
        transwer.getInfo();
    }
}
