package com.neoflex;

import com.neoflex.proxy.Connection;
import com.neoflex.proxy.Proxy;

public class Main {

    public static void main(String[] args) {

        //Singleton

//        Singleton singleton1 = Singleton.getInstance();
//        Singleton singleton2 = Singleton.getInstance();
//        Singleton singleton3 = Singleton.getInstance();
//
//        System.out.println(singleton1.equals(singleton2));//singleton1 == singleton2
//        System.out.println(singleton1.equals(singleton3));//singleton1 == singleton3
//                                                          //singleton2 == singleton3
//
//        System.out.println(singleton1);
//        System.out.println(singleton2);
//        System.out.println(singleton3);
//
//        singleton1.logging(new FirstClass(), new SecondClass());

        //Factory

//        Coffeemaker coffeemaker = new Coffeemaker();
//        coffeemaker.orderCoffee(CoffeeType.AMERICANO); // Делаем Американо
//        coffeemaker.orderCoffee(CoffeeType.CAPPUCCINO); // Делаем Капучино
//        coffeemaker.orderCoffee(CoffeeType.ESPRESSO); // Делаем Эспрессо

        //Adapter

//        Computer computer = new Computer();
//        computer.MemoryCardToUSB();

        //Proxy

//        Connection connection = new Connection("TestDB");
//        connection.connection();

        Proxy proxy = new Proxy("TestDB");
        proxy.connection();
    }


}
