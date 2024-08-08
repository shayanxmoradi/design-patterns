package builder;

import builder.telegram.TelegramBuilder;
import builder.telegram.TelegramMessage;
import builder.whatsapp.WhatsappMessage;
import builder.whatsapp.WhatsappMessageBuilder;

import java.sql.Time;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        TelegramMessage telegramMessage = TelegramMessage.builder()
                .setText("this is test")
                .setAttachment(new Object())
                .build();
        System.out.println(telegramMessage);

        WhatsappMessage whatsappMessage = WhatsappMessage.builder()
                .setText("whatsapp message")
                .setTime(Time.valueOf(LocalTime.now()))
                .build();
        System.out.println(whatsappMessage.toString());

        MessageService messageService = new MessageService(new TelegramBuilder());
        messageService.sendTextMessage("telegram message");
        messageService.sendAttatchment(new Object());



    }
}
