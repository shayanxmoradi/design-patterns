package chainofresponsibilities;

public class BaseHandler implements Handler {
    private Handler next;


    @Override
    public void setNext(BaseHandler b) {
        this.next = b;

    }

    @Override
    public void handle(Integer requst) {
        if(next != null) {
            next.handle(requst);
        }
    }
}
