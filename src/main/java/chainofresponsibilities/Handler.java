package chainofresponsibilities;

public interface Handler {

    void setNext(BaseHandler handler);
    void handle(Integer requst);
}
