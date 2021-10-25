package pl.itechgroup.bank;

public class Transwer {
    String  direct;
    float input;
    float transfer;


    public Transwer(float input, String direct, float transfer) {
        this.input = input;
        this.direct = direct;
        this.transfer = transfer;
    }

    public void getInfo()
    {
        System.out.println("input: "+this.input+"  direct: "+this.direct+"  transfer: "+this.transfer);
    }
}
