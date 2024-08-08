package proxy;

public class ServiceProxy implements Service{
    private MyService myService;
    public ServiceProxy(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void action() {
        System.out.println("before action");
        myService.action();
        System.out.println("after action");

    }
}
