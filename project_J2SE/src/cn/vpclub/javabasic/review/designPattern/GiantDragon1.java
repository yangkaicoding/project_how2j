package cn.vpclub.javabasic.review.designPattern;

/**
 * <p>
 * Java基础回顾——懒汉式单例模式
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/10/30 10:32
 */
public class GiantDragon1 {
    /**
     * 技巧：单例模式三要素：1 构造方法私有化
     *                      2 静态属性指向实例
     *                     3 public static的getInstance()方法，返回第二步的静态属性
     */

    //1.私有化构造方法使得该类无法再外部通过new关键字实例化
    private GiantDragon1() {

    }

    //2.设置静态属性，并将静态属性指向一个实例化对象，暂时指向为Null
    private static GiantDragon1 instance;

    //3.public static 的getInstance()方法，返回实例对象
    public static GiantDragon1 getInstance() {
        //第一次访问时，发现instance没有指向任何对象，此时实例化一个对象
        if (null == instance) {
            instance = new GiantDragon1();
        }
        //返回instance指向的对象
        return instance;
    }








}
