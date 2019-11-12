package behavioral.mediator.ex1;

public class AdminUser extends User {
    public AdminUser(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("admin specific actions...");
        this.mediator.send(this, message);
    }
}
