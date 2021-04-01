package io.sadeq.Adapter;

public class Phone {
    private String name;

    public Phone(String name) {
        this.name = name;
    }


    public void plugIn(ConnectorTypeC conn) {
        conn.connectTypeC();
    }
}
