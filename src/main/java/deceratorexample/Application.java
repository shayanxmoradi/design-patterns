package deceratorexample;

public class Application {

private Notifier notifier;

    public void setNotifier(Notifier notifier) {
        this.notifier = notifier;
    }
    public void doSomething() {
        notifier.send("new Alert");
    }

    public static void main(String[] args) {
        Notifier stack = new EmailNotifier();
        boolean facebook = true;
        boolean slack = true;
        boolean sms = true;
        if (facebook)
            stack = new FacebookDecorator(stack);
        if (slack) stack = new SlackDecorator(stack);
        if (sms) stack = new SMSDecorator(stack);

    Application app = new Application();
    app.setNotifier(stack);
    app.doSomething();}
}

