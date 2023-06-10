package Learning_Design_Patterns.ObserverPattern;


public class Client {
    public static void main(String[] args) {
        // Create a YouTube channel
        YouTubeChannel channel = new YouTubeChannel("TechTalks");

        // Create subscribers
        Subscriber subscriber1 = new YouTubeSubscriber("Mridul");
        Subscriber subscriber2 = new YouTubeSubscriber("Promi");
        Subscriber subscriber3 = new YouTubeSubscriber("Siam");

        // Subscribers subscribing to the channel
        channel.subscribe(subscriber1);
        channel.subscribe(subscriber2);
        channel.subscribe(subscriber3);

        // Channel uploads a new video
        channel.uploadVideo("Introduction to Java Programming");

        // Output:
        // New video uploaded: Introduction to Java Programming
        // Mridul received a new video notification from TechTalks: Introduction to Java Programming
        // Promi received a new video notification from TechTalks: Introduction to Java Programming
        // Siam received a new video notification from TechTalks: Introduction to Java Programming

        // Promi Decide to unsubscribe the channel
        channel.unsubscribe(subscriber2);

        // Channel uploads another video
        channel.uploadVideo("Advanced Java Concepts");

        // Output:
        // New video uploaded: Advanced Java Concepts
        // Mridul received a new video notification from TechTalks: Advanced Java Concepts
        // Siam received a new video notification from TechTalks: Advanced Java Concepts

        // Promi didn't receive any notification as she unsubscribed
    }
}