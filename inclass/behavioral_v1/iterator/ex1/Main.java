package behavioral.iterator.ex1;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("iterator Sample");
        Book b1 = new Book("Design Patterns");
        Book b2 = new Book("Software Engineering");
        Magazine m1 = new Magazine("Magazine 1");
        Magazine m2 = new Magazine("Magazine 2");

        MagazineStore ms = new MagazineStore();
        ms.addMagazine(m1);
        ms.addMagazine(m2);

        BookStore bs = new BookStore();
        bs.addBook(b1);
        bs.addBook(b2);

        Iterator bookIterator = bs.iterator();

        while (bookIterator.hasNext()) {
            Book book = (Book) bookIterator.next();
            System.out.println(book.getName());
        }

        System.out.println();
        Iterator<Magazine> magazineIterator = ms.iterator();

        while (magazineIterator.hasNext()) {
            //Magazine mag = (Magazine) magazineIterator.next();
            Magazine mag = magazineIterator.next();
            System.out.println(mag.getName());
        }
    }
}
