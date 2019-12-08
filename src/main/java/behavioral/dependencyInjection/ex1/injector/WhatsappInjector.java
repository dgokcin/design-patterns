package behavioral.dependencyInjection.ex1.injector;

import behavioral.dependencyInjection.ex1.consumer.Consumer;
import behavioral.dependencyInjection.ex1.consumer.MyDIApplication;
import behavioral.dependencyInjection.ex1.service.WhatsappServiceImpl;

public class WhatsappInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new WhatsappServiceImpl());
    }
}
