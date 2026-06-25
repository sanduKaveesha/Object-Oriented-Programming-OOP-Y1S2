package q1;

public class Book {
    String title;
    String author;
    String ISBN;
    double price;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;

    }

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public Book(String title, String author, String ISBN, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }

    String getBookDetails() {
        return "Title:" + title +
                "\nAuthor: " + author +
                "\nISBN: " + ISBN +
                "\nPrice: " + price + "\n";

    }

    String getBookDetails(String ISBN) {
        if (this.ISBN.equals(ISBN)) {

            return "Title:" + title +
                    "\nAuthor: " + author +
                    "\nISBN: " + ISBN +
                    "\nPrice: " + price + "\n";
        } else {
            System.out.println("Book with ISBN" + ISBN + "Not Found\n");
        }
        return ISBN;
    }
}
