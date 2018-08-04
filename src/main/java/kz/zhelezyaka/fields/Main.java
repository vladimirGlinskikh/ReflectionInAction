package kz.zhelezyaka.fields;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String stringer = "I love programming at Java!";
        Class<String> stringClass = String.class;
        Field[] fields = stringClass.getDeclaredFields();

        for (Field field : fields) {
            System.out.println("*****************************");
            System.out.println("Name: " + field.getName());
            System.out.println("Type: " + field.getType());

            if (field.isAccessible()) {
                System.out.println("Get: " + field.get(stringer));
                System.out.println("Get boolean: " + field.getBoolean(stringer));
            }
            System.out.println("Modifiers: " + field.getModifiers());
            System.out.println("isAccessible: " + field.isAccessible());

            Field fieldHashCode = stringClass.getDeclaredField("hash");
            fieldHashCode.setAccessible(true);
            Object value = fieldHashCode.get(stringer);
            int valueInt = fieldHashCode.getInt(stringer);
            System.out.println(value);
            System.out.println(valueInt);
        }
    }
}
