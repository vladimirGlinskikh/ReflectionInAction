package kz.zhelezyaka.dinamicProxies;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HandlerImpl implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("using proxy " + proxy.getClass().getName());
        System.out.println("method " + method.getName() + " from interface " + method.getDeclaringClass().getName());

        if (method.getDeclaringClass().getName().equals("kz.zhelezyaka.dinamicProxies.InformationInterface")) {
            InformationClass informationImpl = InformationClass.class.newInstance();
            return method.invoke(informationImpl, args);
        }
        return null;
    }
}
