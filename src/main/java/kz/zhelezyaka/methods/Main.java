package kz.zhelezyaka.methods;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<String> stringClass = String.class;
        Method[] methods = stringClass.getMethods();
        System.out.println(Arrays.toString(methods));

        Method methodIndexOf = stringClass.getMethod("indexOf", String.class);
        System.out.println(methodIndexOf);

        for (Method method : methods) {
            System.out.println("**************************");
            System.out.println("name: " + method.getName());
            System.out.println("defaultValue: " + method.getDefaultValue());
            System.out.println("generic return type: " + method.getGenericReturnType());
            System.out.println("return type: " + method.getReturnType());
            System.out.println("modifiers: " + method.getModifiers());

            Parameter[] parameters = method.getParameters();
            System.out.println(parameters.length + " parameters:");

            for (Parameter parameter : parameters) {
                System.out.println("parameter name: " + parameter.getName());
                System.out.println("parameter type: " + parameter.getType());
            }

            Class<?>[] parameterTypes = method.getParameterTypes();
            System.out.println(Arrays.toString(parameterTypes) + " parameters:");

            for (Class<?> parameterType : parameterTypes) {
                System.out.println("parameter type name: " + parameterType.getName());
            }

            Class<?>[] exceptionTypes = method.getExceptionTypes();
            System.out.println(exceptionTypes.length + " exception types: ");

            for (Class<?> exceptionType : exceptionTypes) {
                System.out.println("exception name " + exceptionType.getName());
            }

            System.out.println("is accesible: " + method.isAccessible());
            System.out.println("is varArgs: " + method.isVarArgs());
        }
    }
}
