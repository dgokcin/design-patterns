package behavioral.iterator.ex2;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the world in 80 days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));

        Iterator it = bookShelf.createIterator();
        Iterator itEven = new BookShelfEvenIterator(bookShelf);

        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }

        System.out.println("********");
        while (itEven.hasNext()) {
            Book book = (Book) itEven.next();
            System.out.println(book.getName());
        }
    }
}
