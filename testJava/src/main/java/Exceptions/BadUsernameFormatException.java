package Exceptions;

public class BadUsernameFormatException extends Exception {
    private final String username;

    public BadUsernameFormatException(String username, String messageFormat) {
        super(messageFormat);
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String getMessage() {
        return String.format(super.getMessage(), getUsername());
    }
}
