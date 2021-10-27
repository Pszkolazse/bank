package pl.itechgroup.bank.game;

import java.util.Collection;

public abstract class Weapon extends Item{
    public Collection Attack()
    {
        return Attack_Abstract();
    }
    protected abstract Collection Attack_Abstract();

}
