package behavioral.command.ex1;

public class LightDiscoCommand implements Command {

    private Light light;

    public LightDiscoCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.discoTime();
    }
}
