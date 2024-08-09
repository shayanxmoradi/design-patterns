package observer;

public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();


        SubscriberImpl subscriber = new SubscriberImpl();
        publisher.subscribe(subscriber);

        publisher.subscribe(pub -> System.out.println("subscriberA state"+pub.getState()));
        publisher.subscribe(pub -> System.out.println("subscriberB state"+pub.getState()));
        publisher.subscribe(pub -> System.out.println("subscriberC state"+pub.getState()));
        publisher.subscribe(pub -> System.out.println("subscriberD state"+pub.getState()));
        publisher.updateState("first state");
        publisher.updateState("second state");


    }
}
