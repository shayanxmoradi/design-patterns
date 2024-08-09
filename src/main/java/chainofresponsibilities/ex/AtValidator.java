package chainofresponsibilities.ex;


import java.util.Set;

public class AtValidator extends BaseValidator {



    @Override
    public void handle(String email, Set<String> errors) {
       if (email==null|| !email.contains("@")) {
           errors.add("your email is not valid, missing: " + "@");
       }
       super.handle(email, errors);
    }
}
