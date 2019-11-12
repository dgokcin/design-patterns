package behavioral.observer.ex2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by sasakiumi on 3/2/14.
 */
public abstract class NumberGenerator {
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        Iterator it = observers.iterator();
        while (it.hasNext()) {
            Observer o = (Observer) it.next();
            o.update(this.getNumber());
        }
    }

    public abstract int getNumber();

    public abstract void execute();
}
