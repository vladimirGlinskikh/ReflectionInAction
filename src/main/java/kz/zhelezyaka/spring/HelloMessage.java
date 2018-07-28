package kz.zhelezyaka.spring;

public class HelloMessage implements Message {
    private String text;

    public HelloMessage(String text) {
        this.text = "Hello " + text;
    }

    @Override
    public String getText() {
        return text;
    }
}
