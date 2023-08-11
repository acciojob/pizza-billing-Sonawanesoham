package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        addExtraCheese(); // Deluxe pizzas come with extra cheese by default
        addExtraToppings(); // Deluxe pizzas come with extra toppings by default
    }
}
