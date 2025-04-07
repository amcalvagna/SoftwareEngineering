import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface SpopState { // or abstract class

    List<String> mailbox = new ArrayList<String>(
            Arrays.asList("a first message.", "a second messagge!", "a third and last message"));

    // default behavior
    default SpopState user(String userName) {
        giveWarningOfIllegalCommand();
        return goToStartState();
    }

    default SpopState pass(String password) {
        sendErrorMessageOrWhatEver();
        return goToStartState();
    }

    default SpopState list(int messageNumber) {
        giveWarningOfIllegalCommand();
        return goToStartState();
    }

    default SpopState list() {
        giveWarningOfIllegalCommand();
        return goToStartState();
    }

    default SpopState retr() {
        giveWarningOfIllegalCommand();
        return goToStartState();
    }

    default SpopState quit() {
        return goToStartState();
    }

    // utility methods

    default SpopState goToStartState() {
        System.out.println("Session terminated!");
        // System.out.println("state: " + this.getClass().toString());
        return new Start();
    }

    default void sendErrorMessageOrWhatEver() {
        System.out.println("ERROR: unauthorized access!!");
    }

    default void giveWarningOfIllegalCommand() {
        System.out.println("WARNING!: illegal command!");
    }

}
