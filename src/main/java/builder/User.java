package builder;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class User {
    private String name;
    private String lastName;

    @Override
    public String toString() {
        return "User{" +
               "name='" + name + '\'' +
               ", lastName='" + lastName + '\'' +
               '}';
    }

    public static void main(String[] args) {
        System.out.println(User.builder().name("hi").lastName("world").build());

    }
}
