package chainofresponsibilities.validator;


import java.util.Set;

public class NotNull extends BaseHandler {

    @Override
    public void handle(Integer request, Set<String> errors) {
        if (request == null) {
            errors.add("request is null");
        }
    }
}
