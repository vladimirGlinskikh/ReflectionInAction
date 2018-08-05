package kz.zhelezyaka.gettersAndSetters;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Car car = new Car("vw golf", 350, 1993);
        Method[] methods = car.getClass().getDeclaredMethods();

        for (Method method :
                methods) {
            if (method.getName().startsWith("get")) {
                System.out.println(method.invoke(car));
            }
        }
        for (Method method :
                methods) {
            if (method.getName().startsWith("set")) {
                method.invoke(car, "destroed");
            }
        }
        for (Method method :
                methods) {
            if (method.getName().startsWith("get")) {
                System.out.println(method.invoke(car));
            }
        }
    }
}
