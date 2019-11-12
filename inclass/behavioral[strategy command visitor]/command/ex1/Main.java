package behavioral.command.ex1;

public class Main {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        Light light = new Light();
        light.setName("Xiaomi Yeelight ");

        light = new Light();
        light.setName("Philips Hue ");

        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);
        //switch on
        control.setCommand(lightsOn);
        control.pressButton();
        //switch off
        control.setCommand(lightsOff);
        control.pressButton();

        System.out.println("**********************");
        //////
        control.appendCommand(new LightOnCommand(light));
        control.appendCommand(new LightOffCommand(light));
        control.appendCommand(new LightOnCommand(light));
        control.appendCommand(new LightOffCommand(light));
        control.appendCommand(new LightOnCommand(light));
        control.appendCommand(new ChangeRedColorCommand(light));
        System.out.println("do some stuff and spend time around...");
        control.executeAllCommands();

        System.out.println("################################");
        control.setCommand(new MacroCommandThiefAlarm(light));
        control.pressButton();

        System.out.println(" ================================");
        control.setCommand(new LightDimCommand(light));
        control.pressButton();

        System.out.println("$$$$$$$");
        control.executeAllCommands();


        System.out.println("&%&%%+%&%+%&+^%^%%+%+%&%+&%+&%+&%+&");
        control.clearCommands();
        control.appendCommand(new LightOnCommand(light));
        control.appendCommand(new ChangeRedColorCommand(light));
        control.appendCommand(new LightDimCommand(light));
        control.appendCommand(new MacroCommandThiefAlarm(light));

        System.out.println("do some real work");
        System.out.println("time is come to push the button");
        control.setCommand(new LightDiscoCommand(light));
        control.pressButton();
        //control.executeAllCommands();
        System.out.println(":)");
    }
}
