package io.sadeq.Facade;
public class NotificationServer {

    public Connection connect(String serverIP) {
        System.out.println("Connection Established");
        return new Connection();
    }

    public AuthToken authenticate(String appId, String key) {
        System.out.println("Authorized");
        return new AuthToken();
    }

    public void send(AuthToken token, Message msg) {
        System.out.println("Notification Sent");
    }
}
