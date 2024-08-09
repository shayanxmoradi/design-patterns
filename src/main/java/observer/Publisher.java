package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;

public class Publisher {
    private final List<Subscriber> subscribers = new ArrayList<>();
    private String state;

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(this);
        }
    }

    public void updateState(String state) {
        this.state = state;
        notifySubscribers();
    }


    public String getState() {
        return state;
    }
}
