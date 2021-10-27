package pl.itechgroup.bank.game;

import java.util.List;

public class Player implements IDamageAble, IInventory, IState{


    float Health = 0;
    public Weapon weapon;

    public Player(float health) {
        Health = health;
    }

    @Override
    public void TakeDamage(float damage) {
       List list = (List)weapon.Attack();
        Health -= damage + (int)list.get(0);
    }

    @Override
    public float getHealth() {
        return Health;
    }

    @Override
    public void setHealth(float health) {
        Health = health;
    }

    public void UpdateStatus()
    {
        inventory.forEach(item -> {item.Activate();});
        states.forEach(item -> {item.Activate();});
        System.out.println("Current Health: "+getHealth());
    }

    public void AddItem(Item item)
    {
        item.owner = this;
        inventory.add(item);
    }

    public void AddState(Condition conn)
    {
        conn.owner = this;
        states.add(conn);
    }
}
