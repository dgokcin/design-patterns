package behavioral.command.ex1;

public class LightDimCommand implements Command {

    private Light light;

    public LightDimCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.setBrightness("DIM!");
    }
}
