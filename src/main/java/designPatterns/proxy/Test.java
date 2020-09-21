package designPatterns.proxy;

public class Test {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        ProxyFactory proxyFactory = new ProxyFactory(userDao);
        IUserDao proxyInstance = (IUserDao)proxyFactory.getProxyInstance();
        proxyInstance.save();
    }
}
