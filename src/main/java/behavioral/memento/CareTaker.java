package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

//caretaker object is responsible to restore object state from memento
//oconde mementocuklar, yani stateler var.
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}

