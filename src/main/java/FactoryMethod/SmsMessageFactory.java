package FactoryMethod;

public class SmsMessageFactory extends MessageFactory{

    public Message createMessage(String content) {
        return new SmsMessage(content);
    }
}
