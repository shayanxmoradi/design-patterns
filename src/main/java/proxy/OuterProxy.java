package proxy;

public class OuterProxy implements Service{
   final Service serviceProxy;

   public OuterProxy(ServiceProxy serviceProxy) {
       this.serviceProxy = serviceProxy;
   }

    @Override
    public void action() {

        try {
            serviceProxy.action();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
