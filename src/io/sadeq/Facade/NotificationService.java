package io.sadeq.Facade;

public class NotificationService {
    public void send(String message) {
        NotificationServer server = new NotificationServer();
        Message msg = new Message(message);

        Connection conn = server.connect("23235");
        AuthToken token = server.authenticate("23423", "34234");
        server.send(token, msg);
        conn.disconnect();
    }
}
