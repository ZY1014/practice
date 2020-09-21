package designPatterns.proxy;

import java.lang.reflect.Proxy;

public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("before");
                    Object invoke = method.invoke(target, args);
                    System.out.println("after");
                    return invoke;
                });
    }

}
