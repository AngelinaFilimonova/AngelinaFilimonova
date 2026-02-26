package Map.DeleteSurnames;


public class Person implements Comparable<Person> {
    private String surname;
    private String name;

    public Person() {
    }

    public Person(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    @Override
    public String toString() {
        return surname + " " + name;
    }

    @Override
    public int compareTo(Person o) {
        return this.surname.compareTo(o.surname);
    }
}
