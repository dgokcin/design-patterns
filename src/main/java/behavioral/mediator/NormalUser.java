package behavioral.mediator;

public class NormalUser extends User{
    public NormalUser(Mediator mediator, String name) {
        super(mediator, name);
    }

    //userin send message i mediatorunun uzerinden mesaj yolluyor.
    @Override
    public void sendMessage(String message) {
        System.out.println("This is the normal user sending the message");
        this.mediator.send(this, message);
    }
}
