public class Main {
    public static void main(String[] args) {
        Book book = new Book("Александр ", "Пушкин ", " Капитанская дочка ", 1700);
        System.out.println("book.getNameAuthor() = " + book.getNameAuthor());
        Author author = new Author("Александр", "Пушкин");
        Book book1 = new Book("Иван ", "Тургенев", "Му-му", 1289);
        Author author1 = new Author("Иван", "Тургенев");
        book1.setAge(1245);
        System.out.println("book1.getAge() = " + book1.getAge());
    }
}

class Book extends Author {
    private String name;

    private int age;


    public Book(String nameAuthor, String surname, String name, int age) {
        super(nameAuthor, surname);
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
}

class Author {
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
}



