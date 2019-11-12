package behavioral.observer.ex3;
//https://dev.to/ajiteshtiwari/java-9-flow-api-4e38

import java.util.List;
import java.util.concurrent.SubmissionPublisher;

public class Main {

    public static void main(String[] args) {
        List<String> items = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9");
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
        publisher.subscribe(new MySubscriber<>());

        items.forEach(s -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            publisher.submit(s);
        });

        publisher.close();
    }
}
