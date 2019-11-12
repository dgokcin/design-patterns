package behavioral.iterator.ex1;

import java.util.ArrayList;
import java.util.Iterator;

public class BookStore implements Iterable {

    private ArrayList<Book> books = new ArrayList<Book>();

    public BookStore() {
        System.out.println("BookStore initialized");
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public int getSize() {
        return books.size();
    }

    public Object getBookAt(int index) {
        return books.get(index);
    }

    @Override
    public Iterator iterator() {
        return new BookStoreIterator(this);
    }
}
