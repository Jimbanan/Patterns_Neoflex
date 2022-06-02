package com.neoflex.factory;

public class Coffeemaker {

    private final CoffeeFactory factory;

    public Coffeemaker() {
        this.factory = new CoffeeFactory();
    }

    public ICoffee orderCoffee(CoffeeType type) {
        ICoffee coffee = this.factory.createCoffee(type);

        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.pourIntoCup();

        System.out.println("Кофе готов!");
        return coffee;
    }

}
