package observer.youtube;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel {
    private final List<Subsciber> subscribers = new ArrayList<>();
    private final List<String> videos = new ArrayList<>();

    public String getLatestVideo() {
        if (!videos.isEmpty()) {
            return videos.get(videos.size() - 1);
        }
        return null;
    }
    public void subscribe(Subsciber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subsciber subscriber) {
        subscribers.remove(subscriber);
    }
    public void notifySubscribers() {
        for (Subsciber subscriber : subscribers) {
            subscriber.update(this);
        }
    }

    public void uploadVideo(String video) {
        videos.add(video);
        System.out.println("Channel uploaded a new video: " + video);
        notifySubscribers();
    }

}
