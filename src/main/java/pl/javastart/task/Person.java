package pl.javastart.task;

public class Person {
    private String firstName;
    private String lastName;
    private String id;
    private int age;

    public Person(String firstName, String lastName, String id, int age) {
        checkConditions(firstName, lastName, age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
    }

    private void checkConditions(String firstName, String lastName, int age) {
        checkFirstName(firstName);
        checkLastName(lastName);
        checkAge(age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        checkFirstName(firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        checkLastName(lastName);
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        checkAge(age);
        this.age = age;
    }

    private void checkAge(int age) {
        if (age < 1) {
            throw new IncorrectAgeException();
        }
    }

    private void checkFirstName(String firstName) {
        if (firstName == null) {
            throw new NameUndefinedException();
        }
        int lenght = firstName.length();
        if (lenght < 2) {
            throw new NameUndefinedException();
        }
    }

    private void checkLastName(String lastName) {
        if (lastName == null) {
            throw new NameUndefinedException();
        }
        int lenght = lastName.length();
        if (lenght < 2) {
            throw new NameUndefinedException();
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}