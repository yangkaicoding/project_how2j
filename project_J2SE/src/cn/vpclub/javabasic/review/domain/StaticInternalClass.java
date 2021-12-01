package cn.vpclub.javabasic.review.domain;

/**
 * <p>
 * Java基础回顾——静态内部类
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/10/30 19:56
 */
public class StaticInternalClass {
    /**
     * 技巧： 静态内部类与非静态内部类不同的地方在于，静态内部类不需要一个外部类的实例为基础，可以直接实例化
     *       因为没有一个外部类的实例，所以静态内部类里面不可以访问外部类的实例属性和方法,除非外部类的实例属性和方法均为静态的
     * 语法：new 外部类.静态内部类()
     */

    //名称
    public String name;

    //血量
    protected float hp;

    //声明一个游戏胜利的方法
    private static void victory() {
        System.out.println("游戏胜利");
    }

    //声明一个静态类别类敌方水晶
    static class EnemyCrystal {
        int hp = 5000;

        //声明一个宣布游戏胜利的方法
        public void checkIfVictory() {
            if (hp == 0) {
                StaticInternalClass.victory();
                //静态内部类不能直接访问外部类的对象属性
                //System.out.println(name + "获得游戏胜利");
            }
        }
    }

    public static void main(String[] args) {
        //实例化静态内部类
        StaticInternalClass.EnemyCrystal crystal = new StaticInternalClass.EnemyCrystal();
        crystal.checkIfVictory();


    }
}
