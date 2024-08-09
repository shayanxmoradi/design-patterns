package observer.introduction;

public class SubscriberImpl implements Subscriber {
    private Publisher publisher;
    @Override
    public void state(String state) {
        System.out.println(state);
    }
}
