package exceptions.homework5;

public class HeavyLuggageException extends Exception{
    public HeavyLuggageException() {
    }

    public HeavyLuggageException(String message) {
        super(message);
    }

    public HeavyLuggageException(String message, Throwable cause) {
        super(message, cause);
    }

    public HeavyLuggageException(Throwable cause) {
        super(cause);
    }
}
