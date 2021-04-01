package io.sadeq.Adapter;

public class Adapter implements ConnectorTypeC{
    private ConnectorMini mini;

    public Adapter(ConnectorMini mini) {
        this.mini = mini;
    }

    @Override
    public void connectTypeC() {
        this.mini.connectMini();
    }
}
