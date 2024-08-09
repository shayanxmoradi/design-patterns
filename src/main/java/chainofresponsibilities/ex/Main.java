package chainofresponsibilities.ex;



import java.util.Set;

public class Main {
    public static void main(String[] args) {

        NotNull notNull = new NotNull();
        BaseValidator min = new MinLenghtValidator(5);
        MaxLenghtValidator max = new MaxLenghtValidator(20);
        AtValidator atValidator = new AtValidator();
        DomainValidator domainValidator = new DomainValidator();
        notNull.setNext(min);
        min.setNext(max);
        max.setNext(atValidator);
        atValidator.setNext(domainValidator);
        Set<String> errors = notNull.handle("jalksdjf@gmail.com");
        System.out.println(errors);



    }
}
