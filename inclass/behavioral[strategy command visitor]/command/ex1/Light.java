package behavioral.command.ex1;

//Receiver
public class Light {
    private boolean on;
    private String name;
    private String brightness;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void switchOn() {
        System.out.println(name + "light switch ON");
        on = true;
    }

    public void switchOff() {
        System.out.println(name + "light switch OFF!");
        on = false;
    }

    public void discoTime(){
        System.out.println("DISCO DISCO....");
        System.out.println("DISCO DISCO....");
        System.out.println("DISCO DISCO....");
        System.out.println("DISCO DISCO....");
    }

    public String getBrightness() {
        return brightness;
    }

    public void setBrightness(String brightness) {
        this.brightness = brightness;
        System.out.println(name + "light brightness level is changed to " + brightness);
    }

    public void changeColor(String colorName) {
        System.out.println(name + "light new color is " + colorName);
    }
}
