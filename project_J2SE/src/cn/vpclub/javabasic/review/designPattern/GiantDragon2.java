package cn.vpclub.javabasic.review.designPattern;

/**
 * <p>
 * Java基础回顾——饿汉式单例模式
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/10/30 11:06
 */
public class GiantDragon2 {

    //1.私有化构造方法，使得外部无法通过new关键字进行实例化对象
    private GiantDragon2() {

    }

    //2.设置静态属性，并将静态属性指向一个实例化对象
    private static GiantDragon2 instance = new GiantDragon2();

    //3.public static 的getInstance()方法，返回实例化的对象
    public static GiantDragon2 getInstance() {
        return instance;
    }
}
