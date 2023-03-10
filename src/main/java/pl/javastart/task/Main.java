package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        try {
            Person person = new Person("Jan", "Kowalski", "1928AA3", 25);
            person.setAge(-10);
            System.out.println(person);
        } catch (NameUndefinedException | IncorrectAgeException e) {
            System.err.println(e.getMessage());
        }
    }
}