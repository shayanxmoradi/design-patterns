package chainofresponsibilities.ex;


import java.util.Set;

public class MaxLenghtValidator extends BaseValidator {
    private final int maxValidEmailLenght;

    public MaxLenghtValidator(int maxValidEmailLenght) {
        this.maxValidEmailLenght = maxValidEmailLenght;
    }

    @Override
    public void handle(String email, Set<String> errors) {
       if (email==null|| email.length() > maxValidEmailLenght) {
           errors.add("your email is bigger than valid lenght: " + maxValidEmailLenght);
       }
       super.handle(email, errors);
    }
}
