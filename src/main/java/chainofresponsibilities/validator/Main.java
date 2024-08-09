package chainofresponsibilities.validator;

import java.util.Set;

public class Main {
    public static void main(String[] args) {

        BaseHandler handler = new Min(4);
handler.setNext(new NotNull());

        handler.setNext(new Max(5));
        Set<String> errors = handler.handle(2);
        System.out.println(errors);

    }
}
