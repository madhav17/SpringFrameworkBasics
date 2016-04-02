package com.spring.demo;

/**
 * Created by madhav on 2/4/16.
 */
public class Restaurant {
    Drink drink;

    void displayDrink(){
        System.out.println(drink);
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }
}
