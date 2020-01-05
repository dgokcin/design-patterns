package behavioral.iterator.ex1;

public class BookShelfEvenIterator implements Iterator {

    private BookShelf bookShelf;
    private int index;

    public BookShelfEvenIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index + 1 < bookShelf.getLength();
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(this.index);
        index += 2;
        return book;
    }

}

