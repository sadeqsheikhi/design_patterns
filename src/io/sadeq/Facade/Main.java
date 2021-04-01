package io.sadeq.Facade;

public class Main {
    public static void main(String[] args) {
        // SENDING PUSH NOTIFICATIONS
        // server.connect(serverIP)  => conn
        // server.authenticate('appId', 'key') => AuthToken
        // server.send(AuthToken token, Message msg)
        // conn.disconnect()

        NotificationService service = new NotificationService();
        service.send("Forosh Bahare");



    }
}
