package chainofresponsibilities.ex;

import chainofresponsibilities.validator.BaseHandler;

import java.util.Set;

public interface Validator {

    void setNext(BaseValidator handler);
    Set<String > handle(String email);
}
