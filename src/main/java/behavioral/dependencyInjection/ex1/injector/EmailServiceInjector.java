package behavioral.dependencyInjection.ex1.injector;


import behavioral.dependencyInjection.ex1.consumer.Consumer;
import behavioral.dependencyInjection.ex1.consumer.MyDIApplication;
import behavioral.dependencyInjection.ex1.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        MyDIApplication app = new MyDIApplication();
        app.setService(new EmailServiceImpl());
        return app;
    }

}
