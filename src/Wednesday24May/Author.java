package Wednesday24May;

import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String surname;

    public Author(String nameAuthor, String surname) {
        this.nameAuthor = nameAuthor;
        this.surname = surname;
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
        Author author = (Author) o;
        return Objects.equals(nameAuthor, author.nameAuthor) && Objects.equals(surname, author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, surname);
    }

    @Override
    public String toString() {
        return "Wednesday24May.Author{" +
                "nameAuthor='" + nameAuthor + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
