package behavioral.iterator.ex1;

import java.util.Iterator;

public class MagazineIterator implements Iterator<Magazine> {
    private MagazineStore magazineStore;
    private int index;

    public MagazineIterator(MagazineStore magazineStore) {
        this.magazineStore = magazineStore;
        this.index = 0;
    }


    @Override
    public boolean hasNext() {
        return magazineStore.getSize() > index;
    }

    @Override
    public Magazine next() {
        Magazine mg = magazineStore.getMagazineAt(this.index);
        index++;
        return mg;
    }
}
