package kz.zhelezyaka.constructors;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        //Class<String> stringGetClass = String.class;
        //Constructor<?>[] constructors = stringGetClass.getConstructors();
        Class<ConstructorExample> constructorExampleClass = ConstructorExample.class;
        Constructor<?>[] constructors = constructorExampleClass.getConstructors();
        System.out.println(constructors);

        for (Constructor<?> constructor : constructors) {
            System.out.println("*******************************");
            int numberParams = constructor.getParameterCount();
            System.out.println("constructor " + constructor.getName());
            System.out.println("number of arguments " + numberParams);

            int modifiersConstructor = constructor.getModifiers();
            System.out.println("modifiers " + modifiersConstructor);

            Parameter[] parameters = constructor.getParameters();
            Annotation[] annotations = constructor.getAnnotations();
            System.out.println("parameters: " + parameters.length);
            System.out.println("annotations: " + annotations.length);
        }
    }
}
