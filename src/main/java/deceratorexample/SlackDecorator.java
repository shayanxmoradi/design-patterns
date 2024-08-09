package deceratorexample;

public class SlackDecorator extends BaseDecorator {
    public SlackDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Slack: " + message);
    }
}
