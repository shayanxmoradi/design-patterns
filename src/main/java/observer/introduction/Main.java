package observer.introduction;

public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();


        SubscriberImpl subscriber = new SubscriberImpl();
        publisher.subscribe(subscriber);

        publisher.subscribe(pub -> System.out.println("view"));
        publisher.subscribe(pub -> System.out.println("modelview"));
        publisher.subscribe(pub -> System.out.println("jetpack"));
        publisher.subscribe(pub -> System.out.println("xmlfiles"));
        publisher.updateState("1. chaning in state");
        publisher.updateState("2. chaning in state");




    }
}
