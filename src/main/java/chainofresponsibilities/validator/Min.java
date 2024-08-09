package chainofresponsibilities.validator;


import java.util.Set;

public class Min extends BaseHandler {
    private final int min;

    public Min(int min) {
        this.min = min;
    }

    @Override
    public void handle(Integer request, Set<String> errors) {
       if (request==null||request < min) {
           errors.add("Min number is lower than " + min);
       }
       super.handle(request, errors);
    }
}
