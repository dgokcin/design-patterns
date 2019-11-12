package behavioral.command;

//Concrete command
public class LightOffCommand implements Command{
    //reference to the light
    Light light;
    //constructor
    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.switchOff();
        light.changeColor("White");
    }
}
