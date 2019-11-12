package behavioral.mediator.ex1;

public class NormalUser extends User {
    public NormalUser(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String message) {
        this.mediator.send(this, message);
    }
}
