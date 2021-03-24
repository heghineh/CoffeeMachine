package com.company;

public class Drink {
    //region Properties
    private int sugarCount;
    //endregion

    //region Constructors
    public Drink() {
    }

    public Drink(int sugarCount) {
        this.sugarCount = sugarCount;
    }
    //endregion

    //region Public Methods
    //endregion

    //region Getters and Setters
    public int getSugarCount() {
        return sugarCount;
    }

    public void setSugarCount(int sugarCount) {
        this.sugarCount = sugarCount;
    }
    //endregion
}
