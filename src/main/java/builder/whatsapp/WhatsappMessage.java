package builder.whatsapp;

import java.sql.Time;

public class WhatsappMessage {
    private String text;
    private Time time;
    public WhatsappMessage(WhatsappMessageBuilder whatsappMessageBuilder) {
        this.text = whatsappMessageBuilder.getText();
        this.time = whatsappMessageBuilder.getTime();

    }



    public static WhatsappMessageBuilder builder() {
        return new WhatsappMessageBuilder();
    }

    @Override
    public String toString() {
        return "WhatsappMessage{" +
               "text='" + text + '\'' +
               ", time=" + time +
               '}';
    }
}
