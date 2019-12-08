package behavioral.dependencyInjection.ex1.injector;


import behavioral.dependencyInjection.ex1.consumer.Consumer;
import behavioral.dependencyInjection.ex1.consumer.MyDIApplication;
import behavioral.dependencyInjection.ex1.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new SMSServiceImpl());
    }

}
