package Wednesday24May;

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



