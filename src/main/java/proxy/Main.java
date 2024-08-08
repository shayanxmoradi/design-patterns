package proxy;

public class Main {
    public static void main(String[] args) {
        MyService myService = new MyService();
        Service proxy = new ServiceProxy(myService);
        proxy.action();
    }
}
