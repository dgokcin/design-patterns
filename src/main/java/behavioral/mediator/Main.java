package behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mediator Pattern Sample");
        Mediator m = new MediatorImpl();
        User nu = new NormalUser(m, "User");
        User au = new AdminUser(m, "Admin");

        nu.sendMessage("Hello from normal user");
        au.sendMessage("Welcome from admin user");
    }
}
