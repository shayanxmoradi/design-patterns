package FactoryMethod;

public class SmsMessage extends Message{
    private String phoneNumber;
    private String content;
    public SmsMessage( String content) {
        this.content = content;
    }


}
