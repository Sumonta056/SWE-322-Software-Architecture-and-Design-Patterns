package Learning_Design_Patterns.BrokerPattern;

import java.util.ArrayList;
import java.util.List;

// Broker class
class Broker {
    private List<ChatClient> clients;
    private ChatServer server;

    public Broker() {
        this.clients = new ArrayList<>();
    }

    // Connection of sever and broker
    public void setServer(ChatServer server) {
        this.server = server;
    }
    // registering new client using broker
    public void registerClient(ChatClient client) {
        clients.add(client);
    }
    // Sending the message to server
    public void receiveMessageFromClient(Message message) {
        server.publishMessage(message);
    }

    // Sending the message broker to all clients
    public void receiveMessageFromServer(Message message) {
        for (ChatClient client : clients) {
            client.receiveMessage(message);
        }
    }
}
