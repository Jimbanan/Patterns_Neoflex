package com.neoflex.singleton;

//Создать класс логирования.
//Метод в нем должен выводить имя переданного класса и дополнительную информацию. (log info: FirstClass, SecondClass)


public class Singleton {

    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_RESET = "\u001B[0m";

    private static Singleton singleton;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public void logging(Object... objects) {
        System.out.println(ANSI_RED + "\nlog info" + ANSI_RESET);

        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i].getClass() + "\t" + objects[i].hashCode() + "\t" + objects[i]);
        }

    }

}
