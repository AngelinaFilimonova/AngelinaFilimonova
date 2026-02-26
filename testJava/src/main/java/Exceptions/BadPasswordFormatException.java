package Exceptions;

public class BadPasswordFormatException extends RuntimeException {
    public BadPasswordFormatException(String message) {
        super(message);
    }
}
