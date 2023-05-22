public class Main {
    public static void main(String[] args) {


         class Book {
            private String name;
            private String author;
            private int age;

            public Book(String name, String author, int age) {
                this.name = name;
                this.author = author;
                this.age = age;
            }

            public String getName() {
                return this.name;
            }

            public String getAuthor() {
                return this.author;
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

            Book book = new Book("Капитанская дочка ", "Пушкин ", 13);
            Author author = new Author("Александр", "Пушкин");
            Book book1 = new Book("Му-му ", "Тургенев ", 15);
            Author author1 = new Author("Иван ", "Тургенев ");
            book1.setAge(20);
            System.out.println(book.getName() + book.getAuthor() + book.getAge());
    }
}

