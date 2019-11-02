package behavioral.observer;

//observable interface yeni obs ekleme cikarma ve diger obslari haberleyebiliyor.
public interface Observable {
    void registerObserver (Observer observer);
    void removeObserver (Observer observer);
    void notifyObservers ();
}
