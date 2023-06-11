package Learning_Design_Patterns.BrokerPattern;


public class WebApp {
    public static void main(String[] args) {
        // Creating a broker
        Broker broker = new Broker();

        // Creating a server and connecting with broker
        ChatServer server = new ChatServer(broker);
        broker.setServer(server);

        // Clients connect and register with the broker
        ChatClient clientA = new ChatClient("Client A", broker);
        ChatClient clientB = new ChatClient("Client B", broker);

        // Client A sends a chat message to the broker
        clientA.sendMessage("Hello from Client A!");

        // Output:
        // Client A received message from Server: Hello from Client A!
        // Client B received message from Server: Hello from Client A!

        // Client B sends a chat message to the broker
        clientB.sendMessage("Hi from Client B!");

        // Output:
        // Client A received message from Server: Hi from Client B!
        // Client B received message from Server: Hi from Client B!
    }
}
