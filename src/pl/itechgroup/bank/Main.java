package pl.itechgroup.bank;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Jordan", "Person", "00000000", 45, 169);
        Account account = new Account("kombjp","1111", "jordanyppppppp@poczta.onet.pl",5751, 10);
        Transwer transwer = new Transwer(account.money, "PKO Bank", 5.5f);

        person.getInfo();
        account.getInfo();
        transwer.getInfo();

        for (int i = 1; i < 1000; i+=2) {
            System.out.println(i);
        }
        int indexer = 1;
        while (indexer<1000)
        {
            System.out.println(indexer);
            indexer+=2;
        }
    }
}
