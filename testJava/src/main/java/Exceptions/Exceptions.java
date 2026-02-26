package Exceptions;

import java.util.Objects;
import java.util.regex.Pattern;


public class Exceptions {

    private static final String LOGIN_REGEX = "^[a-zA-Z0-9_]{1,20}$";
    private static final String PASSWORD_REGEX = "^(?:[a-zA-Z0-9_]|\\p{Punct}){12,20}$";
    /**
     * Команда Pattern.compile компилирует строку с регулярным выражением в объект Pattern,
     * который затем можно использовать для поиска совпадений в тексте. Этот процесс преобразует
     * регулярное выражение в промежуточное представление, что делает многократное использование
     * одного и того же выражения более эффективным.
     */
    private static final Pattern PASSWORD_PATTERN = Pattern.compile(PASSWORD_REGEX);
    private static final Pattern LOGIN_PATTERN = Pattern.compile(LOGIN_REGEX);

    public void validateLoginandPassword(String login, String password) throws BadUsernameFormatException {
        validateLogin(login);
        validatePassword(password);
    }

    private void validatePassword(String password) {
        Objects.requireNonNull(password, "Password must not be null");
        if (!PASSWORD_PATTERN.matcher(password).matches()) {
            throw new BadPasswordFormatException("The password doesn't mathc" + PASSWORD_REGEX);
        }
    }

    private void validateLogin(String login) throws BadUsernameFormatException {
        Objects.requireNonNull(login, "Login must not be null");
        if (!LOGIN_PATTERN.matcher(login).matches()) {
            throw new BadUsernameFormatException(login, "The username [%s] doesn't match" + LOGIN_REGEX);
        }
    }

}

