package behavioral.mediator;

public class AdminUser extends User{

    public AdminUser(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("This is the admin user sending the message");
        this.mediator.send(this, message);
    }

}
