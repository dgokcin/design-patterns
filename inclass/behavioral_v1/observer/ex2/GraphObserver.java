package behavioral.observer.ex2;

/**
 * Created by sasakiumi on 3/2/14.
 */
public class GraphObserver implements Observer {
    @Override
    public void update(int number) {
        System.out.print("GraphObserver => ");
        int count = number;
        for (int i = 0; i < count; i++) {
            System.out.print("*");
            if (i % 2 == 1)
                System.out.print(" ");
        }
        System.out.println();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
    }
}
