package noodlesFactoryImpl;

import noodies.INoodles;

public class test {

    public static void main(String[] args) {
        System.out.println("===========================普通工厂方法==============================" +
                "\n 这种要多写一个类，不过更面向对象吧 = = ，实际中我更倾向于使用【模仿Executor类】的方式");
        NoodlesFactory factory1 = new GankouFactory();
        INoodles gk3 = factory1.create();
        gk3.desc();
    }
}
