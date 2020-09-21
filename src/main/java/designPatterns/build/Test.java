package designPatterns.build;

public class Test {
    public static void main(String[] args) {
        Builder builder = new AssemblerBuilder();
        Director director = new Director(builder);
        Computer computer = director.createComputer("Intel 酷睿i9 7900X", "三星M9T 2TB （HN-M201RAD）",
                "技嘉AORUS Z270X-Gaming 7", "科赋Cras II 红灯 16GB DDR4 3000");
        System.out.println(computer.toString());
    }
}
