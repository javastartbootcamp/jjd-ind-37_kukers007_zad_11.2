package pl.javastart.task;

public class NameUndefinedException extends RuntimeException {
    public NameUndefinedException() {
        super("Name cannot be a null, or shorter than 2 letters");
    }
}