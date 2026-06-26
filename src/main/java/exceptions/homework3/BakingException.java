package exceptions.homework3;

public class BakingException extends Exception{
    public BakingException() {
    }

    public BakingException(String message) {
        super(message);
    }

    public BakingException(String message, Throwable cause) {
        super(message, cause);
    }

    public BakingException(Throwable cause) {
        super(cause);
    }
}
