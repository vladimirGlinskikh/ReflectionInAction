package kz.zhelezyaka.enums;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) {
        ExampleEnum value = ExampleEnum.FOUR;
        System.out.println("isEnum: " + value.getClass().isEnum());

        ExampleEnum[] enums = value.getClass().getEnumConstants();
        for (ExampleEnum exampleEnum : enums) {
            System.out.println("enum constant: " + exampleEnum);
        }

        Field[] fields = value.getClass().getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f.getName() + " " + f.isEnumConstant());
        }
    }
}
