

import java.util.ArrayList;
import java.util.List;

/**
 * Main runner.
 */
public class Main {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("555-555-5555"));
        persons.add(new Person("lambda@internet.com"));
        persons.add(new Person());
        persons.add(new Person("123-456-7890"));
        persons.add(new Person("N/A"));

        System.out.println(Processor.process(persons));
    }

}
