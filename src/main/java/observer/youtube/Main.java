package observer.youtube;

public class Main {
    public static void main(String[] args) {
        Subsciber subscriber1 = new SubscriberImp("Subscriber 1");
        Subsciber subscriber2 = new SubscriberImp("Subscriber 2");
        Subsciber subscriber3 = new SubscriberImp("Subscriber 3");


        YoutubeChannel channel = new YoutubeChannel("teset");
        channel.subscribe(subscriber1);
        channel.subscribe(subscriber2);
        channel.subscribe(subscriber3);

        channel.uploadVideo("Video 1");
        channel.uploadVideo("Video 2");
        channel.uploadVideo("Video 3");
    }
}
