package chainofresponsibilities.validator;


import java.util.Set;

public class Max extends BaseHandler {
    private final int max;

    public Max(int max) {
        this.max = max;
    }

    @Override
    public void handle(Integer request, Set<String> errors) {
       if (request==null|| request > max) {
           errors.add("max number is gerather than " + max);
       }
    }
}
