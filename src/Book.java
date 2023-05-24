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
}