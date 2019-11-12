package behavioral.observer.ex2;

/**
 * Created by sasakiumi on 3/2/14.
 */
public class DigitObserver implements Observer {
    @Override
    public void update(int number) {
        System.out.println("DigitObserver => " + number);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
    }
}
