package q1;

public class LibrarySystem {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming","James Gosling");
        Book book2 = new Book("Data Structure","Mark Allen weiss","ISBN12345");
        Book book3 = new Book("African intelijence","kamal silva","ISBN98765",4500.0);

        System.out.println("Book 1 Details");
        System.out.println(book1.getBookDetails());
        System.out.println("Book 2 Details");
        System.out.println(book2.getBookDetails());
        System.out.println("Book 3 Details");
        System.out.println(book3.getBookDetails());

        System.out.println("Search by ISBN");
        System.out.println(book3.getBookDetails("ISBN98761"));
        System.out.println(book2.getBookDetails("ISBN98765"));
    }
}
