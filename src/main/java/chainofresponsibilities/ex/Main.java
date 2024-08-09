package chainofresponsibilities.ex;


import chainofresponsibilities.validator.BaseHandler;
import chainofresponsibilities.validator.Max;
import chainofresponsibilities.validator.Min;

import java.util.Set;

public class Main {
    public static void main(String[] args) {

        NotNull notNull = new NotNull();
        BaseValidator min = new MinLenghtValidator(5);
        MaxLenghtValidator max = new MaxLenghtValidator(20);
        AtValidator at = new AtValidator();
        DomainValidator da = new DomainValidator();
        notNull.setNext(min);
        min.setNext(max);
        max.setNext(at);
        at.setNext(da);
        Set<String> errors = notNull.handle("asedfasdf@gmail.de");
        System.out.println(errors);



    }
}
