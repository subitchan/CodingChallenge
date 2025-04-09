package exception;

public class ApplicationDeadlineException extends RuntimeException {
    public ApplicationDeadlineException(String message) {
        super(message);
    }
}
