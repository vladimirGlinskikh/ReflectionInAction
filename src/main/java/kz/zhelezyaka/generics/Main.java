package kz.zhelezyaka.generics;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Method getInternalListMethod =
                GenericsClass.class.getMethod("getInternalList", null);
        System.out.println(getInternalListMethod);

        Type getInternalListMethodGenericReturnType =
                getInternalListMethod.getGenericReturnType();
        if (getInternalListMethodGenericReturnType instanceof ParameterizedType) {
            ParameterizedType parameterizedType =
                    (ParameterizedType) getInternalListMethodGenericReturnType;
            Type[] typeArguments = parameterizedType.getActualTypeArguments();
            for (Type typeArgument :
                    typeArguments) {
                Class typeClass = (Class) typeArgument;
                System.out.println("typeArgument = " + typeArgument);
                System.out.println("typeClass = " + typeClass);
            }
        }
    }
}
