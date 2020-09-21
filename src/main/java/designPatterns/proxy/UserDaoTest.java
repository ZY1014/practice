package designPatterns.proxy;

public class UserDaoTest implements IUserDao{
    @Override
    public void save() {
        System.out.println("user dao save test");
    }
}
