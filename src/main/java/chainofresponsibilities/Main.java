package chainofresponsibilities;

public class Main {
    public static void main(String[] args) {
        HandlerA a = new HandlerA();
        HandlerB b = new HandlerB();
        HandlerC c = new HandlerC();
        a.setNext(b);
        b.setNext(c);
        Integer requst =88;
        a.handle(requst);
    }
}
