package chainofresponsibilities.ex;


import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DomainValidator extends BaseValidator {



    @Override
    public void handle(String email, Set<String> errors) {
       if (email==null|| !containsDomain(email)) {
           errors.add("your email is not valid, in domiain, for example it should have .de .com .tr " );
       }
       super.handle(email, errors);
    }
    public static boolean containsDomain(String input) {

        String domainPattern = "\\.[a-zA-Z]{2,5}";


        Pattern pattern = Pattern.compile(domainPattern);


        Matcher matcher = pattern.matcher(input);


        return matcher.find();
    }
}
