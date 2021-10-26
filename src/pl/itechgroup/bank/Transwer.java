package pl.itechgroup.bank;

public class Transwer implements IInformation {
    String  direct;
    float input;
    float transfer;


    public Transwer(float input, String direct, float transfer) {
        this.input = input;
        this.direct = direct;
        this.transfer = transfer;
    }

    public String getInfo()
    {
        return("input: "+this.input+"  direct: "+this.direct+"  transfer: "+this.transfer);
    }
}
