package exception;

public class DBConnectionException extends RuntimeException {
    public DBConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}