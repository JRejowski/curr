package pl.retsuz.exchange;

import pl.retsuz.currency.ICurrency;

public class Exchange implements IExchange{
    public double exchange(ICurrency src, ICurrency tgt, double amt) {

        return amt*src.getRate()/src.getFactor()/tgt.getRate()* tgt.getFactor();

    }
}
