package cn.vpclub.javabasic.review.domain;

/**
 * <p>
 * Java基础回顾——匿名类
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/10/31 9:30
 */
public abstract class AnonymousClass {

    //姓名
    String name;

    //血量
    float hp;

    //护甲
    float armor;

    //移速
    int moveSpeed;

    //声明一个进行攻击的抽象方法
    public abstract void attack();

    public static void main(String[] args) {
        AnonymousClass anonymousClass = new AnonymousClass() {
            //当场实现attack的方法
            @Override
            public void attack() {
                System.out.println("新的进攻手段");
            }
        };
        anonymousClass.attack();
        System.out.println(anonymousClass);
    }
}
