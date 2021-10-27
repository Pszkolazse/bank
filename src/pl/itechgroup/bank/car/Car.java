package pl.itechgroup.bank.car;

import java.util.List;

public abstract class Car {

    public Car(String vinNumber, float wheelDiameter, String wheelCompany)
    {
        this.wheel = new Wheel(wheelDiameter, wheelCompany);
        this.vinNumber = vinNumber;
    }

    Wheel wheel;

    public Wheel getWheel() {
        return wheel;
    }

    boolean isWorking = true;
    String vinNumber = null;
    public abstract void drive();
    public abstract void honk();
}
