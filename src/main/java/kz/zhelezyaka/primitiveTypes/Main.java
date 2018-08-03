package kz.zhelezyaka.primitiveTypes;

public class Main {
    public static void main(String[] args) {

        Class<Integer> integerClass = int.class;
        System.out.println("is primitive: " + integerClass.isPrimitive());
    }
}
