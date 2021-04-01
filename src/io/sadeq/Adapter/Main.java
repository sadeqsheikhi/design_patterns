package io.sadeq.Adapter;

public class Main {
    public static void main(String[] args) {
        Phone xiamoi = new Phone("mi 9");
        ConnectorTypeC xiaomiconnector = new XiaomiConnector();
        ConnectorMini samsung = new SamsungConnector();

        Adapter adapt = new Adapter(samsung);

        xiamoi.plugIn(adapt);
    }
}
