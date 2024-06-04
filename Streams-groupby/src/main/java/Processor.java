

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.stream.Collectors.groupingBy;

/**
 * Processor for contact information of Persons.
 */
class Processor {

    enum ContactType { EMAIL, PHONE, TRASH }

    static final Pattern email = Pattern.compile("^(.+)@(.+)$");
    static final Pattern phone = Pattern.compile("^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$");

    /**
     * Get the contact type of a contact based on a regex pattern.
     * @param contact contact information.
     * @return an enum indicating email, phone, or trash.
     */
    static ContactType getContactType(String contact) {
        Matcher e = email.matcher(contact);
        Matcher p = phone.matcher(contact);
        if (e.matches()) return ContactType.EMAIL;
        if (p.matches()) return ContactType.PHONE;
        return ContactType.TRASH;
    }

    /**
     *  Process a list of persons and group their contacts by type.
     * @param persons list of persons we want to process.
     * @return a map of contacts grouped by contact type.
     */
    static Map<ContactType, List<String>> process(List<Person> persons) {
        return persons.stream()
                .parallel()
                .map(Person::getContact)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(groupingBy(Processor::getContactType));
    }

}
