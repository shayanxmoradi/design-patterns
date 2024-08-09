package chainofresponsibilities.validator;

import java.util.HashSet;
import java.util.Set;

public abstract class BaseHandler implements Handler {
    private BaseHandler next;
    protected Set<String>errors = new HashSet<>();


    @Override
    public void setNext(BaseHandler next) {
        this.next = next;

    }



    @Override
    public Set<String> handle(Integer requst) {
        HashSet<String> errors = new HashSet<>();
        handle(requst, errors);
        return errors;

    }
     public  void handle(Integer request,Set<String> errors){
         if(next != null) {

             next.handle(request,errors);
         }
     }
}
