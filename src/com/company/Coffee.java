package com.company;

public class Coffee extends Drink {
    @Override
    public String toString() {
        return "You ordered COFFEE & sugar count is:  " + getSugarCount();
    }
}
