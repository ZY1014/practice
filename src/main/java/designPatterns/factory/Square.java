package designPatterns.factory;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("draw square");
    }

    public Square() {
    }


}
