package pl.itechgroup.bank.game;

import java.util.Collection;

public abstract class Item {
    public Collection Activate(){
        return Activate_Abstract();
    }
    protected abstract Collection Activate_Abstract();
    public Player owner;
}
