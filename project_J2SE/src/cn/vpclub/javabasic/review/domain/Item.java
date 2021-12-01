package cn.vpclub.javabasic.review.domain;

/**
 * <p>
 * Java基础回顾——多态
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/10/30 15:38
 */
public abstract class Item {

    /**
     * 技巧：类的多态条件 1：父类(接口)的引用指向子类的对象
     *                   2：调用的方法有重写
     */

    //设置名称属性
    String name;
    //设置价格属性
    int price;

    //声明购买物品的方法
    public void buy() {
        System.out.println("购买物品成功");
    }

    //声明物品增益的方法
    public void effect() {
        System.out.println("物品使用后，获得相应的增益效果");
    }

    public static void main(String[] args) {
        //父类的引用指向子类的对象
        Item i1 = new LifePotion();
        Item i2 = new MagicPotion();

        System.out.print("i1 是Item类型，执行effect()方法打印：");
        i1.effect();
        System.out.print("i2 是Item类型，执行effect()方法打印：");
        i2.effect();

    }
}
