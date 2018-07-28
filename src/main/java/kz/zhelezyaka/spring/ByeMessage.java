package kz.zhelezyaka.spring;

public class ByeMessage implements Message {
    private String text;

    public ByeMessage(String text) {
        this.text = "Bye " + text;
    }

    @Override
    public String getText() {
        return text;
    }
}
