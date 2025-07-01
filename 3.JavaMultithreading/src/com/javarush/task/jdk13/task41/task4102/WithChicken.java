package com.javarush.task.jdk13.task41.task4102;

public class WithChicken extends PizzaDecorator{

    public WithChicken(Pizza pizza) {
        super(pizza);
    }

    public String getIngredients() {
        return super.getIngredients() + " курица";
    }

    public double getCost() {
        return super.getCost() + 20;
    }
}
