package pl.itechgroup.bank.car;

public abstract class Car {
    boolean isWorking = true;
    String vinNumber = null;
    public abstract void drive();
    public abstract void honk();
}
