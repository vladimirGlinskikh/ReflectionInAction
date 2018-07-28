package kz.zhelezyaka.spring;

public class MessageRendererStandartImpl implements MessageRenderer {
    //    private String text;
    private Message message;

//    public MessageRenderer(String text) {
//        this.text = text;
//    }


    public MessageRendererStandartImpl(Message message) {
        this.message = message;
    }

    public void printMessage() {
//        System.out.println(text);
        System.out.println(message.getText());
    }
}
