package com.company;

public class CoffeeMachine {
    public Drink makeDrink(Command command){
        if(command.getDrinkType().equals(DrinkType.TEA)){
            Tea tea = new Tea();
            tea.setSugarCount(command.getSugarCount());
            return tea;
        } else if(command.getDrinkType().equals(DrinkType.COFFEE)){
            Coffee coffee = new Coffee();
            coffee.setSugarCount(command.getSugarCount());
            return coffee;
        } else {
            return null;
        }
    }
}
