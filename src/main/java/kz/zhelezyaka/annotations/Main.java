package kz.zhelezyaka.annotations;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Class<ReflectableClass> object = ReflectableClass.class;
        Annotation[] annotations = object.getAnnotations();
        for (Annotation annotation :
                annotations) {
            System.out.println(annotation);
        }

        if (object.isAnnotationPresent(Reflectable.class)) {
            Annotation annotation = object.getAnnotation(Reflectable.class);
            System.out.println(annotation + " present in class " +
                    object.getClass());
            System.out.println(annotation + " present in class " +
                    object.getTypeName());
        }
    }
}
