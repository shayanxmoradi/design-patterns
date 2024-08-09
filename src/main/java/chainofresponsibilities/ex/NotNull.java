package chainofresponsibilities.ex;


import chainofresponsibilities.validator.BaseHandler;

import java.util.Set;

public class NotNull extends BaseValidator {

    @Override
    public void handle(String email, Set<String> errors) {
        if (email == null) {
            errors.add("email is null");
        }
        super.handle(email, errors);
    }


}
