package pl.javastart.task;

public class IncorrectAgeException extends RuntimeException {
    public IncorrectAgeException() {
        super("Age cannot be a lower than 1");
    }
}
