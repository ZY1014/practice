package designPatterns.factory;

public class Test {
    public static void main(String[] args) {
        Factory circleFactory = new CircleFactory();
        Shape shape = circleFactory.getShape();
        shape.draw();
    }


}
