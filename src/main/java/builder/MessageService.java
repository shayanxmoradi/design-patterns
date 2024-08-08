package builder;

import FactoryMethod.Message;
import builder.telegram.TelegramBuilder;
import builder.telegram.TelegramMessage;

public class MessageService {

    void sendTextMessage( String message) {
        TelegramMessage build = TelegramMessage.builder().setText(message).build();
        System.out.println(build);
    }
    void sendAttatchment(Object attatchment) {
        TelegramMessage build = TelegramMessage.builder().setAttachment(attatchment).build();
        System.out.println(build);
    }
}
