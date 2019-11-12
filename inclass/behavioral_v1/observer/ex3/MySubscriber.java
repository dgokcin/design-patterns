package behavioral.observer.ex3;

import java.util.concurrent.Flow;

public class MySubscriber<T> implements Flow.Subscriber<T> {

    private Flow.Subscription subscription;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        this.subscription.request(1); //  Ask for initial one data object.
    }

    @Override
    public void onNext(T item) {
        System.out.println(item); // Print it.
        subscription.request(1); // Ask for one more.
    }

    @Override
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
    }

    @Override
    public void onComplete() {
        System.out.println("DONE"); // Done with the stream of data.
    }
}