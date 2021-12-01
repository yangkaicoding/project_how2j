package cn.vpclub.javabasic.review.domain;

/**
 * <p>
 * Java基础回顾——多态
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/10/30 15:43
 */
public class LifePotion extends Item {

    //重写父类的方法
    @Override
    public void effect() {
        System.out.println("血瓶使用后，可以回复血量");
    }
}
