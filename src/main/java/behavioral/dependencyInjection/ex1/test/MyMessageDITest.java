package behavioral.dependencyInjection.ex1.test;

import behavioral.dependencyInjection.ex1.consumer.Consumer;
import behavioral.dependencyInjection.ex1.injector.EmailServiceInjector;
import behavioral.dependencyInjection.ex1.injector.MessageServiceInjector;
import behavioral.dependencyInjection.ex1.injector.SMSServiceInjector;
import behavioral.dependencyInjection.ex1.injector.WhatsappInjector;

public class MyMessageDITest {

    public static void main(String[] args) {
        String msg = "Hi Pankaj";
        String email = "pankaj@abc.com";
        String phone = "4088888888";
        Consumer app;

        //Send email
        MessageServiceInjector injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, email);

        //Send SMS
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, phone);

        //Send Whatsapp
        injector = new WhatsappInjector();
        app = injector.getConsumer();
        app.processMessages(msg, phone);

    }
}
