package behavioral.dependencyInjection.ex1.injector;

import behavioral.dependencyInjection.ex1.consumer.Consumer;

public interface MessageServiceInjector {

    Consumer getConsumer();
}
