package com.neoflex.proxy;

public class Connection implements Conn {

    private String name;

    public Connection(String name) {
        this.name = name;
    }

    public void connection() {
        System.out.println("Подключено: localhost:port/" + name);
    }
}
