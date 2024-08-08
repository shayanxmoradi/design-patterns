package builder.telegram;

public class TelegramBuilder {
    private String text;
    private Object attachment;

    public TelegramBuilder setText(String text) {
        this.text = text;
        return this;
    }

    public TelegramBuilder setAttachment(Object attachment) {
        this.attachment = attachment;
        return this;
    }

    public TelegramMessage build() {
        return new TelegramMessage(this);
    }

    public String getText() {
        return text;
    }

    public Object getAttachment() {
        return attachment;
    }
}
