package builder.whatsapp;

import builder.telegram.TelegramBuilder;

import java.sql.Time;

public class WhatsappMessageBuilder {
    private String text;
    private Time time;

    public WhatsappMessageBuilder setText(String text) {
        this.text = text;
        return this;
    }
    public WhatsappMessageBuilder setTime(Time time){
        this.time = time;
        return this;
    }

    public String getText() {
        return text;
    }

    public Time getTime() {
        return time;
    }

    public WhatsappMessage build() {
        return new WhatsappMessage(this);
    }
}
