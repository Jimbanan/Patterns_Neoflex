package com.neoflex.factory;

public class Espresso implements ICoffee{
    @Override
    public void grindCoffee() {
        System.out.println("Перемалываю зерна");
    }

    @Override
    public void heatWater() {
        System.out.println("Нагреваю воду до 93°");
    }

    @Override
    public void makeCoffee() {
        System.out.println("Делаю Эспрессо");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("Наливаю Эспрессо в чашку");
    }
}
