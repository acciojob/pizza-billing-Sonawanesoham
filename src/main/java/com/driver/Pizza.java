package com.driver;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private boolean extraCheeseAdded;
    private boolean extraToppingsAdded;
    private boolean takeawayAdded;
    private String bill;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        this.price = isVeg ? 300 : 400;
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        if (!extraCheeseAdded) {
            this.price += 80;
            extraCheeseAdded = true;
        }
    }

    public void addExtraToppings() {
        if (!extraToppingsAdded) {
            this.price += isVeg ? 70 : 120;
            extraToppingsAdded = true;
        }
    }

    public void addTakeaway() {
        if (!takeawayAdded) {
            this.price += 20;
            takeawayAdded = true;
        }
    }

    public String getBill() {
        StringBuilder sb = new StringBuilder();
        sb.append("Base Price Of The Pizza: ").append(getPrice()).append("\n");
        if (extraCheeseAdded) sb.append("Extra Cheese Added: 80\n");
        if (extraToppingsAdded) sb.append("Extra Toppings Added: ").append(isVeg ? 70 : 120).append("\n");
        if (takeawayAdded) sb.append("Paperbag Added: 20\n");
        sb.append("Total Price: ").append(price).append("\n");
        return sb.toString();
    }
}
