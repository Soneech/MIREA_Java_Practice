package practice9;

public class InnIncorrectException extends RuntimeException {
    public InnIncorrectException(String message) {
        super("Incorrect INN is entered, it doesn't correct for this user: " + message);
    }
    public InnIncorrectException() {
        super("Incorrect INN is entered, it doesn't correct for this user.");
    }
}
