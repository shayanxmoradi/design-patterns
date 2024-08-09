package chainofresponsibilities.simplee;

public class BaseHandler implements Handler {
    private Handler next;


    @Override
    public void setNext(BaseHandler next) {
        this.next = next;

    }

    @Override
    public void handle(Integer requst) {
        if(next != null) {
            next.handle(requst);
        }
    }
}
