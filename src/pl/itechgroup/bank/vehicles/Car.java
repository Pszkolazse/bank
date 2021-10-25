package pl.itechgroup.bank.vehicles;


public class Car {
    double enginePower;
    public String registrationNumber;
    String vinNumber;

    public Car(double enginePower, String registrationNumber, String vinNumber) {
        this.enginePower = enginePower;
        this.registrationNumber = registrationNumber;
        this.vinNumber = vinNumber;
    }

    public Car(String registrationNumber)
    {
        this.registrationNumber = registrationNumber;
    }

    public void drive()
    {
        System.out.println("Car width registration number "+ this.registrationNumber + " is driving");
    }
}
