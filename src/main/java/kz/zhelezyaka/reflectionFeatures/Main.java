package kz.zhelezyaka.reflectionFeatures;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Main {
    public static void main(String[] args) {
        Class<String> stringClass = String.class;
        for (Method methodStringClass :
                stringClass.getDeclaredMethods()) {
            System.out.println("method " + methodStringClass.getName());
            for (Parameter paramMethodStringClass :
                    methodStringClass.getParameters()) {
                System.out.println(" parameter name " + paramMethodStringClass.getName());
                System.out.println(" parameter type " + paramMethodStringClass.getType());
            }
        }
    }
}
