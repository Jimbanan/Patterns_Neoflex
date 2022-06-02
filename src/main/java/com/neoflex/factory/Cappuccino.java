package com.neoflex.factory;

public class Cappuccino implements ICoffee{
    @Override
    public void grindCoffee() {
        System.out.println("Перемалываю зерна");
    }

    @Override
    public void heatWater() {
        System.out.println("Нагреваю воду до 70°");
    }

    @Override
    public void makeCoffee() {
        System.out.println("Делаю Капучино");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("Наливаю Капучино в чашку");
    }
}
