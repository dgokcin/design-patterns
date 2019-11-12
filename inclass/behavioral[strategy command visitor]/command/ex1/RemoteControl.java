package behavioral.command.ex1;

import java.util.ArrayList;

//Invoker
public class RemoteControl {
    private Command command;
    private ArrayList<Command> listOfCommands = new ArrayList<>();

    public void setCommand(Command command) {
        this.command = command;
    }

    public void appendCommand(Command c) {
        listOfCommands.add(c);
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
