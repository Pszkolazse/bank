package pl.itechgroup.bank;

import pl.itechgroup.bank.car.Car;
import pl.itechgroup.bank.car.Truck;
import pl.itechgroup.bank.game.Condition;
import pl.itechgroup.bank.game.IInventory;
import pl.itechgroup.bank.game.Item;
import pl.itechgroup.bank.game.Player;

public class Main {
    public static void main(String[] args) {
        Player player01 = new Player(100);
        Item item1 = new Item() {
            @Override
            public void Activate() {
                System.out.println("Is not round");
            }
        };
        Item item2 = new Item() {
            @Override
            public void Activate() {
                System.out.println("Sey something");
            }
        };

        Item item3 = new Item() {
            @Override
            public void Activate() {
                owner.TakeDamage(22);
            }
        };

        Condition regeneration = new Condition() {
            @Override
            public void Activate() {
                owner.setHealth(owner.getHealth()+12);
            }
        };

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
    }
}