package designPatterns.decorator;

public class ConcreteComponent implements Component{
    @Override
    public void sampleOperation() {
        System.out.println("具体构建角色");
        //TODO 相关业务代码
    }
}
