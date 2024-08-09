package decorator;



class App {
    public static void main(String[] args) {
        Service service = new ServiceImpl();
        service = new LoggedService(service);
        service = new ExceptionHandler(service);
        runService(service);
    }

    static void runService(Service service) {
        service.doSomething();
    }
}


interface Service {
    void doSomething();
}

class ServiceImpl implements Service {

    public void doSomething() {
        System.out.println("real service");
        throw new RuntimeException();
    }
}

class LoggedService implements Service {
    private final Service service;

    LoggedService(Service service) {
        this.service = service;
    }

    @Override
    public void doSomething() {
        System.out.println("log before");
        service.doSomething();
        System.out.println("log after");
    }
}

class ExceptionHandler implements Service {
    private final Service service;

    ExceptionHandler(Service service) {
        this.service = service;
    }

    @Override
    public void doSomething() {
        try {
            service.doSomething();
        } catch (Exception e) {
            System.out.println("handle exception");
        }
    }
}