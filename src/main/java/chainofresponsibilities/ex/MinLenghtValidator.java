package chainofresponsibilities.ex;


import chainofresponsibilities.validator.BaseHandler;

import java.util.Set;

public class MinLenghtValidator extends BaseValidator {
    private final int minValidLenght;

    public MinLenghtValidator(int minValidLenght) {
        this.minValidLenght = minValidLenght;
    }

    @Override
    public void handle(String email, Set<String> errors) {
       if (email==null|| email.length() < minValidLenght) {
           errors.add("your email address is smaller than : " + minValidLenght);
       }
       super.handle(email, errors);
    }
}
