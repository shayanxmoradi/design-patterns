package deceratorexample;

public class BaseDecorator implements  Notifier{
    protected Notifier wrappee;
    public BaseDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }
    @Override
    public void send(String message) {
        wrappee.send(message);

    }
}
