package behavioral.command.ex1;

public class ChangeRedColorCommand implements Command {

    private Light light;

    public ChangeRedColorCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.changeColor("RED");
    }
}
