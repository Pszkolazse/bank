package pl.itechgroup.bank;

import pl.itechgroup.bank.account.Account;
import pl.itechgroup.bank.account.Person;
import pl.itechgroup.bank.account.Transfer;
import pl.itechgroup.bank.account.TransferService;

public class Main {
    public static void main(String[] args) {
        /*
        Player player01 = new Player(100);0
        Item item1 = new Item() {
            @Override
            protected Collection Activate_Abstract() {
                System.out.println("Is not round");
                return null;
            }
        };
        Item item2 = new Item() {
            @Override
            protected Collection Activate_Abstract()  {
                System.out.println("Sey something");
                return null;
            }
        };

        Item item3 = new Item() {
            @Override
            protected Collection Activate_Abstract()  {
                owner.TakeDamage(22);
                return null;
            }
        };

        Weapon weapon1 = new Weapon() {
            @Override
            protected Collection Attack_Abstract() {
                System.out.println("slice!");
                List list = new ArrayList();
                list.add(36);
                return list;
            }

            @Override
            protected Collection Activate_Abstract() {
                System.out.println("Wery sharp");
                return null;
            }
        };

        Condition regeneration = new Condition() {
            @Override
            public void Activate_Abstract() {
                owner.setHealth(owner.getHealth()+12);
            }
        };

        player01.weapon = weapon1;

        player01.AddItem(item1);
        player01.AddItem(item2);
        player01.AddItem(item3);
        player01.AddState(regeneration);
        player01.UpdateStatus();
        System.out.println("------------------------------");
        player01.UpdateStatus();
        System.out.println("------------------------------");
        player01.UpdateStatus();
        System.out.println("------------------------------");
        player01.UpdateStatus();
        System.out.println("------------------------------");
        player01.UpdateStatus();
        System.out.println("------------------------------");


        Car car = new Car("2sd96PF", 5.2f, "Shell") {
            @Override
            public void drive() {

            }

            @Override
            public void honk() {

            }

            @Override
            public String toString() {
                return super.toString();
            }
        };

        System.out.println(car.getWheel());
        */

        Person p1 =  new Person("Piotr","B","23485963",19, 176);
        p1.setAccount(new Account("pblog", "66f5sdf58s", "plogb@pocz.com", 55541, 55.6f));
        Person p2 = new Person("Mateusz", "K", "56659224", 22, 177);
        p2.setAccount(new Account("mmmmmatK", "+5edf.#$%", "matkom@gmail.com", 54166, 115.9f));

        Transfer transfer = TransferService.transfer(p1, p2, 32.4f);
        System.out.println(transfer);
    }
}
