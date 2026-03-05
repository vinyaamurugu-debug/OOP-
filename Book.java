class Book {
    String title;
    String author;
    String ISBN;

    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
}

class EBook extends Book {
    double fileSize;

    EBook(String title, String author, String ISBN, double fileSize) {
        super(title, author, ISBN);
        this.fileSize = fileSize;
    }

    void display() {
        System.out.println(title + " | File Size: " + fileSize + "MB");
    }
}

class PrintedBook extends Book {
    int pageCount;

    PrintedBook(String title, String author, String ISBN, int pageCount) {
        super(title, author, ISBN);
        this.pageCount = pageCount;
    }

    void display() {
        System.out.println(title + " | Pages: " + pageCount);
    }
}

public class Main51 {
    public static void main(String[] args) {
        EBook eb = new EBook("Java", "Author A", "111", 5.5);
        PrintedBook pb = new PrintedBook("Python", "Author B", "222", 300);
        eb.display();
        pb.display();
    }
}