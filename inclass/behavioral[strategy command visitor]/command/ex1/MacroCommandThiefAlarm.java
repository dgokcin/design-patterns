package behavioral.command.ex1;

import java.util.ArrayList;
import java.util.List;

public class MacroCommandThiefAlarm implements Command {

    List<Command> macro = new ArrayList<>();
    private Light light;

    public MacroCommandThiefAlarm(Light light) {
        this.light = light;
        macro.add(new LightOnCommand(light));
        macro.add(new ChangeRedColorCommand(light));
        macro.add(new LightOffCommand(light));
        macro.add(new LightOnCommand(light));
        macro.add(new ChangeRedColorCommand(light));
    }

    public void clearMacro() {
        macro.clear();
    }

    @Override
    public void execute() {
        for (Command c : macro) {
            c.execute();
        }
    }
}
