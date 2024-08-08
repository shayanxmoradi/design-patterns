package FactoryMethod;

public class MessageService {
    private final MessageFactory messageFactory;
    public MessageService(MessageFactory messageFactory) {
        this.messageFactory = messageFactory;
    }
    void sendMessage(String message) {

        System.out.println("Sending Message: " + messageFactory.createMessage(message));
    }

}