package kz.zhelezyaka.constructors;

public class ConstructorExample {
    private int a;
    private String b;
    private boolean c;

    public ConstructorExample() {
    }

    public ConstructorExample(int a) {
        this.a = a;
    }

    public ConstructorExample(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public ConstructorExample(int a, String b, boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
