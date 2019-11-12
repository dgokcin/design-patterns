package behavioral.command;

import java.util.ArrayList;

//invoker
public class RemoteControl {
    private Command command;
    private ArrayList<Command> listOfCommands = new ArrayList<>();

    public void setCommand(Command command) {
        this.command = command;
    }

    public void appendCommand(Command command) {
        listOfCommands.add(command);
    }

    public void pressButton() {
        command.execute();
    }

    public void clearCommands(){
        listOfCommands.clear();
    }

    public void executeAllCommands() {
        System.out.println("Executing all commands...");
        for (Command c : listOfCommands) {
            c.execute();
        }
    }
}
