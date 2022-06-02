package com.neoflex.factory;

public class CoffeeFactory {

    public ICoffee createCoffee(CoffeeType type) {

        ICoffee coffee = null;

        switch (type) {
            case AMERICANO:
                coffee = new Americano();
                break;
            case ESPRESSO:
                coffee = new Espresso();
                break;
            case CAPPUCCINO:
                coffee = new Cappuccino();
                break;
        }

        return coffee;
    }


}
