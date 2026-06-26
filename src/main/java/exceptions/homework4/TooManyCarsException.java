package exceptions.homework4;

public class TooManyCarsException extends Exception{
    public TooManyCarsException() {
    }

    public TooManyCarsException(String message) {
        super(message);
    }

    public TooManyCarsException(String message, Throwable cause) {
        super(message, cause);
    }

    public TooManyCarsException(Throwable cause) {
        super(cause);
    }
}
