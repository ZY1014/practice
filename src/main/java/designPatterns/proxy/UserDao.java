package designPatterns.proxy;

public class UserDao implements IUserDao{
    @Override
    public void save() {
        System.out.println("user dao save");
    }
}
