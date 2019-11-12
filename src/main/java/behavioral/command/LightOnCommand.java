package behavioral.command;

//concrete command
public class LightOnCommand implements Command{
    //reference to the light
    Light light;
    //constructor
    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.switchOn();
        light.changeColor("White");
    }
}
