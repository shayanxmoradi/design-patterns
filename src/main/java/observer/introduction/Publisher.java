package observer.introduction;

import java.util.ArrayList;
import java.util.List;

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
            subscriber.state(state);
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
