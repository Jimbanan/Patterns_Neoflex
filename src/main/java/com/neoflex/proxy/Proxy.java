package com.neoflex.proxy;

public class Proxy implements Conn{

    private String name;

    private Connection connection;

    public Proxy(String name) {
        this.name = name;
    }

    @Override
    public void connection() {
        if(connection == null){
            connection = new Connection(name);
        }
        connection.connection();
    }
}
