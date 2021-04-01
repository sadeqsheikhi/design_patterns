package io.sadeq.Observer;

public class Subscriber {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(String msg) {
        System.out.println(msg);
    }
}
