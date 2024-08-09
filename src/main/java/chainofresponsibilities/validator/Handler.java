package chainofresponsibilities.validator;

import java.util.Set;

public interface Handler {

    void setNext(BaseHandler handler);
    Set<String > handle(Integer requst);
}
