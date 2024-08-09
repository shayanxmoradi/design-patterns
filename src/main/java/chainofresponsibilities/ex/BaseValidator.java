package chainofresponsibilities.ex;

import chainofresponsibilities.validator.Handler;

import java.util.HashSet;
import java.util.Set;

public abstract class BaseValidator implements Validator {
    private BaseValidator next;
    protected Set<String>errors = new HashSet<>();


    @Override
    public void setNext(BaseValidator next) {
        this.next = next;

    }



    @Override
    public Set<String> handle(String email) {
        HashSet<String> errors = new HashSet<>();
        handle(email, errors);
        return errors;

    }
     public  void handle(String email,Set<String> errors){
         if(next != null) {

             next.handle(email,errors);
         }
     }
}
