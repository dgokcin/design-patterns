package behavioral.mediator;

import java.util.Date;

//concrete mediator
public class MediatorImpl implements Mediator {

    @Override
    public void send(User fromUser, String message) {
        System.out.println(new Date().toString() + " [" + fromUser.getName() + "] : " + message);
    }
}
