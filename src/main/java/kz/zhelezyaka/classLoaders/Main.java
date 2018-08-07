package kz.zhelezyaka.classLoaders;

import kz.zhelezyaka.annotations.ReflectableClass;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);
        ClassLoader classLoader = ReflectableClass.class.getClassLoader();
        System.out.println(classLoader);

        Class<?> reflectableClassInstanceForName = Class
                .forName("kz.zhelezyaka.constructors.ConstructorExample", true, systemClassLoader);
        System.out.println(reflectableClassInstanceForName);
    }
}
