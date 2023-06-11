package Learning_Design_Patterns.BrokerPattern;

// Subscriber (Client) class
class ChatClient {
    private String name;
    private Broker broker;

    public ChatClient(String name, Broker broker) {
        this.name = name;
        this.broker = broker;
        broker.registerClient(this);
    }

    // Receiving message from broker
    public void receiveMessage(Message message) {
        System.out.println(name + " received message from " + message.getSender() + ": " + message.getContent());
    }

    // Sending Message to broker
    public void sendMessage(String content) {
        Message message = new Message(content, name);
        broker.receiveMessageFromClient(message);
    }
}