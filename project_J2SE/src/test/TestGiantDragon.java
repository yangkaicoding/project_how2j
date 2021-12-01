package test;

import cn.vpclub.javabasic.review.designPattern.GiantDragon1;

/**
 * <p>
 * Java基础回顾——测试单例模式
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/10/30 10:48
 */
public class TestGiantDragon {
    public static void main(String[] args) {
        /**
         * 1.测试懒汉式单例模式
         */
        //外部通过new关键字实例化对象会报错
        // GiantDragon1 dragon = new GiantDragon1();

        //只能通过getInstance()方法得到对象
        GiantDragon1 g1 = GiantDragon1.getInstance();
        GiantDragon1 g2 = GiantDragon1.getInstance();

        //获得的对象都是同一个对象
        System.out.println(g1);
        System.out.println(g2);


        /**
         * 2.测试饿汉式的单例模式
         */
        //外部通过new关键字实例化对象会报错
        // GiantDragon2 dragon = new GiantDragon2();

        //只能通过getInstance()方法得到对象
        GiantDragon1 g3 = GiantDragon1.getInstance();
        GiantDragon1 g4 = GiantDragon1.getInstance();

        //获得的对象都是同一个对象
        System.out.println(g3);
        System.out.println(g4);
    }
}
