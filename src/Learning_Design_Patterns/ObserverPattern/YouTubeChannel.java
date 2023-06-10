package Learning_Design_Patterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

// Subject (YouTube Channel)
class YouTubeChannel {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String channelName;

    // Creating a channel with name
    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
    }

    // Subscribing the Channel
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    // UnSubscribing the Channel
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    // Notifying all the subscriber of channel
    public void notifySubscribers(String videoTitle) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(channelName, videoTitle);
        }
    }

    // Channel Uploading a video
    public void uploadVideo(String videoTitle) {
        System.out.println("New video uploaded: " + videoTitle);
        notifySubscribers(videoTitle);
    }
}
