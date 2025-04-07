
interface SpopState { // or abstract class

    // default behavior
    default boolean user(String userName) {
        return false;
    }

    default boolean pass(String password) {
        return false;
    }

    default boolean list(int messageNumber) {
        return false;
    }

    default boolean list() {
        return false;
    }

    default boolean retr() {
        return false;
    }

    default boolean quit() {
        return false;
    }

}
