package com.study.tdd.money;

public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    public Money times(int multiplier) {
        return new Dollar(amount * multiplier, "USD");
    }

}

