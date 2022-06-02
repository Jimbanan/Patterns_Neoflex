package com.neoflex.factory;

public class Americano implements ICoffee{
    @Override
    public void grindCoffee() {
        System.out.println("Перемалываю зерна");
    }

    @Override
    public void heatWater() {
        System.out.println("Нагреваю воду до 85°");
    }

    @Override
    public void makeCoffee() {
        System.out.println("Делаю Американо");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("Наливаю Американо в чашку");
    }
}
