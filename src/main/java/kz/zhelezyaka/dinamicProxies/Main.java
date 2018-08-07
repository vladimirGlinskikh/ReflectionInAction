package kz.zhelezyaka.dinamicProxies;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        InvocationHandler myHandler = new HandlerImpl();
        System.out.println(myHandler);

        InformationInterface proxy = (InformationInterface) Proxy.newProxyInstance(InformationInterface.class
                .getClassLoader(), new Class[]{InformationInterface.class}, myHandler);
        System.out.println(proxy.getInfo());
    }
}
