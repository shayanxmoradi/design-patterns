package builder;

import FactoryMethod.Message;
import builder.telegram.TelegramBuilder;
import builder.telegram.TelegramMessage;

public class MessageService {
    private final TelegramBuilder telegramBuilder;
    public MessageService(TelegramBuilder telegramBuilder) {
        this.telegramBuilder = telegramBuilder;
    }
    void sendTextMessage( String message) {
        TelegramMessage build = telegramBuilder.setText(message).build();
        System.out.println(build);
    }
    void sendAttatchment(Object attatchment) {
        TelegramMessage build = telegramBuilder.setAttachment(attatchment).build();
        System.out.println(build);
    }
}
