package observer;

public class SubscriberImpl implements Subscriber {
    @Override
    public void update(Publisher publisher) {
         String s = publisher.getState();
        System.out.println("state"+s);
    }
}
