package Wednesday24May;

import java.util.Objects;

public class Book {
    private String name;
    private String nameAuthor;
    private String surname;
    private int age;


    public Book(String nameAuthor, String surname, String name, int age) {
        this.nameAuthor = nameAuthor;
        this.surname = surname;
        this.age = age;
        this.name = name;

    }

    public String getName() {
        return this.name;
    }


    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public String getSurname() {
        return this.surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) && Objects.equals(nameAuthor, book.nameAuthor) && Objects.equals(surname, book.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nameAuthor, surname);
    }

    @Override
    public String toString() {
        return "Wednesday24May.Book{" +
                "name='" + name + '\'' +
                ", nameAuthor='" + nameAuthor + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}