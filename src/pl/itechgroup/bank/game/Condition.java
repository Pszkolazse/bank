package pl.itechgroup.bank.game;

public abstract class Condition {
    public void Activate(){
        Activate_Abstract();
    }
    protected abstract void Activate_Abstract();
    public Player owner;

}
