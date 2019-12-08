package behavioral.dependencyInjection.ex1.service;

public class WhatsappServiceImpl implements MessageService {
    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("WHATSAPP Message " + msg + " to " + rec);
    }
}
