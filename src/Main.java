public class Main {
    public class Book {
        private String name;
        private String author;
        private int age;

        public Book(String name, String author, int age) {
            this.Name = name;
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
        public void setName(String name) {
            this.name = name;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

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

        public void setNameAuthor(String NameAuthor) {
            this.nameAuthor = NameAuthor;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }
    }


    public static void main(String[] args) {
    }

}

