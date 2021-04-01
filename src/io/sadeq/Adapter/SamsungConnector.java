package io.sadeq.Adapter;

public class SamsungConnector implements ConnectorMini{
    @Override
    public void connectMini() {
        System.out.println("Connected Samsung Connector successfully");
    }
}
