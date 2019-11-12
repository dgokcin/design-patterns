package behavioral.state.ex1;

/**
 * Created by sasakiumi on 3/4/14.
 */
public class Main {
    public static void main(String[] args) {
        SafeFrame frame = new SafeFrame("state Sample");
        while (true) {
            for (int hour = 0; hour < 24; hour++) {
                frame.setClock(hour);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }
        }
    }
}
