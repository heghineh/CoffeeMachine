package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your choice!");
                Command command = new Command(sc.nextLine());
                CoffeeMachine coffeeMachine = new CoffeeMachine();
                Drink drink = coffeeMachine.makeDrink(command);

                System.out.println(drink);
                break;
            } catch (NullPointerException exception) {
                System.out.println("You can choose only tea or coffee, please try again!\"!");
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Invalid expression, please try again.");
            } catch (NumberFormatException exception){
                System.out.println("Invalid expression, please try again.");
            }
        }
    }
}