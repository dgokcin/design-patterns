package behavioral.iterator.ex1;

import java.util.ArrayList;
import java.util.Iterator;

public class MagazineStore implements Iterable {

    private ArrayList<Magazine> magazines = new ArrayList<Magazine>();

    public MagazineStore() {
        System.out.println("MagazineStore initialized");
    }

    public void addMagazine(Magazine b) {
        magazines.add(b);
    }

    public int getSize() {
        return magazines.size();
    }

    public Magazine getMagazineAt(int index) {
        return magazines.get(index);
    }

    @Override
    public Iterator iterator() {
        return new MagazineIterator(this);
    }
}
