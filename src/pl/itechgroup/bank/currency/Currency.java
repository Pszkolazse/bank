package pl.itechgroup.bank.currency;

import java.text.DecimalFormat;

public class Currency implements IMark, IValue, IValueTranslator {

    String mark, name;
    double value, factor;


    @Override
    public String toString() {
        return "Currency{" + "name:"+name+
                " value=" + new DecimalFormat("#####.########").format( value )+ getMark() +
                " factor=" + new DecimalFormat("#####.########").format( factor ) +
                '}';
    }

    public Currency( String name, String mark, double value, double factor) {
        this.mark = mark;
        this.name = name;
        this.value = value;
        this.factor = factor;
    }

    public static void exchangeCurrency(Currency from, Currency to)
    {
         to.setValue(from.getValue()/from.getFactor()*to.getFactor());

    }

    @Override
    public String getMark() {
        return this.mark;
    }

    @Override
    public double getValue() {
        return this.value;
    }

    @Override
    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public double getFactor() {
        return this.factor;
    }
}
