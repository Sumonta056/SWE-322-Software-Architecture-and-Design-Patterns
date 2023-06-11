package Learning_Design_Patterns.BrokerPattern;

// Publisher (Server) class
class ChatServer {
    private Broker broker;

    // Connecting broker with Server
    public ChatServer(Broker broker) {
        this.broker = broker;
    }

    // Sending or Publishing message to broker
    public void publishMessage(Message message) {
        broker.receiveMessageFromServer(message);
    }
}