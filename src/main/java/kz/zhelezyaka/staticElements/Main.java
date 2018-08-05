package kz.zhelezyaka.staticElements;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        System.out.println("directly: " + StaticReflection.StaticExample.class.getName());
        Class<?> forName = Class.forName("kz.zhelezyaka.staticElements.StaticReflection$StaticExample");
        System.out.println(forName);

        //throws exception
//        Class<?> forNameOne = Class.forName("kz.zhelezyaka.staticElements.StaticReflection.StaticExample");
//        System.out.println(forNameOne);

        Class<?>[] classes = StaticReflection.class.getDeclaredClasses();
        for (Class<?> classOne :
                classes) {
            System.out.println("iterating through declared classes: " + classOne.getName());
        }

        Method mathMethod = Math.class.getDeclaredMethod("round", double.class);
        System.out.println(mathMethod);

        Object result = mathMethod.invoke(null, new Double(36.6));
        System.out.println(result);

        Field counterField = Counter.class.getDeclaredField("aLong");
        System.out.println(counterField.get(null));
    }
}
