package ru.alfabank;

/**
 * Created by а on 19.09.2017.
 */
public class ValidationException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Ошибка!";
    }
}
