package Learning_Design_Patterns.ObserverPattern;

// Concrete Observer (YouTube Subscriber)
class YouTubeSubscriber implements Subscriber {
    private String subscriberName;

    public YouTubeSubscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void update(String channelName, String videoTitle) {
        System.out.println(subscriberName
                + " received a new video notification from "
                + channelName + ": " + videoTitle);
    }
}
