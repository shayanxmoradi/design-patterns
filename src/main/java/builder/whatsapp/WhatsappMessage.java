package builder.whatsapp;

import java.sql.Time;

public class WhatsappMessage {
    private String text;
    private Time time;
    public WhatsappMessage(WhatsappMessageBuilder builder) {
        this.text = builder.getText();
        this.time = builder.getTime();

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
