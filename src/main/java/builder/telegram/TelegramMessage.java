package builder.telegram;

public class TelegramMessage {
    private String text;
    private Object attachment;
    protected TelegramMessage(TelegramBuilder builder ) {
       this.text = builder.getText();
       this.attachment = builder.getAttachment();
    }
    public static TelegramBuilder builder() {
        return new TelegramBuilder() ;
    }

    @Override
    public String toString() {
        return "TelegramMessage{" +
               "text='" + text + '\'' +
               ", attachment=" + attachment +
               '}';
    }
}
