package behavioral.iterator.ex1;

import java.util.Iterator;

public class BookStoreIterator implements Iterator {

    private BookStore bookStore;
    private int index;

    public BookStoreIterator(BookStore bookStore) {
        this.bookStore = bookStore;
        this.index = 0;
    }


    @Override
    public boolean hasNext() {
        return bookStore.getSize() > index;
    }

    @Override
    public Object next() {
        Object book = bookStore.getBookAt(this.index);
        index++;
        return book;
    }
}
