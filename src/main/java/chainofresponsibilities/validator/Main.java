package chainofresponsibilities.validator;

import java.util.Set;

public class Main {
    public static void main(String[] args) {

        BaseHandler min = new Min(4);
        NotNull notNull = new NotNull();
        Max max = new Max(5);
notNull.setNext(min);

min.setNext(max);
        Set<String> errors = notNull.handle(2);
        System.out.println(errors);

    }
}
