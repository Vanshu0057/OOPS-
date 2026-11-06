class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.printf("Price: $%.2f%n", price);
    }
}

public class Pratical6 {
    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book originalBook = new Book("The Hobbit", "J.R.R. Tolkien", 15.99);
        Book copiedBook = new Book(originalBook);

        System.out.println("No-argument constructor:");
        defaultBook.display();

        System.out.println("\nParameterized constructor:");
        originalBook.display();

        System.out.println("\nCopy constructor (before modification):");
        copiedBook.display();

        copiedBook.price = 19.99;
        copiedBook.title = "The Hobbit: Illustrated Edition";

        System.out.println("\nCopied object (after modification):");
        copiedBook.display();

        System.out.println("\nOriginal object (unchanged):");
        originalBook.display();
    }
}