package com.company;

public class Tea extends Drink{
    @Override
    public String toString() {
        return "You ordered TEA & sugar count is:  " + getSugarCount();
    }
}
