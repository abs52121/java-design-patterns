package party.lovey.builder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {
    private String head;
    private String body;
    private String food;

    public Person() {
    }
}
