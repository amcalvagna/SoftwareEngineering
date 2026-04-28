

import java.util.Optional;

/**
 * A person with contact information.
 */
class Person {

    /**
     * An optional string representing an email address or a phone number.
     */
    private Optional<String> contact;

    /**
     * Constructor.
     */
    Person() {
        this.contact = Optional.empty();
    }

    /**
     * Constructor.
     * @param contact contact information for the Person.
     */
    Person(String contact) {
        this.contact = Optional.of(contact);
    }

    /**
     * Get the <em>contact</em> of this <em>Person</em>.
     * @return the optional contact string
     */
    Optional<String> getContact() {
        return this.contact;
    }

}