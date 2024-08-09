package observer.youtube;


public class SubscriberImp implements Subsciber {
    private final String name;

    public SubscriberImp(String name) {
        this.name = name;
    }


    @Override
    public void update(YoutubeChannel channel) {
        String latestVideo = channel.getLatestVideo();
        if (latestVideo != null) {
            System.out.println(name + " was notified of a new video: " + latestVideo);
        }
    }
}
