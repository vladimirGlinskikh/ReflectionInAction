package kz.zhelezyaka.demo;

public class SomeClass {
    public int someField;
    public String someString;
    private String somePrivate;
    public boolean someBoolean;

    public String getSomePrivate() {
        return somePrivate;
    }

    @Override
    public String toString() {
        return "SomeClass{" +
                "someField=" + someField +
                ", someString='" + someString + '\'' +
                ", somePrivate='" + somePrivate + '\'' +
                ", someBoolean=" + someBoolean +
                '}';
    }
}
